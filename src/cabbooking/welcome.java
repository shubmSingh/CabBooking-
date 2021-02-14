package cabbooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class welcome extends JFrame
{
   welcome()
    {
           setSize(880,550);
           setLayout(null);
           JPanel p=new JPanel();
           p.setSize(880,550);
           JPanel p2=new JPanel();
           p2.setBounds(0,05,900,50);
           JLabel label = new JLabel();  
           label.setIcon(new ImageIcon("ak.jpg"));
           JLabel l2=new JLabel("Welcome to Cab Booking System");
           l2.setBounds(200,05,400,150);
           l2.setFont(new Font("Serif",Font.BOLD,26));
           p2.setBackground(new Color(0,0,0,80));
           l2.setForeground(Color.WHITE);
           JLabel l3=new JLabel("Click Enter to Book your taxi");
           l3.setFont(new Font("Serif",Font.BOLD,20));
           l3.setBounds(0,0,400,50);
           l3.setForeground(new Color(253, 94, 83));
           JLabel l4=new JLabel("Save Your Precious Time");
           l4.setFont(new Font("Serif",Font.BOLD,20));
           l4.setBounds(15,30,400,50);
           l4.setForeground(new Color(253, 94, 83));
           JLabel l5=new JLabel("Thank You !");
           l5.setFont(new Font("Serif",Font.BOLD,20));
           l5.setBounds(60,60,400,50);
           l5.setForeground(new Color(253, 94, 83));
           JPanel p3=new JPanel();
           p3.setLayout(null);
           p3.setBackground(new Color(0,0,0,120));
           p3.setBounds(320,140,260,180);
           JButton b=new JButton("Enter");
           b.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent e)
            {
              new CabBooking();
              dispose();
            }
           });
           b.setForeground(Color.BLACK);
           b.setBounds(50,135,150,30);
           b.setFont(new Font("Serif",Font.BOLD,22));
           b.setBackground(new Color(248,148,6));
           
           p2.add(l2);
           p3.add(l3);
           p3.add(l5);
           p3.add(l4);
           p3.add(b);
           p.add(label);
           label.add(p2);
           label.add(p3);
           add(p);
           setVisible(true);
    }
    public static void main(String args[])
    {
        new welcome();
    }
}

