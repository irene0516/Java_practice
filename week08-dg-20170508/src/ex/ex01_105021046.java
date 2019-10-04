package ex;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		mainframe mf = new mainframe();
		mf.setVisible(true);
	}

}

class mainframe extends JFrame {
	private JLabel lb = new JLabel("Score");
	private JLabel lb2 = new JLabel("==>");
	private JTextField tf = new JTextField("0");
	private JButton Clearbtn = new JButton("Clear");
	private JButton Runbtn = new JButton("Run");
	private JButton Exitbtn = new JButton("Exit");
	private JPanel areapnl = new JPanel(new GridLayout(1, 3, 3, 3));
	private JPanel funpnl = new JPanel(new GridLayout(3, 1, 3, 3));
	private Container cp;

	public mainframe() {
		init();
	}

	private void init() {
		this.setBounds(10, 10, 500,200);
		this.setLayout(new BorderLayout(5, 5));
		cp = this.getContentPane();
		areapnl.add(lb);
		areapnl.add(tf);
		areapnl.add(lb2);
		funpnl.add(Clearbtn);
		funpnl.add(Runbtn);
		funpnl.add(Exitbtn);
		this.add(areapnl, BorderLayout.CENTER);
		this.add(funpnl, BorderLayout.EAST);

		Clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("0");

			}
		});
		Runbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Float a = Float.valueOf(tf.getText());
					if (a <= 100 && a >= 0) {
						if (a > 90 && a <= 100) {
							tf.setText("A");
						} else if (a > 80 && a <= 90) {
							tf.setText("B");
						} else if (a > 70 && a <= 80) {
							tf.setText("C");
						} else if (a > 60 && a <= 70) {
							tf.setText("D");
						} else if (a > 0 && a <= 60) {
							tf.setText("E");
						}
					} else {
						javax.swing.JOptionPane.showMessageDialog(null, "超過範圍(0~100)");
					}
				} catch (NumberFormatException b) {

					javax.swing.JOptionPane.showMessageDialog(null, "格式錯誤");

				} catch (Exception c) {
					javax.swing.JOptionPane.showMessageDialog(null, "超過範圍(0~100)");
				}

			}
		});
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
