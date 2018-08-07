
package LoginPage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import javax.swing.*;
import sun.java2d.loops.CompositeType;
import sun.java2d.loops.DrawLine;
import sun.java2d.loops.SurfaceType;

public class Dashboard extends JFrame implements ActionListener
{
    JButton d1;
    JButton d2;
    JButton d3;
    JButton d4;
    JButton d5;
    public Dashboard()
    { 
        JPanel p3=new JPanel();
        add(p3);
        p3.setLayout(null);
        p3.setBackground(Color.gray);
        
        JSeparator sep=new JSeparator(SwingConstants.HORIZONTAL);
        sep.setBounds(300,60,700,3);
        p3.add(sep);
        
        JLabel l3=new JLabel("-Dashboard-");
        l3.setBounds(600,20,150,40);
        l3.setFont(new Font("Times New Roman",Font.BOLD,25));
        l3.setForeground(Color.white);
        p3.add(l3);
        
        d1=new JButton("User Info.");
        d1.setBounds(380,100,120,35);
        p3.add(d1);
        d1.addActionListener(this);
        
        d2=new JButton("<html><center>Universities</center></html>");
        d2.setBounds(495,100,120,35);
        p3.add(d2);
        d2.addActionListener(this);
        
        d3=new JButton("Cancel Reg.");
        d3.setBounds(610,100,120,35);
        p3.add(d3);
        d3.addActionListener(this);
        
        d4=new JButton("Ciculars");
        d4.setBounds(725,100,120,35);
        p3.add(d4);
        d4.addActionListener(this);
        
        d5=new JButton("Logout");
        d5.setBounds(840,100,100,35);
        p3.add(d5);
        d5.addActionListener(this);
         
        setSize(1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==d3)
            {
                new Canceling();
            }
        else if(e.getSource()==d2)
                {
                    new Universities();
                }
        
    }
           
}
