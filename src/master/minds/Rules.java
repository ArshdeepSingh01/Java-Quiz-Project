package master.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1 ,b2;
    String username;
  Rules(String username){
    this.username = username;
    setBounds(400,100,800,650);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    JLabel l1 = new JLabel("Welcome "+username+" to the Master Minds!");
    l1.setForeground(new Color(30,144,254));
    l1.setFont(new Font("Aquate Script PERSONAL USE ONLY",Font.BOLD,28));
    l1.setBounds(200,50,700,30);
    add(l1);
    
    JLabel l2 = new JLabel("");
    l2.setFont(new Font("Arimo",Font.PLAIN,16));
    l2.setBounds(100,120,600,350);
    l2.setText("<html>"
            + "1. The decision of the quiz-master will be final and will not be subjected to any change.<br><br>"
            + "2. The participants shall not be allowed to use mobile or other electronic instruments.<br><br>"
            + "3. The questions shall be in the form of multiple choice, True / False statement, Specificanswer question etc.<br><br>"
            + "4. There is no negative marking for wrong answer.<br><br>"
            + "5. No buzzer is used in this round.<br><br>"
            + "6. 10 points is awarded for the correct answer..<br><br>"
            + "7. Once a question is passed the you cannot give an answer later.<br><br>"
            + "8. The score is visible to players at the end.<br><br>"
            + "<html>");
    add(l2);
    
    b1 = new JButton("Back");
    b1.setBounds(250,500,100,30);
    b1.setBackground(new Color(30,144,255));
    b1.setForeground(Color.WHITE);
    b1.addActionListener(this);
    add(b1);
    
    b2 = new JButton("Start");
    b2.setBounds(380,500,100,30);
    b2.setBackground(new Color(30,144,255));
    b2.setForeground(Color.WHITE);
    b2.addActionListener(this);
    add(b2);
    
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==b1){
          this.setVisible(false);
          new MasterMinds().setVisible(true);
      }else if(ae.getSource()==b2){
          this.setVisible(false);
          new Quiz(username).setVisible(true);
      }
  }
  
  public static void main(String[] args){
      new Rules("");
  }
}
