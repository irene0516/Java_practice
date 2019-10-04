package ex;

/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		MainFrame mf = new MainFrame();
		mf.setVisible(true);

	}

}

class MainFrame extends Frame {
	private Font f1 = new Font("標楷體", Font.BOLD, 24);
	private Panel pan = new Panel(new GridLayout(4, 4, 3, 3));
	private Button btnarr[] = new Button[16];
	private String btnname[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
	private Label lab = new Label("0");
	private float b = 0;
	private int f = 0;
	private int zero = 0;

	public MainFrame() {
		init();
	}

	private void init() {
		this.setBounds(50, 50, 350, 420);
		this.setLayout(new BorderLayout(5, 5));
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.add(lab, BorderLayout.NORTH);
		lab.setAlignment(Label.RIGHT);
		lab.setBackground(Color.YELLOW);
		lab.setFont(f1);
		this.add(pan, BorderLayout.CENTER);
		for (int i = 0; i < 16; i++) {
			btnarr[i] = new Button(btnname[i]);
			pan.add(btnarr[i]);
			btnarr[i].setFont(f1);
		}
		for (int i = 0; i < 16; i++) {
			btnarr[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Button getbtn = (Button) (e.getSource());
					switch (getbtn.getLabel()) {
					case "0":
						String z[] = lab.getText().split("0");
						if (z.length == 0) {
							lab.setText(lab.getText());
						} else if (zero == 1) {
							lab.setText("0");
						} else {
							lab.setText(lab.getText() + getbtn.getLabel());
						}
						zero = 0;
						break;
					case "+":
						f = 1;
						b = Float.valueOf(lab.getText());
						lab.setText("0");
						break;
					case "-":
						f = 2;
						b = Float.valueOf(lab.getText());
						lab.setText("0");
						break;
					case "*":
						f = 3;
						b = Float.valueOf(lab.getText());
						lab.setText("0");
						break;
					case "/":
						f = 4;
						b = Float.valueOf(lab.getText());
						lab.setText("0");
						break;
					case ".":
						if (Float.valueOf(lab.getText()) % 2 == 0 || Float.valueOf(lab.getText()) % 2 == 1) {
							if (lab.getText().charAt(lab.getText().length() - 1)== '.') {
								lab.setText(lab.getText());
							} else {
								lab.setText(lab.getText() + getbtn.getLabel());
							}
						} else {
							lab.setText(lab.getText());
						}
					case "=":
						zero = 1;
						if (f == 1) {
							lab.setText(Float.toString(b + Float.valueOf(lab.getText())));
						} else if (f == 2) {
							lab.setText(Float.toString(b - Float.valueOf(lab.getText())));
						} else if (f == 3) {
							lab.setText(Float.toString(b * Float.valueOf(lab.getText())));
						} else if (f == 4) {
							lab.setText(Float.toString(b / Float.valueOf(lab.getText())));
						}
						break;
					default:
						if (lab.getText().equals("0")) {
							lab.setText(getbtn.getLabel());
						} else {
							lab.setText(lab.getText() + getbtn.getLabel());
						}
					}
				}
			});
		}

	}

}
