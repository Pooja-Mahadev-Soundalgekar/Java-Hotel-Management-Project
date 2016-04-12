/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

/**
 *
 * @author Pooja M S
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class contactus extends JFrame {

    public void contact() {
        setSize(1600, 1000);
        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);
        JLabel label1 = new JLabel("Contact US ", JLabel.CENTER);
        label1.setOpaque(false);
        label1.setBounds(500, 10, 400, 50);
        background.add(label1);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label1.setForeground(Color.BLACK);

        JLabel jLabel6 = new JLabel("ADDRESS", JLabel.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.setBounds(20, 150, 300, 130);
        jLabel6.setFont(new Font("Castellar", Font.PLAIN, 22));
        background.add(jLabel6);

        JLabel jLabel7 = new JLabel("EMAIL", JLabel.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.setBounds(20, 300, 300, 130);
        jLabel7.setFont(new Font("Castellar", Font.PLAIN, 22));
        background.add(jLabel7);

        JLabel jLabel8 = new JLabel("TELEPHONE", JLabel.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.setBounds(20, 450, 300, 130);
        jLabel8.setFont(new Font("Castellar", Font.PLAIN, 22));
        background.add(jLabel8);

        JTextArea jTextArea2 = new JTextArea("Girls Hostel\nNITK SURATHKAL\nMangalore");
        jTextArea2.setOpaque(true);
        jTextArea2.setBounds(575, 150, 800, 130);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new Font("Aparajita", Font.PLAIN, 20));
        background.add(jTextArea2);
        JTextArea jTextArea3 = new JTextArea("customerdesk@hasisa.in");
        jTextArea3.setOpaque(true);
        jTextArea3.setBounds(575, 300, 800, 130);
        jTextArea3.setEditable(false);
        jTextArea3.setFont(new Font("Aparajita", Font.PLAIN, 20));
        background.add(jTextArea3);
        JTextArea jTextArea4 = new JTextArea("+022 4411 2233");
        jTextArea4.setOpaque(true);
        jTextArea4.setBounds(575, 450, 800, 130);
        jTextArea4.setEditable(false);
        jTextArea4.setFont(new Font("Aparajita", Font.PLAIN, 20));
        background.add(jTextArea4);

    }
}
