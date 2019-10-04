package ex;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf = new MainFrame();
		mf.setVisible(true);

	}

}

class MainFrame extends Frame {
	private Button Addbtn = new Button("Add");
	private Button Subbtn = new Button("Sub");
	private Label Coulab = new Label();
	private int count = 0;

	public MainFrame() {
		init();
	}

	private void init() {

		this.setBounds(100, 100, 800, 800);
		this.setLayout(null);
		Addbtn.setBounds(200, 500, 100, 100);
		Subbtn.setBounds(500, 500,100, 100);
		Coulab.setBounds(300,200,200,100);
		Coulab.setBackground(new Color(128,200,200));
		Coulab.setFont(new Font("標楷體",Font.BOLD,30));
		Addbtn.setFont(new Font("標楷體",Font.BOLD,30));
		Subbtn.setFont(new Font("標楷體",Font.BOLD,30));
		this.add(Addbtn);
		this.add(Subbtn);
		this.add(Coulab);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent a) {
				System.exit(0);
			}
		});
		Addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				count++;
				Coulab.setText(Integer.toString(count));
			}
		});
		Subbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				Coulab.setText(Integer.toString(count));
			}
		});

	}

}
