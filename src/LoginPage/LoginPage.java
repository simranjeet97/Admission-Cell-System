/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;

/**
 *
 * @author Itsexceptional
 */

import Connection.UserMethods;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;      



public class LoginPage extends JFrame implements ActionListener{    

    JPasswordField pass;
    JTextField tf1;
    JLabel uname;    
    JButton b;
    JButton jb;
    JLabel jl3;
    JTextField unametext;
    JTextField jt2;
    JTextField emailt;
    JTextField jt4;
    JTextField qualit;
    JTextField cityt;
    JPasswordField passf;
    JTextField pin2;
    JButton b2;
    JComboBox cb;
    JComboBox cb2;
    public LoginPage() 
        {   
        
        
        JPanel p=new JPanel();
        add(p);
        p.setBackground(Color.gray);
        p.setLayout(null);
        
        JLabel top=new JLabel("<html><center><font color=Blue size=6><b>Login page</b><center></font>");
        top.setBounds(20,20,300,50);
        p.add(top);
        
        JLabel l1,l2;
        l1=new JLabel("<html><center><font color=white><b>Username :</b><center></font>");
        l1.setBounds(600,40,100,30);
        l1.setFont(new Font("Times New Roman",Font.BOLD,15));
        l2=new JLabel("<html><center><font color=white><b>Password :</b><center></font>");
        l2.setBounds(900,40,100,30);
        l2.setFont(new Font("Times New Roman",Font.BOLD,15));
        p.add(l1);p.add(l2);

        tf1=new JTextField();
        tf1.setBounds(680,40,200,30);
        
        pass=new JPasswordField();
        pass.setBounds(980,40,200,30);
        p.add(tf1);
        p.add(pass);
        
        b=new JButton("Login");
        b.setBounds(1200,40,85,30);
        b.addActionListener(this);
        p.add(b);
        
        
        
        Checkbox c=new Checkbox("Show Password");
        c.setBounds(980,80,200,30);
        c.setForeground(Color.white);
        
        b2=new JButton("Forget Password");
        b2.setBounds(980,110,150,25);
        b2.addActionListener(this);
        p.add(b2);
        
        JLabel line=new JLabel("<html><font color=white><b>__________________________________________________________________________________________________<b></font></html>");
        line.setBounds(600,140,1200,40);
        p.add(line);
        
        JLabel sup=new JLabel("<html><font color=white>SignUp for new acccount -</font></html>");
        sup.setBounds(880,170,300,40);
        p.add(sup);
        
        uname=new JLabel("<html><font color=white>Username -</font></html>");
        uname.setBounds(700,220,80,30);
        p.add(uname);
        
        unametext=new JTextField();
        unametext.setBounds(780,220,150,30);
        p.add(unametext);
        
        JLabel pass=new JLabel("<html><font color=white>Password -</font></html>");
        pass.setBounds(700,270,80,30);
        p.add(pass);
        
        passf=new JPasswordField();
        passf.setBounds(780,270,200,30);
        p.add(passf);
        
        
        JLabel email=new JLabel("<html><font color=white>Email-Id -</font></html>");
        email.setBounds(700,320,80,30);
        p.add(email);
        
        emailt=new JTextField();
        emailt.setBounds(780,320,250,30);
        p.add(emailt);
        
        String sex[]={"Male","Female","Other"};        
        cb=new JComboBox(sex);    
        cb.setBounds(980,220,100,30);    
        p.add(cb);
        
        JLabel quali=new JLabel("<html><font color=white>Qualification -</font></html>");
        quali.setBounds(1000,370,80,30);
        p.add(quali);
        
        String qualit[]={"10th","12th","UnderGraduate","PostGraduate"};        
        cb2=new JComboBox(qualit);    
        cb2.setBounds(1100,370,100,30);    
        p.add(cb2);
        
        JLabel jl6=new JLabel("<html><font color=white>City -</font></html>");
        jl6.setBounds(700,370,80,30);
        p.add(jl6);
        
        cityt=new JTextField();
        cityt.setBounds(780,370,200,30);
        p.add(cityt);
        
        jb=new JButton("SignUp");
        jb.setBounds(920,440,100,30);
        p.add(jb);
        jb.addActionListener(this);
        
        c.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) 
            {
            if (e.getStateChange() == ItemEvent.SELECTED) 
                {
                passf.setEchoChar((char) 0);
                } 
            else 
                {
                passf.setEchoChar('*');
                }
            }
        });
                passf.setEchoChar('*'); 
                p.add(c);
        
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
        
        public static void main(String[] args) 
        {
            LoginPage l = new LoginPage();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
    String uname=tf1.getText();
    String psd=pass.getText();
    if(e.getSource()==b)
    {
        UserMethods methods=new UserMethods();
        
        try {
             if(methods.checkUserPass(uname, psd)==1)
    {
        JOptionPane.showMessageDialog(LoginPage.this,"Login Sucessful :");   
        new Dashboard();
    }
    else
    {
        JOptionPane.showMessageDialog(LoginPage.this,"Sorry !Login Unsucessful :");
    }
        } catch (Exception e1) {
        }
    }
    else if(e.getSource()==jb)
    {
        UserMethods mm=new UserMethods();
        String username=unametext.getText();
        String pass=passf.getText();
        try{
        if(mm.checkUserPass(username, pass)==1)
        {
            JOptionPane.showMessageDialog(null,"Username Exists");
        }
        else
        {
        String email=emailt.getText();
        String city=cityt.getText();
        String sex=""+cb.getItemAt(cb.getSelectedIndex());
        String quali =""+cb2.getItemAt(cb2.getSelectedIndex()); 
        try
        {
            int ros=mm.signup(username, pass, email, sex, quali, city);
            if(ros>0)
            {
                JOptionPane.showMessageDialog(null,"Registered");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Ooops !! Not Registered");
            }
        }
        catch(Exception q)
        {
            JOptionPane.showMessageDialog(null,q.getMessage());
        }
        }
        }
        catch(Exception e2)
        {
        }
    }
    else if(e.getSource()==b2)
    {
        new ForgetPass();
    }
    }
}
