/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Itsexceptional
 */
public class UserMethods {

    public int signup(String username,String pass,String email,String sex,String quali,String city)throws Exception
    {
        Connection cm=connection.getConnection("userdb");
        PreparedStatement ps=cm.prepareStatement("insert into register(username,pass,email,sex,quali,city) values('"+username+"','"+pass+"','"+email+"','"+sex+"','"+quali+"','"+city+"')");
        int ros=ps.executeUpdate();
        return ros;
    }
    
    public static void main(String[] args) 
    {
        String username="Simran";
        String pass="sammy1998";
        UserMethods um=new UserMethods();
        try
        {
            int sm=um.checkUserPass(username,pass);
            if(sm==1)
            {
                JOptionPane.showMessageDialog(null,"Valid");
                      
            }
            else if(sm==2)
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else
            {
            }
        }
            catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null,"Exception"+e.getMessage());
                    }
        }
    public String getPassword(String username)throws Exception
    {
        String pass=null;
        String Query="select * from register where username='"+username+"'";
        Connection con=connection.getConnection("userdb");
        PreparedStatement ps=con.prepareStatement(Query);
        ResultSet rs=ps.executeQuery();
        if(rs!=null)
        {
            while(rs.next())
            {
                pass=rs.getString("pass");
            }
            return pass;
            }
       else
        {
            pass=null;
        }
        return pass;
    }
    public int checkUserPass(String username,String pass)throws Exception
    {
        UserMethods usermethods=new UserMethods();
        String dbpassword=usermethods.getPassword(username);
        if(dbpassword!=null)
        {
            //System.out.println("valid user"+dbpassword);
            if(dbpassword.equals(pass))
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        else{
            
            return 0;
        }
    }
}
                     
   