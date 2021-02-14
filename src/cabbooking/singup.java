/*
Name - Shubham Singh
Roll no- 18MCMC52
this code is for registration
*/
package cabbooking;

import com.mysql.jdbc.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class singup extends JFrame
{
    JFrame f=new JFrame();
    JButton b1,b2;
    JTextArea ta;
    JTextField j1,j2,j3,j4,j5;
    JPasswordField pass1,pass2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
  singup()
  {
     
     f.setSize(400,600);
     f.setLayout(null);
     //panel 1
     JPanel p1 =new JPanel();
     p1.setLayout(null);
      p1.setBackground(new Color(248,148,6));
      p1.setBounds(0,0,400,50);
      //label
      JLabel l = new JLabel("Registration Form");
      l.setBounds(90,10,500,40);
      l.setFont(new Font("Serif",Font.BOLD,24));
     p1.add(l); 
     //panel2
     JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBounds(0,50,400,550);
     p2.setBackground(new Color(44,62,80));
     
     l1=new JLabel("First Name:");
     l1.setBounds(10,70,150,20);
     l1.setFont(new Font("Serif",Font.BOLD,18));
     l1.setForeground(Color.white);
     l2=new JLabel("Last Name:");
     l2.setBounds(10,110,150,20);
     l2.setFont(new Font("Serif",Font.BOLD,18));
     l2.setForeground(Color.white);
     l3=new JLabel("User Name:");
     l3.setBounds(10,150,150,20);
     l3.setFont(new Font("Serif",Font.BOLD,18));
     l3.setForeground(Color.white);
     l4=new JLabel("Password:");
     l4.setBounds(10,190,150,20);
     l4.setFont(new Font("Serif",Font.BOLD,18));
     l4.setForeground(Color.white);
     l5=new JLabel("Re-enter Pass:");
     l5.setBounds(10,230,150,20);
     l5.setFont(new Font("Serif",Font.BOLD,18));
     l5.setForeground(Color.white);
     l6=new JLabel("BirthDate:");
     l6.setBounds(10,270,150,20);
     l6.setFont(new Font("Serif",Font.BOLD,18));
     l6.setForeground(Color.white);
     l7=new JLabel("Gender:");
     l7.setBounds(10,310,150,20);
     l7.setFont(new Font("Serif",Font.BOLD,18));
     l7.setForeground(Color.white);
     l8=new JLabel("Address:");
     l8.setBounds(10,350,150,20);
     l8.setFont(new Font("Serif",Font.BOLD,18));
     l8.setForeground(Color.white);
     
     //textfields
     
     j1=new JTextField();
     j1.setBounds(170,73,170,20);
     j2=new JTextField();
     j2.setBounds(170,115,170,20);
     j3=new JTextField();
     j3.setBounds(170,155,170,20);
     JPasswordField pass1=new JPasswordField();
     pass1.setBounds(170,195,170,20);
     JPasswordField pass2=new JPasswordField();
     pass2.setBounds(170,230,170,20);
     j4=new JTextField();
     j4.setBounds(170,270,170,20);
     j5=new JTextField();
     j5.setBounds(170,310,170,20);
     ta=new JTextArea();
     ta.setBounds(170,350,170,80);
     
     //Buttons
     b1=new JButton("Cancel");
     b1.setBounds(80,450,90,30);
    // b1.addActionListener(new ActionListener()
      //{
        //  public void actionPerformed(ActionEvent e)
          //{
         
            // f.dispose();
          //}
      //});
     b2=new JButton("Register");
     b2.setBounds(190,450,90,30);
      b2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
             
             String firstname =j1.getText();
             String lastname =j2.getText();
             String username=j3.getText();
             String password=pass1.getText();
             String repassword =pass2.getText();
             String birthdate = j4.getText();
             String gender = j5.getText();
             String Address =ta.getText();

             
             try {
                    com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalcars?zeroDateTimeBehavior=convertToNull",
                        "root", "");

                    com.mysql.jdbc.PreparedStatement st = (com.mysql.jdbc.PreparedStatement) connection
                        .prepareStatement("Insert into login values (?,?,?,?,?,?,?,?)");
                 
                   
                    st.setString(1, username);
                    st.setString(2, password);
                    st.setString(3, firstname);
                    st.setString(4, lastname);
                    st.setString(5, repassword);
                    st.setString(6, birthdate);
                    st.setString(7, gender);
                    st.setString(8, Address);
                    st.executeUpdate();
                    
                    
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                      }
             f.dispose();
               }
         });
	   
     b1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
             f.dispose();
          }
      });
     
     
     //adding in panel2
     p2.add(b2);
     p2.add(b1);
     p2.add(l1);
     p2.add(j5);
     p2.add(l2);
     p2.add(l3);
     p2.add(l4);
     p2.add(l5);
     p2.add(l6);
     p2.add(l7);
     p2.add(l8);
     p2.add(j1);
     p2.add(j2);
     p2.add(j3);
     p2.add(j4);
     p2.add(pass1);
     p2.add(pass2);
     p2.add(ta);
     //p2.add(L);
     //adding in frame 
     
     
     f.add(p1);
     f.add(p2);
     f.setVisible(true);
     
      
  }
  
  
  
   
  public static void main(String args[])
  {
    new singup();
  }
}
