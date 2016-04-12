/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

/**
 *
 * @author lenovo
 */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
public class Sign_up extends JFrame {

    JPanel p1;
    Container c;

    private JLabel name, email_id, password;
    private JTextField n, e;
    private JPasswordField p;
    private JButton signup, clear;

    Sign_up() {

        setTitle("Sign up");
        c = getContentPane();
        c.setLayout(new BoxLayout(c, 3));

        p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2, 10, 10));
        setSize(400, 400);
        setVisible(true);

        name = new JLabel("Name");

        n = new JTextField(40);

        password = new JLabel("Password");

        p = new JPasswordField(8);
        p.setEchoChar('*');

        email_id = new JLabel("Email ID");
        e = new JTextField(20);

        signup = new JButton("Sign up");
        clear = new JButton("Clear all");
        JLabel l1 = new JLabel("");
        JLabel l2 = new JLabel("");

        p1.add(l1);
        p1.add(l2);
        p1.add(name);
        p1.add(n);
        p1.add(password);
        p1.add(p);
        p1.add(email_id);
        p1.add(e);
        p1.add(signup);
        p1.add(clear);

        c.add(p1);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ex) {
                n.setText("");
                p.setText("");
                e.setText("");
            }
        });
        signup.addActionListener(new ActionListener() {
            //Code for saving signup details to file
            public void actionPerformed(ActionEvent ex) {
                ArrayList<Per> al = new ArrayList();

                int flag = 0;
                try {
                    FileInputStream fis = new FileInputStream("newPerson.dat");
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    Per c;
                    while ((c = (Per) ois.readObject()) != null) {
                        if (c.getname().equals(n.getText())) {
                            flag = 1;
                            break;
                        }
                        al.add(c);
                    }
                    ois.close();
                    fis.close();
                }
                catch(FileNotFoundException e)
                {}
                catch (EOFException e) {
                } catch (ClassNotFoundException ex2) {
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (flag == 0) {
                    //write to file only if name doesn't exist
                    Per p2 = new Per();
                    char[] ch = p.getPassword();
                    String s = new String(ch);
                    p2.signup(n.getText(), e.getText(), s);

                    al.add(p2);
                    try {
                        FileOutputStream fos;
                        ObjectOutputStream oos;
                        fos = new FileOutputStream("newPerson.dat");
                        oos = new ObjectOutputStream(fos);

                        Per c;
                        Iterator i = al.iterator();
                        while (i.hasNext()) {
                            c = (Per) i.next();
                            oos.writeObject(c);

                        }

                        fos.close();
                        oos.close();
                        dispose();
                        JOptionPane.showMessageDialog(null, "Welcome to HASISA " + '\n'
                                + n.getText() + "," + "\nYou have succesfully signed up ", "Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "SORRY" + '\n'
                            + n.getText() + ", Already exists!\n Try again. ",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

    }
}
