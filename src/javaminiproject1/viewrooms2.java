/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author User
 */
public class viewrooms2 extends JFrame {

    public void setupscreen4() {
        //Adding Background    
        setVisible(true);
        this.setSize(1800, 1450);
        JPanel pane = new JPanel();
        pane.setLayout(null);
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        background.setBounds(00, 00, 400, 300);
        add(background);

        //Adding 3 images 
        JLabel jLabel1 = new JLabel(new ImageIcon("Chennai2.1.jpg"));
        JLabel jLabel2 = new JLabel(new ImageIcon("Chennai2.2.jpg"));
        JLabel jLabel3 = new JLabel(new ImageIcon("Chennai2.3.jpg"));
        jLabel1.setOpaque(true);
        jLabel1.setBounds(360, 0, 800, 200);
        background.add(jLabel1);
        jLabel2.setOpaque(true);
        jLabel2.setBounds(360, 220, 800, 200);
        background.add(jLabel2);
        jLabel3.setOpaque(true);
        jLabel3.setBounds(360, 440, 800, 200);
        background.add(jLabel3);

        //Adding Room Labels
        JLabel jLabel4 = new JLabel("GRAND SUITE", JLabel.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.setBounds(10, 0, 345, 30);
        jLabel4.setFont(new Font("Castellar", Font.PLAIN, 18));
        background.add(jLabel4);

        JLabel jLabel5 = new JLabel("REGULAR SUITE", JLabel.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.setBounds(10, 220, 345, 30);
        jLabel5.setFont(new Font("Castellar", Font.PLAIN, 18));
        background.add(jLabel5);

        JLabel jLabel6 = new JLabel("DELUXE SUITE", JLabel.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.setBounds(10, 440, 345, 30);
        jLabel6.setFont(new Font("Castellar", Font.PLAIN, 18));
        background.add(jLabel6);

        //Adding Description
        JTextArea jTextArea1 = new JTextArea("   The Grand suite  offers facilities \n"
                + "   that will pamper you  in every way\n"
                + "   possible and make sure your stay  \n"
                + "   at Hasisa is pleasureable.\n   RATE:Rs.10,000/day");
        jTextArea1.setOpaque(true);
        jTextArea1.setBounds(10, 30, 345, 170);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Aparajita", Font.PLAIN, 24));
        background.add(jTextArea1);
        JTextArea jTextArea2 = new JTextArea("   All the needs of the residents of\n"
                + "   the suite will be catered to with\n"
                + "   our best employees at every beck \n"
                + "   and call. \n   RATE:Rs.2,000/day");
        jTextArea2.setOpaque(true);
        jTextArea2.setBounds(10, 250, 345, 170);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new Font("Aparajita", Font.PLAIN, 24));
        background.add(jTextArea2);
        JTextArea jTextArea3 = new JTextArea("   Cosy and Comfortable are what \n"
                + "   best describes the most popular \n"
                + "   room option available with us.\n"
                + "   We promise a home away from home.\n   RATE:Rs.5,000/day");
        jTextArea3.setOpaque(true);
        jTextArea3.setBounds(10, 470, 345, 170);
        jTextArea3.setEditable(false);
        jTextArea3.setFont(new Font("Aparajita", Font.PLAIN, 24));
        background.add(jTextArea3);

    }

}
