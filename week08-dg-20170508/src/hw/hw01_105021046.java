package hw;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainframe mf = new mainframe();
		mf.setVisible(true);
	}

}

class mainframe extends JFrame {
	private JTextField checkjtf = new JTextField("0");
	private JTextField jtf[] = new JTextField[10];
	private JButton checkjbt = new JButton("submit");
	private JButton exitjbt = new JButton("exit");
	private JPanel fucjpl = new JPanel(new GridLayout(2, 1, 3, 3));
	private JPanel jtfjpl = new JPanel(new GridLayout(1, 10, 3, 3));
	private JLabel jlb = new JLabel();
	private Container cp;

	public mainframe() {
		init();
	}

	private void init() {
		this.setBounds(10, 10, 500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp = this.getContentPane();
		this.setLayout(new BorderLayout(5, 5));
		cp.add(jtfjpl, BorderLayout.CENTER);
		fucjpl.add(checkjbt);
		fucjpl.add(exitjbt);
		for (int i = 0; i < 10; i++) {
			jtf[i] = new JTextField();
			jtfjpl.add(jtf[i]);
		}
		cp.add(fucjpl, BorderLayout.EAST);
		checkjbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = 1;
				int d = 0;
				char cha = 0;
				int ch[] = new int[9];
				String str[] = new String[9];
				try {
					String str1 = jtf[0].getText();
					cha = str1.charAt(0);
					for (int i = 0; i < 9; i++) {
						str[i] = jtf[i + 1].getText();
						ch[i] = Integer.parseInt(str[i]);

					}

				} catch (NumberFormatException ex) {
					javax.swing.JOptionPane.showMessageDialog(null, "格式錯誤");
				}
				try {
					if (cha >= 65 && cha <= 73) {
						b = cha - 55;
					} else if (cha >= 74 && cha <= 78) {
						b = cha - 56;
					} else if (cha >= 80 && cha <= 86) {
						b = cha - 57;
					} else if (cha >= 88 && cha <= 89) {
						b = cha - 58;
					} else if (cha == 73) {
						b = cha - 39;
					} else if (cha == 79) {
						b = cha - 44;
					} else if (cha == 87) {
						b = cha - 55;
					} else if (cha == 90) {
						b = cha - 57;
					}
					int c = 8;
					cha = (char) (b / 10 + b % 10 * 9);
					d = d + cha;
					for (int i = 0; i < 9; i++) {
						int a = (int) ch[i] * c;
						d = d + a;
						c--;
					}

					if (10 - (d % 100 % 10) == ch[8]) {
						JOptionPane.showMessageDialog(null, "正確");
					} else {
						JOptionPane.showMessageDialog(null, "錯誤");
					}

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "身分證錯誤");
				}

			}
		});
		exitjbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
