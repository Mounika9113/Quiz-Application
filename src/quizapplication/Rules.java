package quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{
	
	String name;
	JButton start,back;
	
	Rules(String name){
		this.name = name;
		getContentPane().setBackground(Color.pink);
	    setLayout(null);
	    
	    JLabel heading = new JLabel(" Welcome " + name + " to Simple Minds");
		heading.setBounds(30,50,700,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(20,90,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText(
				"<html>"+
					"1. If you want to love others,I think you should love yourself first.  -RM" + "<br><br>"+
					"2. I have a big heart full of love,so please take it all.  -V" + "<br><br>"+
					"3. If you think you're going to crash,step on the pedal harder.  -SUGA" + "<br><br>"+
					"4. Those who want to look more youthful should live life with a young heart.  -JIN" + "<br><br>"+
					"5. Even when this rain stops,when clouds go away,I stand here,just the same.  -JHOPE" + "<br><br>"+
					"6. Once your heart is moved,it will develop to something better and positive.  -JIMIN" + "<br><br>"+
					"7. Don't lose the people beside you because of your mistakes and wrongs. And live your life to the fullest.  -JUNGKOOK" + "<br><br>"+
				"<html>"
				);
		add(rules);
		
		back = new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400,500,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
		
		setSize(750,600);
		setLocation(250,50);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== start) {
			setVisible(false);
			new Quiz(name);
		}else {
			setVisible(false);
			new Login();
		}
	}
	public static void main(String args[]) {
		new Rules("User");
	}
	
}
