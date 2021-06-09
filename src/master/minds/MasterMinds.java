package master.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MasterMinds extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    MasterMinds(){
        setBounds(200,200,1130,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("master/minds/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);
        
   
        
        JLabel l2 = new JLabel("Master Minds");
        l2.setFont(new Font("Aquate Script PERSONAL USE ONLY",Font.BOLD,40));
        l2.setForeground(new Color(30,144,254));
        l2.setBounds(720,70,300,45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter your name");
        l3.setFont(new Font("Noticia Text",Font.BOLD,18));
        l3.setForeground(new Color(30,144,254));
        l3.setBounds(760,160,300,20);
        add(l3);
        
        t1 = new JTextField();
        t1.setFont(new Font("",Font.PLAIN,15));
        t1.setBounds(720,210,250,25);
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(720,270,100,25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(870,270,100,25);
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new MasterMinds();
    }
    
}
