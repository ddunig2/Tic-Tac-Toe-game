
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;

public class TTT extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, bE;
	private JTextArea field, field1;
	private JLabel label1, label2, label3;
	private int xWins;
	private int oWins;
	private boolean exe = false;
	private JPanel pane;
	private JLabel lblNewLabel;
	private JLabel lblCP;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTT myFrame = new TTT();
					myFrame.setVisible(true);
					Thread t1 = new Thread(new Runnable() {
						@Override
						public void run() {
							myFrame.WelcomeM("This welcome message is unimportant, but I bet you'll look at it anyways");
						}
					});
					t1.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void WelcomeM(String string) {
		for (int i = 0; i < string.length(); i++) {
			label3.setText(label3.getText() + string.substring(i, i+1));
			pause(30);
		}
		
	}
	public void pause(int millis) {
		try {
			Thread.sleep(millis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private TTT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 543);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);

		b1 = new JButton("");
		b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b1.addActionListener(this);
		pane.setLayout(null);
		b1.setBackground(Color.white);
		b1.setBounds(60, 151, 146, 106);
		pane.add(b1);

		b2 = new JButton("");
		b2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b2.addActionListener(this);
		b2.setBackground(Color.white);
		b2.setBounds(205, 151, 146, 106);
		pane.add(b2);

		b3 = new JButton("");
		b3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b3.addActionListener(this);
		b3.setBackground(Color.white);
		b3.setBounds(350, 151, 146, 106);
		pane.add(b3);

		b4 = new JButton("");
		b4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b4.addActionListener(this);
		b4.setBackground(Color.white);
		b4.setBounds(60, 256, 146, 106);
		pane.add(b4);

		b5 = new JButton("");
		b5.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b5.addActionListener(this);
		b5.setBackground(Color.white);
		b5.setBounds(205, 256, 146, 106);
		pane.add(b5);

		b6 = new JButton("");
		b6.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b6.addActionListener(this);
		b6.setBackground(Color.white);
		b6.setBounds(350, 256, 146, 106);
		pane.add(b6);

		b7 = new JButton("");
		b7.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b7.addActionListener(this);
		b7.setBackground(Color.white);
		b7.setBounds(60, 361, 146, 106);
		pane.add(b7);

		b8 = new JButton("");
		b8.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b8.addActionListener(this);
		b8.setBackground(Color.white);
		b8.setBounds(205, 361, 146, 106);
		pane.add(b8);

		b9 = new JButton("");
		b9.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		b9.addActionListener(this);
		b9.setBackground(Color.white);
		b9.setBounds(350, 361, 146, 106);
		pane.add(b9);

		b10 = new JButton("Start Over");
		b10.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b10.addActionListener(this);
		b10.setBounds(415, 27, 81, 54);
		pane.add(b10);

		// b10.setBackground(Color.white);
		bE = new JButton("Exit");
		bE.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		bE.addActionListener(this);
		bE.setBounds(415, 86, 81, 54);
		pane.add(bE);

		// bE.setBackground(Color.white);
		field = new JTextArea("Player X");
		field.setBounds(60, 40, 157, 40);
		field.setLineWrap(true);
		field.setBackground(Color.red);
		field.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Enter Player X name bellow"));
		pane.add(field);

		field1 = new JTextArea("Player O");
		field1.setBounds(60, 82, 157, 40);
		field1.setLineWrap(true);
		field1.setBackground(Color.blue);
		field1.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Enter Player O name bellow"));
		pane.add(field1);

		label1 = new JLabel("0");
		label1.setBounds(227, 39, 73, 40);
		pane.add(label1);

		label2 = new JLabel("0");
		label2.setBounds(227, 86, 73, 36);
		pane.add(label2);

		label3 = new JLabel();
		label3.setBounds(47, 0, 481, 25);
		pane.add(label3);
		
		lblNewLabel = new JLabel("Current player:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(60, 126, 93, 25);
		pane.add(lblNewLabel);
		
		lblCP = new JLabel("X");
		lblCP.setForeground(Color.BLUE);
		lblCP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCP.setBounds(160, 125, 20, 25);
		pane.add(lblCP);
	}

	private void score() {
		label1.setText(String.valueOf(xWins));
		label2.setText(String.valueOf(oWins));
	}

	private void Winer() {
		String b11 = b1.getText();
		String b22 = b2.getText();
		String b33 = b3.getText();
		String b44 = b4.getText();
		String b55 = b5.getText();
		String b66 = b6.getText();
		String b77 = b7.getText();
		String b88 = b8.getText();
		String b99 = b9.getText();

		if (b11 == ("X") & b22 == ("X") & b33 == ("X") || b11 == ("X") & b44 == ("X") & b77 == ("X")
				|| b11 == ("X") & b55 == ("X") & b99 == ("X") || b44 == ("X") & b55 == ("X") & b66 == ("X")
				|| b77 == ("X") & b88 == ("X") & b99 == ("X") || b22 == ("X") & b55 == ("X") & b88 == ("X")
				|| b33 == ("X") & b66 == ("X") & b99 == ("X") || b33 == ("X") & b55 == ("X") & b77 == ("X")) {

			JOptionPane.showMessageDialog(this, field.getText() + " won ");
			xWins++;
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			score();

		} else if (b11 == ("O") & b22 == ("O") & b33 == ("O") || b11 == ("O") & b44 == ("O") & b77 == ("O")
				|| b11 == ("O") & b55 == ("O") & b99 == ("O") || b44 == ("O") & b55 == ("O") & b66 == ("O")
				|| b77 == ("O") & b88 == ("O") & b99 == ("O") || b22 == ("O") & b55 == ("O") & b88 == ("O")
				|| b33 == ("O") & b66 == ("O") & b99 == ("O") || b33 == ("O") & b55 == ("O") & b77 == ("O")) {
			JOptionPane.showMessageDialog(this, field1.getText() + " won");
			oWins++;
			clearBoard();
			score();
		} else if (b11 != ("") & b22 != ("") & b33 != ("") & b44 != ("") & b55 != ("") & b66 != ("") & b77 != ("")
				& b88 != ("") & b99 != ("")) {
			JOptionPane.showMessageDialog(this, "Its a tie");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		String ex = "X";
		String oh = "O";
		JButton clicked = ((JButton) e.getSource());
		if (clicked == b10) {
			clearBoard();
		} else if (clicked == bE) {
			System.exit(0);
		} else {
			if (exe) {
				Font font = new Font("sansSerif", Font.BOLD, 100);
				clicked.setText(ex);
				clicked.setFont(font);
				clicked.setForeground(Color.red);
				clicked.setText(oh);
				lblCP.setForeground(Color.BLUE);
				lblCP.setText("X");
			} else {
				Font font = new Font("sansSerif", Font.BOLD, 100);
				clicked.setFont(font);
				clicked.setForeground(Color.blue);
				clicked.setText(ex);
				lblCP.setForeground(Color.RED);
				lblCP.setText("O");
			}
			exe = !exe;
			Winer();
		}
	}
	public void clearBoard() {
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
	}
}