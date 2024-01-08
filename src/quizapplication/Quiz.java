package quizapplication;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame implements ActionListener {
	
	String questions[][] = new String[10][5];
	String answers[][] = new String[10][2];
	String useranswers[][]=new String[10][1];
	JLabel qno,question;
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup groupoptions;
	JButton next,lifeline,submit;
	
	public static int timer = 15;
	public static int ans_given = 0;
	public static int count=0;
	public static int score=0;
	
	String name;
	
	Quiz(String name){
		this.name = name;
		setBounds(50,0, 1200,680);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/BTS.jpg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0, 1185,370);
		add(image);
		
		qno = new JLabel();
		qno.setBounds(80,400,50,30);
		qno.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(qno);
		
		question = new JLabel();
		question.setBounds(120,400,900,30);
		question.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(question);
		
		questions[0][0] = "How many members are in BTS?";
        questions[0][1] = "8";
        questions[0][2] = "6";
        questions[0][3] = "7";
        questions[0][4] = "9";

        questions[1][0] = "What date was BTS's debut stage?";
        questions[1][1] = "Jun 13th 2013";
        questions[1][2] = "July 14th 2013";
        questions[1][3] = "Oct 13th 2013";
        questions[1][4] = "Feb 14th 2013";

        questions[2][0] = "Who is the youngest member of BTS?";
        questions[2][1] = "Taehyung";
        questions[2][2] = "Jungkook";
        questions[2][3] = "Jimin";
        questions[2][4] = "Jin";

        questions[3][0] = "What is the BTS fandom called?";
        questions[3][1] = "Exol";
        questions[3][2] = "Army";
        questions[3][3] = "Black Pink";
        questions[3][4] = "Got7";

        questions[4][0] = "What song got BTS their first music show win?";
        questions[4][1] = "Butter";
        questions[4][2] = "Dynamite";
        questions[4][3] = "Fake Love";
        questions[4][4] = "I Need U";

        questions[5][0] = "What K-Pop entertainment is BTS signed under?";
        questions[5][1] = "Big Stone Entertainment";
        questions[5][2] = "Big Hit Entertainment";
        questions[5][3] = "Bangtan Hit Entertainment";
        questions[5][4] = "BTS Entertainment";

        questions[6][0] = "What does RM stand for?";
        questions[6][1] = "Royal Monster";
        questions[6][2] = "Red Monster";
        questions[6][3] = "Rap Montana";
        questions[6][4] = "Rap Monster";

        questions[7][0] = "What is the name of BTS's first song sung fully in English?";
        questions[7][1] = "Dynamite";
        questions[7][2] = "Balck Swan";
        questions[7][3] = "ON";
        questions[7][4] = "Spring Day";

        questions[8][0] = "What does ARMY stand for?";
        questions[8][1] = "Adorable Representive M.C. for Youth";
        questions[8][2] = "Adorable Representive M.K. for Youth";
        questions[8][3] = "Amazing Representive M.B. for Youth";
        questions[8][4] = "Amazing Representive M.L. for Youth";

        questions[9][0] = "Who is the tallest member in BTS?";
        questions[9][1] = "V";
        questions[9][2] = "RM";
        questions[9][3] = "J-Hope";
        questions[9][4] = "Suga";

        answers[0][1] = "7";
        answers[1][1] = "jun 13th 2013";
        answers[2][1] = "Jungkook";
        answers[3][1] = "Army";
        answers[4][1] = "I Need U";
        answers[5][1] = "Big Hit Entertainment";
        answers[6][1] = "Rap Monster";
        answers[7][1] = "Dynamite";
        answers[8][1] = "Adorable Representive M.C. for Youth";
        answers[9][1] = "RM";
		
		opt1 =new JRadioButton();
		opt1.setBounds(120,440,500,30);
		opt1.setBackground(Color.WHITE);
		opt1.setFont(new Font("Dialog",Font.PLAIN,15));
		add(opt1);
		
		opt2 =new JRadioButton();
		opt2.setBounds(120,470,500,30);
		opt2.setBackground(Color.WHITE);
		opt2.setFont(new Font("Dialog",Font.PLAIN,15));
		add(opt2);
		
		opt3 =new JRadioButton();
		opt3.setBounds(120,500,500,30);
		opt3.setBackground(Color.WHITE);
		opt3.setFont(new Font("Dialog",Font.PLAIN,15));
		add(opt3);
		
		opt4 =new JRadioButton();
		opt4.setBounds(120,530,500,30);
		opt4.setBackground(Color.WHITE);
		opt4.setFont(new Font("Dialog",Font.PLAIN,15));
		add(opt4);
		
		groupoptions = new ButtonGroup();
		groupoptions.add(opt1);
		groupoptions.add(opt2);
		groupoptions.add(opt3);
		groupoptions.add(opt4);
		
		next = new JButton("Next");
		next.setBounds(900,450,200,30);
		next.setFont(new Font("Tahoma",Font.PLAIN,15));
		next.setBackground(new Color(30,144,254));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		lifeline = new JButton("50-50 Lifeline");
		lifeline.setBounds(900,510,200,30);
		lifeline.setFont(new Font("Tahoma",Font.PLAIN,15));
		lifeline.setBackground(new Color(30,144,254));
		lifeline.setForeground(Color.WHITE);
		lifeline.addActionListener(this);
		add(lifeline);
		
		submit = new JButton("Submit");
		submit.setBounds(900,570,200,30);
		submit.setFont(new Font("Tahoma",Font.PLAIN,15));
		submit.setBackground(new Color(30,144,254));
		submit.setForeground(Color.WHITE);
		submit.setEnabled(false);
		submit.addActionListener(this);
		add(submit);
		
		start(count);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==next) {
			repaint();
			
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			
			ans_given = 1;
			
			if(groupoptions.getSelection()==null) {
				useranswers[count][0]="";
			}else {
				useranswers[count][0]=groupoptions.getSelection().getActionCommand();
			}
			
			if(count==8) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			
			count++;
			start(count);
			
		}else if(ae.getSource()==lifeline) {
			if(count==2||count==4||count==6||count==8||count==9) {
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}else {
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			lifeline.setEnabled(false);
		}else if(ae.getSource()==submit){
			ans_given=1;
			
			if(groupoptions.getSelection()==null) {
				useranswers[count][0]="";
			}else {
				useranswers[count][0]=groupoptions.getSelection().getActionCommand();
			}
			
			for(int i=0;i<useranswers.length;i++) {
				if(useranswers[i][0].equals(answers[i][1])) {
					score +=10;
				}else {
					
					score+=0;
				}
			}
			
			setVisible(false);
			new Score(name,score);
		}
	}		
	
	public void paint(Graphics g) {
		super.paint(g);
		
		String time = "Time Left - " + timer + " Seconds" ; // 15
		g.setColor(Color.RED);
		g.setFont(new Font("Tahoma",Font.BOLD,15));
		
		if(timer > 0) {
			g.drawString( time, 910,440);
		} else {
			
			g.drawString( "Times up!!", 960,450);
		}
		
		timer--; //14
		
		try {
			
			Thread.sleep(1000);
			repaint();
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(ans_given == 1) {
			ans_given = 0;
			timer = 15;
		}else if(timer < 0) {
			timer = 15;
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			
			if(count==8) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			if(count==9) {  // submit button
				

				if(groupoptions.getSelection()==null) {
					useranswers[count][0]="";
				}else {
					useranswers[count][0]=groupoptions.getSelection().getActionCommand();
				}
				
				for(int i=0;i<useranswers.length;i++) {
					if(useranswers[i][0].equals(answers[i][1])) {
						score +=10;
					}else {
						
						score+=0;
					}
				}
				setVisible(false);
				new Score(name,score);
			}else {  // next button
	
				if(groupoptions.getSelection()==null) {
					useranswers[count][0]="";
				}else {
					useranswers[count][0]=groupoptions.getSelection().getActionCommand();
				}
				count++; //0//1
				start(count);
			}
		}
	}
	
	public void start(int count) {
		
		qno.setText( " " +(count + 1) + ". " );
		question.setText(questions[count][0]); 
		
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][1]);
		
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		
		opt4.setText(questions[count][4]);
		opt4.setActionCommand(questions[count][4]);
		
		groupoptions.clearSelection();
	}
	
public static void main(String args[]) {
	new Quiz("user");
}
	
}
