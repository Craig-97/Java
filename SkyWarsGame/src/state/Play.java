package state;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import main.GUI;
import main.GameRun;
import main.SkyGrid;
import net.miginfocom.swing.MigLayout;
import strategy.OffensiveStrategy;
import strategy.DefensiveStrategy;

import sun.audio.*;
import java.io.*;

public class Play implements State {
	
	private JPanel contentPane, controlPanel, skyPanel;
	private JButton btnMove, btnUndo;
	private JRadioButton rdbtnDefensive, rdbtnOffensive;
	private ButtonGroup buttonGroup;
	private static JButton btnPlaySound;
	
	private SkyGrid[][] skyTiles = new SkyGrid[4][4];

	
	public Play() {}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public JPanel run(final GUI gui) {
		// Set the next State to End
		gui.setGameState(new End());
		
		contentPane = new JPanel();
		skyPanel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
	    	protected void paintComponent(Graphics g) {
	    		super.paintComponent(g);
	    		
	    		// Draw the background image
	    		g.drawImage(gui.getSkyImage(), 0, 0, null);
	    	}
	    };
	    
	    // Setup the contentPane
	    contentPane.setSize(661, 457);
	    gui.setSize(670, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new MigLayout("", "[][][][]", "[][]"));
        contentPane.add(skyPanel, "cell 1 0,gapx 30px,aligny top");
        
        // ButtonGroup for Passive & Aggressive Radio Buttons
        buttonGroup = new ButtonGroup();
        
        
        // Setup Sky
        skyPanel.setLayout(new GridLayout(4, 4, 0, 0));
        skyPanel.setPreferredSize(new Dimension(400, 400));
        controlPanel = new JPanel();
        contentPane.add(controlPanel, "cell 3 0,aligny center");
        
        // Passive Radio Button
        rdbtnDefensive = new JRadioButton("Defensive");
        rdbtnDefensive.addItemListener(passiveSelected());
        rdbtnDefensive.setSelected(true);
        
        // Aggressive Radio Button
        rdbtnOffensive = new JRadioButton("Offensive");
        rdbtnOffensive.addItemListener(aggressiveSelected());
        buttonGroup.add(rdbtnDefensive);
        buttonGroup.add(rdbtnOffensive);        
        
        // Setup the controlPanel
        controlPanel.setLayout(new MigLayout("", "[]", "[][][]"));
        controlPanel.add(new JLabel("Select Operational Mode"), "cell 0 0,gapy 20px");
        controlPanel.add(rdbtnDefensive, "cell 0 1");
        controlPanel.add(rdbtnOffensive, "cell 0 2");
        
        // Move Button
        btnMove = new JButton("Move");
        contentPane.add(btnMove, "flowx,cell 1 1,alignx center,aligny center");
        
        // Undo Button
        btnUndo = new JButton("Undo");
        contentPane.add(btnUndo, "cell 1 1");
        btnUndo.addActionListener(undoClick());
        btnUndo.setEnabled(false);
        
        // Play Sound Button
        btnPlaySound = new JButton("Play Sound");
        contentPane.add(btnPlaySound, "cell 3 1,alignx right");
        btnPlaySound.addActionListener(new AL());

        btnMove.addActionListener(moveClick());
        for (int x=0; x<4; x++) {
        	for (int y=0; y<4; y++) {
        		skyTiles[x][y] = new SkyGrid(GameRun.getGame(), new Point(x, y));
        		GameRun.getGame().addObserver(skyTiles[x][y]);
        		skyPanel.add(skyTiles[x][y]);
        	}
        }

        return contentPane;
	}
	
	// Passive Radio Button itemStateChanged
	private ItemListener passiveSelected() {
		return new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					System.out.println("Defensive checked");
					GameRun.getGame().setOperationalStrategy(new DefensiveStrategy());
				}
			}
		};
	}
	
	// Aggressive Radio Button itemStateChanged
	private ItemListener aggressiveSelected() {
		return new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					System.out.println("Offensive checked");
					GameRun.getGame().setOperationalStrategy(new OffensiveStrategy());
				}
			}
		};
	}
	
	// Move ActionListener
	private ActionListener moveClick() {
		return new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GameRun.getGame().move();
        		btnUndo.setEnabled(true);
        	}
        };
	}
	
	// Undo ActionListener
	private ActionListener undoClick() {
		return new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GameRun.getGame().undo();
        		
        		// Check if undo commands are available
        		if (!GameRun.getGame().isUndoAvailable())
        			btnUndo.setEnabled(false);
        	}
        };
	}
	
	//allows actionlistener to be used for music class
	public static class AL implements ActionListener{
		public final void actionPerformed(ActionEvent e){
		music();
		}
		}
	
	//pulls music file from storage and plays it on loop
	public static void music(){
		AudioPlayer MGP = AudioPlayer.player;
		AudioStream BGM;
		AudioData MD;
		ContinuousAudioDataStream loop = null;
		try{
		BGM = new AudioStream(new FileInputStream("D:/University/Year 3/Software Development 3/Coursework/SkyWarsGame/starwars.wav"));
		MD = BGM.getData();
		loop = new ContinuousAudioDataStream(MD);
		}catch(IOException error){
		System.out.println("file not found");
		}
		MGP.start(loop);
		btnPlaySound.setEnabled(false);
		}

}
