/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class projectpage2chennai extends JFrame {

    private JButton home, roomavail, review, services, contact, login, signup, viewcal, book;

    public void chenpage() {
        home = new JButton("Home");
        roomavail = new JButton("View Rooms");
        book = new JButton("Make Booking");
        services = new JButton("Services");
        contact = new JButton("Contact Us");
        setTitle("Hotel");
        setSize(1600, 1000);
        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);
        JLabel pic = new JLabel(new ImageIcon("Chennai1.0.jpg"));
        pic.setOpaque(false);
        pic.setBounds(375, 0, 1000, 800);
        background.add(pic);
        home.setBounds(10, 170, 250, 30);
        background.add(home);
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        roomavail.setBounds(10, 270, 250, 30);
        background.add(roomavail);
        roomavail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewrooms2 room2 = new viewrooms2();
                room2.setupscreen4();
            }
        });
        this.setSize(1000, 450);
        this.setVisible(true);

        services.setBounds(10, 370, 250, 30);
        background.add(services);
        services.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Service ser = new Service();
                ser.setupscreen4();
            }
        });
        contact.setBounds(10, 470, 250, 30);
        background.add(contact);
        contact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contactus cont = new contactus();
                cont.contact();
            }
        });
        book.setBounds(10, 570, 250, 30);
        background.add(book);
        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Login_page.logperson.getcidate()!=null)
                {int i;
                     i = JOptionPane.showConfirmDialog(null,"You have already made a booking ! Making a new booking will cancel the old one ! Do you wish to proceed ?");
                     if(i==0)
                    {bookingpage page = new bookingpage();
                    try {
                        page.book();
                    } catch (AssertionError ex) {
                        Logger.getLogger(page2class.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(page2class.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                }
                else
                {bookingpage page = new bookingpage();
                try {
                    page.book();
                } catch (AssertionError ex) {
                    Logger.getLogger(projectpage2chennai.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(projectpage2chennai.class.getName()).log(Level.SEVERE, null, ex);
                }
            }}
        });
        this.setSize(1800, 1450);
        this.setVisible(true);

    }

}
