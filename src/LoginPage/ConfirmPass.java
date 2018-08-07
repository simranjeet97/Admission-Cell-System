package LoginPage;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;      
 

public class ConfirmPass extends JFrame implements ActionListener{    

    JButton b4;    
    public ConfirmPass()
    {
        JPanel p2=new JPanel();
        p2.setLayout(null);
        add(p2);
        p2.setBackground(Color.gray);
        
        JLabel labeltop2=new JLabel("-Password Change-");
        labeltop2.setFont(new Font("Times New Roman",Font.BOLD,20));
        labeltop2.setForeground(Color.white);
        labeltop2.setBounds(20,20, 300, 30);
        p2.add(labeltop2);
        
        JLabel lab2;
        lab2=new JLabel("New Password :");
        lab2.setFont(new Font("Times New Roman",Font.BOLD,15));
        lab2.setForeground(Color.white);
        lab2.setBounds(500,150,120,30);
        p2.add(lab2);
       
        JTextField cp1;
        cp1=new JTextField();
        cp1.setBounds(640,150,150,30);
        p2.add(cp1);
        
        JLabel lab3;
        lab3=new JLabel("Confirm Password :");
        lab3.setFont(new Font("Times New Roman",Font.BOLD,15));
        lab3.setBounds(500,200,150,30);
        lab3.setForeground(Color.white);
        p2.add(lab3);
       
        JTextField cp2;
        cp2=new JTextField();
        cp2.setBounds(640,200,150,30);
        p2.add(cp2);
        
        b4=new JButton("Finish");
        b4.setBounds(600,250,100,20);
        b4.addActionListener(this);
        p2.add(b4);
        
        
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new ConfirmPass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b4)
        {
            new LoginPage();
        }
    }
    
}
