/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Itsexceptional
 */
public class Universities extends JFrame implements ActionListener{

    JButton CU;
    JButton GNA;
    JButton DAV;
    JButton govt;
    JButton DU;
    JButton GNE;
    JButton back;
    
    public Universities()
    {
        JPanel pu=new JPanel();
        pu.setBackground(Color.GRAY);
        pu.setLayout(null);
        add(pu);
        
        JSeparator usep=new JSeparator(SwingConstants.HORIZONTAL);
        usep.setBounds(350,65,600,3);
        pu.add(usep);
        
        JLabel ul=new JLabel("-Universities & Colleges-");
        ul.setBounds(520,20,350,40);
        ul.setFont(new Font("Times New Roman",Font.BOLD,25));
        ul.setForeground(Color.white);
        pu.add(ul);
     
        back=new JButton("Back");
        back.setBounds(870,80 ,80,30);
        pu.add(back);
        back.addActionListener(this);
        
        JLabel one=new JLabel("<html><font color=white>1.</font></html>");
        one.setBounds(500,120,20,30);
        pu.add(one);
        
        CU=new JButton("Chandigarh University, Chandigarh");
        CU.setBounds(540,120,230,30);
        pu.add(CU);
        
        JLabel two=new JLabel("<html><font color=white>2.</font></html>");
        two.setBounds(500,160,20,30);
        pu.add(two);
        
        GNA=new JButton("GNA Univerisity, Phagwara");
        GNA.setBounds(540,160,230,30);
        pu.add(GNA);
       
        JLabel three=new JLabel("<html><font color=white>3.</font></html>");
        three.setBounds(500,200,20,30);
        pu.add(three);
        
        DAV=new JButton("DAV Univerisity, Jalandhar");
        DAV.setBounds(540,200,230,30);
        pu.add(DAV);
        
        JLabel four=new JLabel("<html><font color=white>4.</font></html>");
        four.setBounds(500,240,20,30);
        pu.add(four);
        
        govt=new JButton("Govt. College, Ludhiana");
        govt.setBounds(540,240,230,30);
        pu.add(govt);
        
        JLabel five=new JLabel("<html><font color=white>5.</font></html>");
        five.setBounds(500,280,20,30);
        pu.add(five);
        
        GNE=new JButton("GNE Univerisity, Ludhiana");
        GNE.setBounds(540,280,230,30);
        pu.add(GNE);
        
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     public static void main(String[] args) {
        new Universities();
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==back)
    {
        new Dashboard();
    }
    }
    
}
