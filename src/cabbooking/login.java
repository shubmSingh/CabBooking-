/*
 NAME -Shubham Singh
 ROLL NO- 18MCMC52
this code is for login page
*/
package cabbooking;

import com.mysql.jdbc.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import java.sql.ResultSet;


public class login extends JFrame
{
    login()
    {
      setSize(500,550);
      setLayout(null);
      // first panel
      JPanel p=new JPanel();
      JLabel l=new JLabel("Login page");
      l.setBounds(200,25,400,50);
      l.setFont(new Font ("Serif",Font.BOLD,30));
      p.setBackground(new Color(248,148,6));
      p.setBounds(0,0,500,50);
      
      //second panel
      JPanel p1=new JPanel();
      p1.setLayout(null);
      p1.setSize(400,300);
      p1.setBounds(100,125,300,300);
      p1.setBackground(new Color(0,0,0,60));
         //labels
      JLabel l1=new JLabel("User Name:");
      l1.setFont(new Font("Serif",Font.BOLD,18));
      l1.setBounds(10,25,200,50);
      JLabel l2=new JLabel("Password:");
      l2.setFont(new Font("Serif",Font.BOLD,18));
      l2.setBounds(10,90,200,50);
          //text Fields
      final JTextField t=new JTextField();
      t.setBounds(110,40,150,25);
      final JPasswordField pas=new JPasswordField();
      pas.setBounds(110,105,150,25);
     
          //butons
      JButton b1,b2,b3;
      b1=new JButton("Login");
       b1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
             String password=pas.getText();
             String username=t.getText();
             try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalcars?zeroDateTimeBehavior=convertToNull",
                        "root", "");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select username, password from login where username=? and password=?");

                    st.setString(1, username);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        new welcome();
                        dispose();
                      
                    } else {
                       
                        JOptionPane.showMessageDialog(null, "Invalid Login Details ","Login Eroor",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                      }
          }
      });
      b2=new JButton("Sign up");
      b2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
             new singup();
             dispose();
          }
      });
      b3= new JButton("Cancel");
        b3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
             dispose();
          }
      });
      b1.setBounds(55,160,180,30);
      b2.setBounds(50,210,90,30);
      b3.setBounds(150,210,90,30);
           //adding in panel2
      p1.add(t);
      p1.add(l1);
      p1.add(l2);
      p1.add(pas);
      p1.add(b1);
      p1.add(b2);
      p1.add(b3);
      
     //last adding step
      p.add(l);
      add(p);
      add(p1);
     
      setVisible(true);
    }
 public static void main(String args[])
 {
   new login();
 }
}
