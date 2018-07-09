package gui02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PiggyBankGUI extends JFrame {

	private PiggyBank theBank;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel theBalanceLable;
	private JButton btnAddp;
	private JButton btnAddp_1;
	private JButton btnAddp_2;
	private JButton btnAddp_3;
	private JButton btnAddp_4;
	private JButton btnAddp_5;
	private JButton btnAdd;
	private JButton btnExit;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiggyBankGUI frame = new PiggyBankGUI();
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
	public PiggyBankGUI() {
		theBank = new PiggyBank();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTheBalanceLable());
		contentPane.add(getBtnAddp());
		contentPane.add(getBtnAddp_1());
		contentPane.add(getBtnAddp_2());
		contentPane.add(getBtnAddp_3());
		contentPane.add(getBtnAddp_4());
		contentPane.add(getBtnAddp_5());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnExit());
		contentPane.add(getBtnNewButton());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome to the Piggy Bank");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel.setBounds(36, 11, 365, 30);
		}
		return lblNewLabel;
	}
	private JLabel getTheBalanceLable() {
		if (theBalanceLable == null) {
			theBalanceLable = new JLabel("");
			theBalanceLable.setHorizontalAlignment(SwingConstants.CENTER);
			theBalanceLable.setFont(new Font("Arial", Font.BOLD, 24));
			updateBalance();
			theBalanceLable.setBounds(166, 52, 105, 55);
		}
		return theBalanceLable;
	}
	
	private void updateBalance() {
		theBalanceLable.setText("" +this.theBank.getBalance());
	}
	private JButton getBtnAddp() {
		if (btnAddp == null) {
			btnAddp = new JButton("Add 1p");
			btnAddp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theBank.addPenny();
					updateBalance();
				}
			});
			btnAddp.setBounds(15, 114, 89, 23);
		}
		return btnAddp;
	}
	private JButton getBtnAddp_1() {
		if (btnAddp_1 == null) {
			btnAddp_1 = new JButton("Add 2p");
			btnAddp_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.addTwoPence();
					updateBalance();
				}
			});
			btnAddp_1.setBounds(119, 114, 89, 23);
		}
		return btnAddp_1;
	}
	private JButton getBtnAddp_2() {
		if (btnAddp_2 == null) {
			btnAddp_2 = new JButton("Add 5p ");
			btnAddp_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.addFivePence();
					updateBalance();
				}
			});
			btnAddp_2.setBounds(223, 114, 89, 23);
		}
		return btnAddp_2;
	}
	private JButton getBtnAddp_3() {
		if (btnAddp_3 == null) {
			btnAddp_3 = new JButton("Add 10p");
			btnAddp_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.addTenPence();
					updateBalance();
				}
			});
			btnAddp_3.setBounds(327, 114, 89, 23);
		}
		return btnAddp_3;
	}
	private JButton getBtnAddp_4() {
		if (btnAddp_4 == null) {
			btnAddp_4 = new JButton("Add 20p");
			btnAddp_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.addTwentyPence();
					updateBalance();
				}
			});
			btnAddp_4.setBounds(58, 148, 89, 23);
		}
		return btnAddp_4;
	}
	private JButton getBtnAddp_5() {
		if (btnAddp_5 == null) {
			btnAddp_5 = new JButton("Add 50p ");
			btnAddp_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.addFiftyPence();
					updateBalance();
				}
			});
			btnAddp_5.setBounds(182, 148, 89, 23);
		}
		return btnAddp_5;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add \u00A31 ");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.addOnePound();
					updateBalance();
				}
			});
			btnAdd.setBounds(298, 148, 89, 23);
		}
		return btnAdd;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnExit.setBounds(254, 198, 89, 23);
		}
		return btnExit;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Go to the pub");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					theBank.raid();
					updateBalance();
				}
			});
			btnNewButton.setBounds(15, 182, 229, 55);
		}
		return btnNewButton;
	}
}
