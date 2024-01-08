package quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
	
	Score(String name,int score){
		
		setBounds(200,80,900,550);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/luck.png"));
		Image i2 = i1.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,150, 900,600);
		add(image);
		
		JLabel heading = new JLabel(" Thankyou " + name + " for playing BTS Quiz Game");
		heading.setBounds(200,30,700,26);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel lblscore = new JLabel("Your Score is " + score);
		lblscore.setBounds(350,80,700,30);
		lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(lblscore);
		

		JButton submit = new JButton("Play Again");
		submit.setBounds(365,140,150,30);
		submit.setFont(new Font("Tahoma",Font.PLAIN,15));
		submit.setBackground(new Color(30,144,254));
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		setVisible(false);
		new Login();
		
	}
	
public static void main(String args[]) {
	
	new Score("user",0);
}
}
