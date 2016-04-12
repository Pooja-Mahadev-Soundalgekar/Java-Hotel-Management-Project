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
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javaminiproject1.Login_page;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class After_login extends JFrame {

    JPanel p1;
    Container c;

    After_login() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 3, 5, 10));
        setSize(400, 400);
        setVisible(true);
        setResizable(true);

        JTextField t = new JTextField(10);
        t.setText(Login_page.logperson.getname());
        t.setEditable(false);

        JButton b1 = new JButton("New Booking");
        JButton b2 = new JButton("View Booking");
        JButton b3 = new JButton("Cancel Booking");
        JLabel l = new JLabel("Name of the user");

        JLabel blank = new JLabel("");

        setTitle("logged in");

        p1.add(l);
        p1.add(t);
        p1.add(blank);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        c.add(p1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i=-1;
                if(Login_page.logperson.getcidate()!=null)
                {
                     i = JOptionPane.showConfirmDialog(null,"You have already made a booking ! Making a new booking will cancel the old one ! Do you wish to proceed ?");
                     if(i==0)
                    {Make_Book mb = new Make_Book();
                    mb.setupscreen();
                    }
                }
                else
                {
                   Make_Book mb = new Make_Book();
                    mb.setupscreen(); 
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                View_book vb = new View_book();
                vb.setupscreen();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Login_page.logperson.getciyear() == null) {
                        
                        JOptionPane.showMessageDialog(null, "No Bookings Made !");

                    }
                else
                {int i = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (i == 0) {
                      
                     
                        

                        ArrayList<Per> al = new ArrayList();int ts=0;
                        try {
                            FileInputStream fis = new FileInputStream("newPerson.dat");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            
                            Per c;
                            while ((c = (Per) ois.readObject()) != null) {
                                if (c.getname().equals(Login_page.logperson.getname())) {
                                    ts=c.getamount();
                                    c.setrooms("0", "0", "0");
                                    c.setdates(null, null, null, null, null, null);
                                    Login_page.logperson.setdates(null, null, null, null, null, null);
                                    Login_page.logperson.setrooms(null, null, null);
                                    
                                }
                                al.add(c);
                            }
                            ois.close();
                            fis.close();
                        } catch (EOFException e1) {
                        } catch (ClassNotFoundException ex2) {
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        JOptionPane.showMessageDialog(null, "Booking Cancelled ! Rs."+ts+" will be refunded to your account .");
                        try {
                            FileOutputStream fos;
                            ObjectOutputStream oos;
                            fos = new FileOutputStream("newPerson.dat");
                            oos = new ObjectOutputStream(fos);

                            Per c;
                            Iterator i2 = al.iterator();
                            while (i2.hasNext()) {
                                c = (Per) i2.next();
                                oos.writeObject(c);

                            }

                            fos.close();
                            oos.close();

                        } catch (IOException e3) {
                        }
                    }
                }
            }
        });
    }
}
