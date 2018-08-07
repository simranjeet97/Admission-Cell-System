package LoginPage;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;      
 

public class ForgetPass extends JFrame implements ActionListener{    

    JButton b3;    
    public ForgetPass() {   
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        add(p1);
        p1.setBackground(Color.gray);
        
        JLabel labeltop;
        labeltop=new JLabel("Forget Password");
        labeltop.setFont(new Font("Times New Roman",Font.BOLD,20));
        labeltop.setForeground(Color.white);
        labeltop.setBounds(20,20,300,30);
        p1.add(labeltop);
        
        JLabel line=new JLabel("____________________________________");
        line.setBounds(20,40,800,40);
        line.setForeground(Color.white);
        p1.add(line);
        
        JLabel label1;
        label1=new JLabel("Enter Email-Id :");
        label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.white);
        label1.setBounds(450,150,170,20);
        p1.add(label1);
        
        JTextField tf;
        tf=new JTextField();
        tf.setBounds(560,150,200,20);
        p1.add(tf);
            
        JLabel label2;
        label2=new JLabel("Enter Confirmation Code :");
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label2.setForeground(Color.white);
        label2.setBounds(450,200,200,20);
        p1.add(label2);
        
        JTextField tf2;
        tf2=new JTextField();
        tf2.setBounds(630,200,130,20);
        p1.add(tf2);
        
        b3=new JButton("Next");
        b3.setBounds(550,250,100,20);
        b3.addActionListener(this);
        p1.add(b3);
        
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
             new ForgetPass();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b3)
        {
            new ConfirmPass();
        }
       
    }
}