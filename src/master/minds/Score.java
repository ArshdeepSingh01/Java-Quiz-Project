package master.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    Score(String username ,int score){
        setBounds(450,200,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("master/minds/icons/score.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1000,170);
        add(l1);
        
        JLabel l4 = new JLabel("Master Minds!");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Aquate Script PERSONAL USE ONLY",Font.BOLD,60));
        l4.setBounds(45,50,700,65);
        l1.add(l4);
        
        JLabel l2 = new JLabel("Thank you "+username+" for praticipating");
        l2.setBounds(180,225,500,40);
        l2.setForeground(new Color(30,144,254));
        l2.setFont(new Font("Aquate Script PERSONAL USE ONLY",Font.BOLD,30));
        add(l2);
        
        JLabel l3 = new JLabel("Your score is "+score);
        l3.setBounds(290,325,500,35);
        l3.setFont(new Font("",Font.ITALIC,20));
        l3.setForeground(new Color(30,144,254));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.setBounds(300,400,120,35);
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new MasterMinds().setVisible(true);
    }
    public static void main(String[] args) {
        new Score("",0).setVisible(true);
    }
}
