package state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.GUI;
import main.GameRun;
import net.miginfocom.swing.MigLayout;

public class Start implements State {
	
	private JPanel contentPane;
	
	public Start() {}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public JPanel run(final GUI gui) {
		// Set the next State to Play
		gui.setGameState(new Play());
		
		contentPane = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
	    	protected void paintComponent(Graphics g) {
	    		super.paintComponent(g);
	    		
	    		// Set background
	    		g.drawImage(gui.getSkyImage(), 0, 0, null);
	    	}
	    };
	    
	    // Setup the contentPane
	    contentPane.setSize(400, 400);
	    gui.setSize(400, 400);
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(new MigLayout("fillx", "[]", "[][][][][][]"));
		
	    // Start Button
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(startClick());
		
			    // Sky Wars Label
			    JLabel lblSkyWars = new JLabel("Sky Wars");
			    lblSkyWars.setFont(new Font("Arial", Font.BOLD, 50));
			    lblSkyWars.setForeground(Color.white);
			    contentPane.add(lblSkyWars, "cell 0 2,alignx center,gapy 50px");
		btnStart.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		contentPane.add(btnStart, "cell 0 3,alignx center,gapy 90px");
		
		return contentPane;
	}
	
	// Start ActionListener
	private ActionListener startClick() {
		return new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GameRun.getGame().playGame();
        	}
        };
	}

}
