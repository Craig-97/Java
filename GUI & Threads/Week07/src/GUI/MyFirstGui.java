package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblPleaseEnterYopur;
	private JTextField nameField;
	private JButton btnNewButton;
	private JLabel welcomeLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstGui frame = new MyFirstGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblPleaseEnterYopur());
		contentPane.add(getNameField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getWelcomeLabel());
	}
	private JLabel getLblPleaseEnterYopur() {
		if (lblPleaseEnterYopur == null) {
			lblPleaseEnterYopur = new JLabel("Please enter your name");
			lblPleaseEnterYopur.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblPleaseEnterYopur.setBounds(24, 41, 232, 30);
		}
		return lblPleaseEnterYopur;
	}
	private JTextField getNameField() {
		if (nameField == null) {
			nameField = new JTextField();
			nameField.setBounds(274, 38, 139, 30);
			nameField.setColumns(10);
		}
		return nameField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Submit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String name = nameField.getText();
					String message = "hello there " +name;
					welcomeLabel.setText(message);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton.setBounds(87, 92, 225, 38);
		}
		return btnNewButton;
	}
	private JLabel getWelcomeLabel() {
		if (welcomeLabel == null) {
			welcomeLabel = new JLabel("");
			welcomeLabel.setBounds(24, 171, 382, 46);
		}
		return welcomeLabel;
	}
}
