package hw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame nf = new MainFrame();
		nf.setVisible(true);
	}

}

class MainFrame extends Frame {
	private Label scrlab = new Label();
	private Label reslab = new Label();
	private TextField scrtext = new TextField();
	private Button addbtn = new Button("評定");
	private Button exitbtn = new Button("EXIT");

	public MainFrame() {
		init();
	}

	private void init() {
		this.setBounds(100, 100, 520, 400);
		this.setLayout(null);
		scrlab.setBounds(100, 100, 100, 50);
		scrtext.setBounds(250, 100, 100, 50);
		reslab.setBounds(400, 100, 50, 50);
		addbtn.setBounds(100, 200, 100, 50);
		exitbtn.setBounds(300, 200, 100, 50);
		scrlab.setText("成績");
		scrlab.setBackground(new Color(150,150,225));
		addbtn.setFont(new Font("標楷體", Font.BOLD, 32));
		exitbtn.setFont(new Font("標楷體", Font.BOLD, 32));
		scrlab.setFont(new Font("標楷體", Font.BOLD, 32));
		reslab.setFont(new Font("標楷體", Font.BOLD, 32));
		scrtext.setFont(new Font("標楷體", Font.BOLD, 32));
		this.add(scrlab);
		this.add(scrtext);
		this.add(reslab);
		this.add(addbtn);
		this.add(exitbtn);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				int b = Math.round(Float.valueOf(scrtext.getText()));
				if (b >= 90 && b <= 100) {
					reslab.setText("A");
				} else if (b >= 80 && b < 90) {
					reslab.setText("B");
				} else if (b >= 70 && b < 80) {
					reslab.setText("C");
				} else if (b >= 60 && b < 70) {
					reslab.setText("D");
				} else {
					reslab.setText("E");
				}

			}
		});
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.exit(0);
			}
		});
	}

}
