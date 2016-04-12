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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Make_Book extends JFrame {

    JButton bh1 = new JButton("Mumbai");
    JButton bh2 = new JButton("Chennai");
    JButton bh3 = new JButton("Bangalore");
    private ButtonHandler listener = new ButtonHandler();

    void setupscreen() {

        JPanel pane = new JPanel();
        pane.setLayout(null);

        JLabel p1 = new JLabel(new ImageIcon("mumbai hotel.jpg"));
        JLabel p2 = new JLabel(new ImageIcon("chennai hotel.jpg"));
        JLabel p3 = new JLabel(new ImageIcon("bangalore hotel.jpg"));
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);
        bh1.setBounds(100, 525, 220, 30);

        p1.setBounds(20, 200, 400, 300);
        background.add(p1);

        bh1.addActionListener((ActionListener) listener);
        background.add(bh1);

        bh2.setBounds(550, 525, 220, 30);

        background.add(bh2);
        bh2.addActionListener(listener);
        p2.setBounds(450, 200, 400, 300);
        background.add(p2);

        bh3.setBounds(980, 525, 220, 30);
        background.add(bh3);
        bh3.addActionListener(listener);
        p3.setBounds(900, 200, 400, 300);
        background.add(p3);
        JLabel label1 = new JLabel("Select city ", JLabel.CENTER);
        label1.setOpaque(false);
        label1.setBounds(460, 610, 400, 50);
        background.add(label1);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label1.setForeground(Color.BLACK);

        JLabel label = new JLabel("HASISA GROUP OF HOTELS", JLabel.CENTER);
        label.setBounds(420, 30, 500, 100);
        label.setOpaque(false);
        background.add(label);
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label.setForeground(Color.BLACK);
        this.setSize(1800, 1450);
        this.setVisible(true);
    }

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            {
                if (e.getSource() == bh1) {
                    Login_page.logperson.city = 1;
                    page2class p = new page2class();
                    p.mumpage();

                } else if (e.getSource() == bh2) {
                    Login_page.logperson.city = 2;
                    projectpage2chennai p2 = new projectpage2chennai();
                    p2.chenpage();
                } else if (e.getSource() == bh3) {
                    Login_page.logperson.city = 3;
                    projectpage2bang p3 = new projectpage2bang();
                    p3.bangpage();
                }
            }
        }
    }
}
