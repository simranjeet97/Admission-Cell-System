/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.CheckBox;
import javax.swing.*;

/**
 *
 * @author Itsexceptional
 */
public class Canceling extends JFrame implements ActionListener{

    JTextField cnametext;
    JTextField cregtext;
    JButton back;
    public Canceling()
    {
        JPanel pc=new JPanel();
        pc.setBackground(Color.GRAY);
        pc.setLayout(null);
        add(pc);
        
        JSeparator csep=new JSeparator(SwingConstants.HORIZONTAL);
        csep.setBounds(350,65,600,3);
        pc.add(csep);
        
        JLabel cl=new JLabel("-Cancel Reservation-");
        cl.setBounds(550,20,250,40);
        cl.setFont(new Font("Times New Roman",Font.BOLD,25));
        cl.setForeground(Color.white);
        pc.add(cl);
        
        back=new JButton("Back");
        back.setBounds(870,80 ,80,30);
        pc.add(back);
       
        back.addActionListener(this);
        
        JLabel cname=new JLabel("<html><font color=white>Name -</font></html>");
        cname.setBounds(500,210,80,30);
        pc.add(cname);
        
        cnametext=new JTextField();
        cnametext.setBounds(580,210,200,30);
        pc.add(cnametext);
        
        JLabel creg=new JLabel("<html><font color=white>Reg. No. -</font></html>");
        creg.setBounds(500,260,80,30);
        pc.add(creg);
        
        cregtext=new JTextField();
        cregtext.setBounds(580,260,200,30);
        pc.add(cregtext);
        
        Checkbox c=new Checkbox("Are you sure to cancel your registeration ?");
        c.setBounds(500,310,300,30);
        c.setForeground(Color.white);
        pc.add(c);
        
        JButton bc=new JButton("Click Here to Cancel");
        bc.setBounds(580,360,200,35);
        pc.add(bc);
       
             
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Canceling();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==back)
    {
        new Dashboard();
    }
    }
    
    
}
