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

public class End implements State {
	
	private JPanel contentPane;

	public End() {}
	
	
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
	    		
	    		// Draw background
	    		g.drawImage(gui.getSkyImage(), 0, 0, null);
	    	}
	    };

	    // Setup the contentPane
	    contentPane.setSize(400, 400);
	    gui.setSize(400, 400);
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(new MigLayout("fillx", "[]", "[][][][][][]"));
		
			    // Sky Wars Label
			    JLabel lblSkyWars = new JLabel("Sky Wars");
			    lblSkyWars.setFont(new Font("Arial", Font.BOLD, 50));
			    lblSkyWars.setForeground(Color.white);
			    contentPane.add(lblSkyWars, "cell 0 2,alignx center,gapy 50px");
		
		// Game Over Label
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setFont(new Font("Arial", Font.BOLD, 30));
		lblGameOver.setForeground(Color.white);
		contentPane.add(lblGameOver, "cell 0 3,alignx center,gapy 20px");
		
	    // Replay Button
		JButton btnReplay = new JButton("Replay");
		btnReplay.addActionListener(startClick());
		btnReplay.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		contentPane.add(btnReplay, "flowx,cell 0 4,alignx center,gapy 70px");
		
		return contentPane;
	}
	
	private ActionListener startClick() {
		return new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GameRun.getGame().playGame();
        	}
        };
	}

}
