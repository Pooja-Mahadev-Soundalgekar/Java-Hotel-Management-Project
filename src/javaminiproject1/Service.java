/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author User
 */

public class Service extends JFrame{
     
    void setupscreen4()
    {
    //Adding Background    
    setVisible(true);
    this.setSize(1800, 1450);
    JPanel pane = new JPanel();
    pane.setLayout(null);
    JLabel background=new JLabel(new ImageIcon("background.jpg"));
    background.setBounds(00,00,400,300);
    add(background);
    
    //Adding 3 images 
    JLabel jLabel1= new JLabel(new ImageIcon("Hotel3.0.jpg"));
    JLabel jLabel2= new JLabel(new ImageIcon("Hotel3.1.jpg"));
    JLabel jLabel3= new JLabel(new ImageIcon("Hotel3.2.jpg"));
    JLabel jLabel4= new JLabel(new ImageIcon("Hotel3.3.jpg"));
    JLabel jLabel5= new JLabel(new ImageIcon("Hotel3.4.jpg"));
    jLabel1.setOpaque(true);
    jLabel1.setBounds(20,0,250,130);
    background.add(jLabel1);
    jLabel2.setOpaque(true);
    jLabel2.setBounds(20,150,250,130);
    background.add(jLabel2);
    jLabel3.setOpaque(true);
    jLabel3.setBounds(20,300,250,130);
    background.add(jLabel3);
    jLabel4.setOpaque(true);
    jLabel4.setBounds(20,450,250,130);
    background.add(jLabel4);
    jLabel5.setBounds(20,600,250,130);
    background.add(jLabel5);
    
    //Adding Labels
    JLabel jLabel6= new JLabel("BUTLER SERVICE",JLabel.CENTER);
    jLabel6.setOpaque(true);
    jLabel6.setBounds(270,0,300,130);
    jLabel6.setFont(new Font("Castellar",Font.PLAIN,18));
     background.add(jLabel6);
     
    JLabel jLabel7= new JLabel("LAUNDRY SERVICE",JLabel.CENTER);
    jLabel7.setOpaque(true);
    jLabel7.setBounds(270,150,300,130);
    jLabel7.setFont(new Font("Castellar",Font.PLAIN,18));
     background.add(jLabel7);
     
    JLabel jLabel8= new JLabel("ROOM SERVICE",JLabel.CENTER);
    jLabel8.setOpaque(true);
    jLabel8.setBounds(270,300,300,130);
    jLabel8.setFont(new Font("Castellar",Font.PLAIN,18));
     background.add(jLabel8);
   
       
    JLabel jLabel9= new JLabel("COMPLIMENTARY WIFI",JLabel.CENTER);
    jLabel9.setOpaque(true);
    jLabel9.setBounds(270,450,300,130);
    jLabel9.setFont(new Font("Castellar",Font.PLAIN,18));
     background.add(jLabel9);
     
       
    JLabel jLabel10= new JLabel("HEALTH CLUB",JLabel.CENTER);
    jLabel10.setOpaque(true);
    jLabel10.setBounds(270,600,300,130);
    jLabel10.setFont(new Font("Castellar",Font.PLAIN,18));
     background.add(jLabel10);
   
     //Adding Description
    JTextArea jTextArea1=new JTextArea("At Hasisa, you can take advantage of our impeccable butler service at any time, day or night. From carrying your luggage,\n to bringing you breakfast every morning, our butlers will charm you with their graciousness. Just inform your personal\n butler of your requirements and you can be rest assured that it will be taken care of.");
    jTextArea1.setOpaque(true);
    jTextArea1.setBounds(575,0,800,130);
    jTextArea1.setEditable(false);
    jTextArea1.setFont(new Font("Aparajita",Font.PLAIN,20));
    background.add(jTextArea1);
    JTextArea jTextArea2=new JTextArea("We understand the need for quick service for the business traveller. We offer same day laundry and dry-cleaning \n service. Each morning, before 10 am, the housekeeping staff will come and collect the clothes from your room,\n which will be delivered the same day by 5 pm. Express service is also available.");
    jTextArea2.setOpaque(true);
    jTextArea2.setBounds(575,150,800,130);
    jTextArea2.setEditable(false);
    jTextArea2.setFont(new Font("Aparajita",Font.PLAIN,20));
    background.add(jTextArea2);
    JTextArea jTextArea3=new JTextArea("There is a pleasant alternative for times when you would just like to relax in the tranquility of your room. The 24 hour\n in-room dining service is tailor-made for such days. You can have the whole range of international and national\n cuisines offered at our specialty restaurants delivered to your room at any time you wish.");
    jTextArea3.setOpaque(true);
    jTextArea3.setBounds(575,300,800,130);
    jTextArea3.setEditable(false);
    jTextArea3.setFont(new Font("Aparajita",Font.PLAIN,20));
    background.add(jTextArea3);
    JTextArea jTextArea4=new JTextArea("Driven by our mission to deliver maximum comfort to our guests, Hasisa provides a complimentary Wi-Fi Internet service that guarantees\n a complication-free high speed connection.");
    jTextArea4.setOpaque(true);
    jTextArea4.setBounds(575,450,800,130);
    jTextArea4.setEditable(false);
    jTextArea4.setFont(new Font("Aparajita",Font.PLAIN,20));
    background.add(jTextArea4);
    JTextArea jTextArea5=new JTextArea("Work out in style under the guidance of professional trainers at the world-class fitness centre at Ellaa. Our fully-equipped fitness\n centre, with an extensive range of modern equipment, will make working out a pleasure for you.");
    jTextArea5.setOpaque(true);
    jTextArea5.setBounds(575,600,800,130);
    jTextArea5.setEditable(false);
    jTextArea5.setFont(new Font("Aparajita",Font.PLAIN,20));
    background.add(jTextArea5);
    }
}
    
