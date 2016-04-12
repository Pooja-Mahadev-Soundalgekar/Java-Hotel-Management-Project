/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

/**
 *
 * @author admin
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Javaminiproject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        screen s = new screen();
        s.setupscreen();

    }

}

class screen extends JFrame {

    JButton login = new JButton("Log in");
    JButton signup = new JButton("Sign Up");

    JLabel bh1 = new JLabel("Mumbai");
    JLabel bh2 = new JLabel("Chennai");
    JLabel bh3 = new JLabel("Bangalore");

    void setupscreen() {

        JPanel pane = new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pane.setLayout(null);

        JLabel p1 = new JLabel(new ImageIcon("mumbai hotel.jpg"));
        JLabel p2 = new JLabel(new ImageIcon("chennai hotel.jpg"));

        JLabel p3 = new JLabel(new ImageIcon("bangalore hotel.jpg"));
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);
        bh1.setBounds(100, 525, 220, 30);

        p1.setBounds(20, 200, 400, 300);
        background.add(p1);
        login.setBounds(1100, 10, 100, 20);
        background.add(login);
        signup.setBounds(1200, 10, 100, 20);
        background.add(signup);

        background.add(bh1);

        bh2.setBounds(550, 525, 220, 30);
        bh1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bh1.setForeground(Color.BLACK);

        background.add(bh2);
        bh2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bh2.setForeground(Color.BLACK);

        p2.setBounds(450, 200, 400, 300);
        background.add(p2);

        bh3.setBounds(980, 525, 220, 30);
        background.add(bh3);
        bh3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bh3.setForeground(Color.BLACK);

        p3.setBounds(900, 200, 400, 300);
        background.add(p3);

        JLabel label = new JLabel("HASISA GROUP OF HOTELS", JLabel.CENTER);
        label.setBounds(420, 30, 500, 100);
        label.setOpaque(false);
        background.add(label);
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label.setForeground(Color.BLACK);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login_page lp = new Login_page();
            }
        });

        signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sign_up lp = new Sign_up();
            }
        });

        this.setSize(1800, 1450);
        this.setVisible(true);
    }

}
