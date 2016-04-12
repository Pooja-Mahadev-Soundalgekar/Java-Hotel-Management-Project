/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

import java.awt.Color;
import java.awt.Font;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import static javaminiproject1.Login_page.logperson;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */

//in this class read the file and if booking is made only then execute else give out an optionpane to say noo booking

public class View_book extends JFrame {

    void setupscreen() {

        JPanel pane = new JPanel();
        pane.setLayout(null);
        

        JLabel p1 = new JLabel("User Name");
        JLabel p2 = new JLabel("Checkin ");
        JLabel p3 = new JLabel("Checkout ");
        JLabel p4 = new JLabel("Rooms: ");
        JLabel p5 = new JLabel("Deluxe");
        JLabel p6 = new JLabel("Grand");
        JLabel p7 = new JLabel("Regular");
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(10);
        JTextField t5 = new JTextField(10);
        JTextField t6 = new JTextField(10);
        JTextField t7 = new JTextField(10);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        setVisible(true);
        this.setSize(1800, 1450);
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);

        p1.setBounds(390,50,300,50);
        p1.setFont(new Font("Castellar",Font.BOLD, 30));
        p1.setForeground(Color.BLACK);
        p2.setBounds(390,170,300,50);
        p2.setFont(new Font("Castellar",Font.BOLD, 30));
        p2.setForeground(Color.BLACK);
        p3.setBounds(390,290,300,50);
        p3.setFont(new Font("Castellar",Font.BOLD, 30));
        p3.setForeground(Color.BLACK);
        p4.setBounds(390,410,300,50);
        p4.setFont(new Font("Castellar",Font.BOLD, 30));
        p4.setForeground(Color.BLACK);
        p5.setBounds(540,410,300,50);
        p5.setFont(new Font("Castellar",Font.BOLD, 25));
        p5.setForeground(Color.BLACK);
        p6.setBounds(540,500,300,50);
        p6.setFont(new Font("Castellar",Font.BOLD, 25));
        p6.setForeground(Color.BLACK);
        p7.setBounds(540,590,300,50);
        p7.setFont(new Font("Castellar",Font.BOLD, 25));
        p7.setForeground(Color.BLACK);
        
        t1.setBounds(700,50,400,50);
        t2.setBounds(700,170,400,50);
        t3.setBounds(700,290,400,50);
        t4.setBounds(700,410,400,50);
        t5.setBounds(700,500,400,50);
        t6.setBounds(700,590,400,50);
        t7.setBounds(1200,10,100,20);
        background.add(p1);
        background.add(p2);
        background.add(p3);
        background.add(p4);
        background.add(p5);
        background.add(p6);
        background.add(p7);
        background.add(t1);
       
        background.add(t2);
       
        background.add(t3);
        
        background.add(t4);
        
        background.add(t5);
        
        background.add(t6);
        
        background.add(t7);
        Per c1;
        try 
              {
              FileInputStream fis1 = new FileInputStream("newPerson.dat");
              ObjectInputStream ois1 = new ObjectInputStream(fis1);
              
              while((c1 = (Per)ois1.readObject()) != null) 
              {
                if(c1.getname().equals(logperson.getname()) )
                {
                    if(c1.getciyear()==null){
                        dispose();
                        JOptionPane.showMessageDialog(null,"No Bookings Made");
                        
                    }
                    else
                    {
                    t1.setText(logperson.getname());
                    t2.setText(logperson.getcidate()+" / "+logperson.getcimonth()+" / "+logperson.getciyear());
                    t3.setText(logperson.getcodate()+" / "+logperson.getcomonth()+" / "+logperson.getcoyear());
                    t4.setText(logperson.getdeluxe());
                    t5.setText(logperson.getgrand());
                    t6.setText(logperson.getregular());
                    if(c1.getcity()==1)
                        t7.setText("Mumbai");
                    if(c1.getcity()==3)
                        t7.setText("Bangalore");
                    if(c1.getcity()==2)
                        t7.setText("Chennai");
                    } 
                }
              }
               ois1.close();
               fis1.close();
              }
            
              catch(EOFException e) {}
              catch(ClassNotFoundException ex2){}
              catch(IOException e) {}
              catch(NullPointerException np){System.out.println(np.getMessage());
              np.printStackTrace();}
    }
    
}

