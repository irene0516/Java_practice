package hw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf = new MainFrame();
		mf.setVisible(true);
		// String s = "0100";
		// String str[] = s.split("0");
		// System.out.println(str.length);
	}

}


class MainFrame extends JFrame {
	private int f = 0;
	private double b;
	private JButton btnarr[] = new JButton[16];
	private JLabel lab = new JLabel("0");
	private JPanel pal = new JPanel(new GridLayout(4, 4, 3, 3));
	private Container cp;
	private Font f1 = new Font("º–∑¢≈È", Font.BOLD, 24);
	private String btnname[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
	private boolean boo = true;

	public MainFrame() {
		init();
	}

	private void init() {
		cp = this.getContentPane();
		this.setBounds(10, 10, 350, 420);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout(5, 5));
		cp.add(lab, BorderLayout.NORTH);
		lab.setBackground(Color.PINK);
		lab.setOpaque(true);
		lab.setHorizontalAlignment(JLabel.RIGHT);
		lab.setFont(f1);
		cp.add(pal, BorderLayout.CENTER);
		for (int i = 0; i < 16; i++) {
			btnarr[i] = new JButton(btnname[i]);
			pal.add(btnarr[i]);
			btnarr[i].setFont(f1);
		}
		for (int i = 0; i < 16; i++) {
			btnarr[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton getbtn = (JButton) e.getSource();
					String s = (e.getActionCommand());
					switch (s) {
					case "0":
						String str[] = lab.getText().split("0");
						System.out.println(str.length);
						if (str.length == 0) {
							lab.setText(lab.getText());
						} else if (boo == false) {
							lab.setText("0");
						} else {
							lab.setText(lab.getText() + s);
						}
						boo = true;
						break;
					case "+":
						f = 1;
						b = Double.valueOf(lab.getText());
						lab.setText("0");
						break;
					case "-":
						f = 2;
						b = Double.valueOf(lab.getText());
						lab.setText("0");
						break;
					case "*":
						f = 3;
						b = Double.valueOf(lab.getText());
						lab.setText("0");
						break;
					case "/":
						f = 4;
						b = Double.valueOf(lab.getText());
						lab.setText("0");
						break;
					case ".":
						if (Double.valueOf(lab.getText()) % 2 == 0 || Float.valueOf(lab.getText()) % 2 == 1) {
							if (lab.getText().charAt(lab.getText().length() - 1) == '.') {
								lab.setText(lab.getText());
							} else {
								lab.setText(lab.getText() + s);
							}
						} else {
							lab.setText(lab.getText());
						}
						break;
					case "=":
						boo = false;
						Double g = Double.valueOf(lab.getText());
						if (f == 1) {
							lab.setText(Double.toString(b + g));
						} else if (f == 2) {
							lab.setText(Double.toString(b + g));
						} else if (f == 3) {
							lab.setText(Double.toString(b + g));
						} else if (f == 4) {
							lab.setText(Double.toString(b + g));
						}
						break;
					default:
						if (lab.getText().equals("0")) {
							lab.setText(s);
						} else {
							lab.setText(lab.getText() + s);

						}
					}

				}
			});
		}

	}

}
