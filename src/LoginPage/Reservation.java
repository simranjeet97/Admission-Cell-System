/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;

import com.toedter.calendar.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Itsexceptional
 */
public class Reservation extends JFrame implements ActionListener{

    JTextField rnametext;
    JTextField rftext;
    JTextField remailtext;
    JTextField citytext;
    JTextField rziptext;
    JTextField rstate;
    JTextField context;
    JTextField raddress;
    JComboBox rcb;
    JComboBox rcb2;
    public Reservation()
    {
        JPanel pr=new JPanel();
        pr.setBackground(Color.GRAY);
        pr.setLayout(null);
        add(pr);
        
        JSeparator sep=new JSeparator(SwingConstants.HORIZONTAL);
        sep.setBounds(350,65,600,3);
        pr.add(sep);
        
        JLabel rl=new JLabel("-Reservation-");
        rl.setBounds(600,20,150,40);
        rl.setFont(new Font("Times New Roman",Font.BOLD,25));
        rl.setForeground(Color.white);
        pr.add(rl);
     
        JLabel rname=new JLabel("<html><font color=white>Name -</font></html>");
        rname.setBounds(420,110,80,30);
        pr.add(rname);
        
        rnametext=new JTextField();
        rnametext.setBounds(500,110,200,30);
        pr.add(rnametext);
        
        JLabel gender=new JLabel("<html><font color=white>Gender -</font></html>");
        gender.setBounds(730,110,80,30);
        pr.add(gender);
        String sex[]={"Male","Female","Other"};        
        rcb=new JComboBox(sex);    
        rcb.setBounds(800,110,100,30);    
        pr.add(rcb);
        
        JLabel rfname=new JLabel("<html><font color=white>Father's Name-</font></html>");
        rfname.setBounds(420,160,80,30);
        pr.add(rfname);
        
        rftext=new JTextField();
        rftext.setBounds(500,160,200,30);
        pr.add(rftext);
        
        JLabel rcaste=new JLabel("<html><font color=white>Category -</font></html>");
        rcaste.setBounds(720,160,80,30);
        pr.add(rcaste);
        
        String qualitext[]={"General","BC/OBC","SC/ST"};        
        rcb2=new JComboBox(qualitext);    
        rcb2.setBounds(800,160,100,30);    
        pr.add(rcb2);
        
        
        JLabel remail=new JLabel("<html><font color=white>E-mail -</font></html>");
        remail.setBounds(420,210,80,30);
        pr.add(remail);
        
        remailtext=new JTextField();
        remailtext.setBounds(500,210,250,30);
        pr.add(remailtext);
        
        JLabel rzip=new JLabel("<html><font color=white>ZIP -</font></html>");
        rzip.setBounds(765,210,80,30);
        pr.add(rzip);
        
        rziptext=new JTextField();
        rziptext.setBounds(800,210,100,30);
        pr.add(rziptext);
        
        JLabel jdob=new JLabel("<html><font color=white>D.O.B -</font></html>");
        jdob.setBounds(420,260,80,30);
        pr.add(jdob);

        JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(500,260,150,30);
        pr.add(dateChooser);
        
        JLabel contact=new JLabel("<html><font color=white>Contact -</font></html>");
        contact.setBounds(690,260,80,30);
        pr.add(contact);
        
        context=new JTextField();
        context.setBounds(750,260,150,30);
        pr.add(context);
       
        JLabel jl6=new JLabel("<html><font color=white>City -</font></html>");
        jl6.setBounds(420,310,80,30);
        pr.add(jl6);
        
        citytext=new JTextField();
        citytext.setBounds(500,310,200,30);
        pr.add(citytext);
       
        JLabel jstate=new JLabel("<html><font color=white>State -</font></html>");
        jstate.setBounds(715,310,80,30);
        pr.add(jstate);
        
        rstate=new JTextField();
        rstate.setBounds(760,310,140,30);
        pr.add(rstate);
        
        JLabel jaddress=new JLabel("<html><font color=white>Address -</font></html>");
        jaddress.setBounds(420,360,80,30);
        pr.add(jaddress);
        
        raddress=new JTextField();
        raddress.setBounds(500,360,400,30);
        pr.add(raddress);
         
        JButton rb=new JButton("Confirm");
        rb.setBounds(620,430,100,35);
        pr.add(rb);
        
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Reservation();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
    
}
