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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class bookingpage extends JFrame {

    private String[] month = {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private String[] date = {"Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] room = {"0", "1", "2", "3", "4", "5"};
    private String[] year = {"Year", "2015", "2016", "2017"};
    private JTextField tmonthin = new JTextField(15);
    private JTextField tdatein = new JTextField(15);
    private JTextField tyearin = new JTextField(15);
    private JComboBox cyearin = new JComboBox();
    private JComboBox cdatein = new JComboBox();
    private JComboBox cmonthin = new JComboBox();
    private JButton checkin = new JButton("Check Availability");
    private JButton viewcal = new JButton("View Calendar");
    private JTextField tmonthout = new JTextField(15);
    private JTextField tdateout = new JTextField(15);
    private JTextField tyearout = new JTextField(15);
    private JComboBox cyearout = new JComboBox();
    private JComboBox cdateout = new JComboBox();
    private JComboBox cmonthout = new JComboBox();
    private JComboBox grandroom = new JComboBox();
    private JComboBox regularroom = new JComboBox();
    private JComboBox deluxeroom = new JComboBox();
    private JTextField grandno = new JTextField(15);
    private JTextField regularno = new JTextField(15);
    private JTextField deluxeno = new JTextField(15);
    private JTextField amount = new JTextField(15);
    private JButton pay = new JButton("Pay Amount");
    private JButton amt = new JButton("View Bill Amount");
   // private int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
    public String monthin, monthout, datein, dateout, yearin, yearout;
    Integer diffDays;
    int grand, deluxe, regular;
    int bookingflag = 0;

    public void book() throws AssertionError, ParseException {
        grandno.setText("0");
        regularno.setText("0");
        deluxeno.setText("0");

        setSize(1600, 1000);
        
        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);

        JLabel in = new JLabel("CheckIn", JLabel.CENTER);
        in.setOpaque(false);
        in.setBounds(50, 50, 150, 30);
        in.setFont(new Font("Times New Roman", Font.BOLD, 30));
        background.add(in);
        JLabel out = new JLabel("CheckOut", JLabel.CENTER);
        out.setOpaque(false);
        out.setBounds(600, 50, 150, 30);
        out.setFont(new Font("Times New Roman", Font.BOLD, 30));
        background.add(out);
        checkin.setBounds(130, 500, 450, 50);
        background.add(checkin);
        viewcal.setBounds(800, 150, 200, 50);
        background.add(viewcal);
        viewcal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalendarProgram cal = new CalendarProgram();
                cal.calendar();
            }
        });
        background.add(checkin);
        viewcal = new JButton("View Calendar");
        tdatein.setBounds(250, 75, 100, 25);
        background.add(tdatein);
        cdatein.setBounds(250, 50, 100, 25);
        background.add(cdatein);
        tmonthin.setBounds(350, 75, 100, 25);
        background.add(tmonthin);
        cmonthin.setBounds(350, 50, 100, 25);
        background.add(cmonthin);
        tyearin.setBounds(450, 75, 100, 25);
        background.add(tyearin);
        cyearin.setBounds(450, 50, 100, 25);
        background.add(cyearin);

        for (int i = 0; i < 13; i++) {
            cmonthin.addItem(month[i]);
        }
        tmonthin.setEditable(false);

        for (int i = 0; i < 31; i++) {
            cdatein.addItem(date[i]);
        }
        tdatein.setEditable(false);

        for (int i = 0; i < 4; i++) {
            cyearin.addItem(year[i]);
        }
        tyearin.setEditable(false);

        cdatein.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tdatein.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                datein = tdatein.getText();
            }
        });

        cmonthin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tmonthin.setText((((JComboBox) e.getSource()).getSelectedItem().toString()) + "");
                monthin = tmonthin.getText();
            }
        });

        cyearin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tyearin.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                yearin = tyearin.getText();
            }
        });

        tdateout.setBounds(800, 75, 100, 25);
        background.add(tdateout);
        cdateout.setBounds(800, 50, 100, 25);
        background.add(cdateout);

        tmonthout.setBounds(900, 75, 100, 25);
        background.add(tmonthout);
        cmonthout.setBounds(900, 50, 100, 25);
        background.add(cmonthout);
        background.add(pay);

        tyearout.setBounds(1000, 75, 100, 25);
        background.add(tyearout);
        cyearout.setBounds(1000, 50, 100, 25);
        background.add(cyearout);

        for (int i = 0; i < 32; i++) {
            cdateout.addItem(date[i]);
        }
        tdateout.setEditable(false);

        for (int i = 0; i < 13; i++) {
            cmonthout.addItem(month[i]);
        }
        tmonthout.setEditable(false);

        for (int i = 0; i < 4; i++) {
            cyearout.addItem(year[i]);
        }
        tyearout.setEditable(false);

        cdateout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tdateout.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                dateout = tdateout.getText();
            }
        });
        cmonthout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tmonthout.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                monthout = tmonthout.getText();
            }
        });

        cyearout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tyearout.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                yearout = tyearout.getText();
            }
        });

        checkin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                   if(datein==null|| monthin==null||yearin==null||dateout==null||monthout==null||yearout==null)
                    {
                        JOptionPane.showMessageDialog(null,"Please select checkin and checkout dates");
                    }
                    else if(grandno.getText().equals("0")&& deluxeno.getText().equals("0") && regularno.getText().equals("0"))
                    {
                        JOptionPane.showMessageDialog(null,"Please select atleast one room");
                    }
                    else
                    {int flag = 0;
                   
                    Integer yin = (Integer.parseInt(tyearin.getText()));
                    Integer min = (Integer.parseInt(tmonthin.getText()));
                    Integer din = (Integer.parseInt(tdatein.getText()));
                    Integer yout = (Integer.parseInt(tyearout.getText()));
                    Integer mout = (Integer.parseInt(tmonthout.getText()));
                    Integer dout = (Integer.parseInt(tdateout.getText()));
                    String d1 = tdatein.getText() + "-" + tmonthin.getText() + "-" + tyearin.getText();
                    String d2 = tdateout.getText() + "-" + tmonthout.getText() + "-" + tyearout.getText();
                    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    try {
                        
                        int y = compareDatesByDateMethods(df, df.parse(d2), df.parse(d1));
                        if (y == 1) {
                            bookingflag = 1;
                            flag = 1;
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(bookingpage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    SimpleDateFormat simpleDF1, simpleDF2, simpleDF3, simpleDF;
                    Date date;
                    date = new Date();
                    simpleDF = new SimpleDateFormat("dd-MM-yyyy");
                    String s = simpleDF.format(date);
                    String ss = tdatein.getText() + "-" + tmonthin.getText() + "-" + tyearin.getText();

                    try {
                        int x = compareDatesByDateMethods(df, df.parse(ss), df.parse(s));
                        if (x == 1) {
                            bookingflag = 1;
                            flag = 2;
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(bookingpage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (flag == 0) {
                        try {
                            FileInputStream fisc = new FileInputStream("newPerson.dat");
                            ObjectInputStream oisc = new ObjectInputStream(fisc);
                            int pdeluxe = 5;
                            int pgrand = 5;
                            int pregular = 5;
                            Per cbook;
                            while ((cbook = (Per) oisc.readObject()) != null) {

                                if (!(cbook.getname().equals(Login_page.logperson.getname()))) {

                                    if (!(cbook.getcoyear()==null)) {

                                        Integer y1out = (Integer.parseInt(cbook.getcoyear()));

                                        Integer y1in = (Integer.parseInt(cbook.getciyear()));

                                        Integer m1in = (Integer.parseInt(cbook.getcimonth()));

                                        Integer m1out = (Integer.parseInt(cbook.getcomonth()));

                                        Integer d1in = (Integer.parseInt(cbook.getcidate()));

                                        Integer d1out = (Integer.parseInt(cbook.getcodate()));

                                        if ((!(yin <= y1in && yout <= y1in && min <= m1in && mout <= m1in && din < d1in && dout < d1in)) && (!(yin >= y1out && yout >= y1out && min >= m1out && mout >= m1out && din > d1out && dout > d1out))) {
                                            if (Login_page.logperson.city == cbook.city) {
                                                Integer sgrand = (Integer.parseInt(cbook.getgrand()));
                                                pgrand = pgrand - sgrand;
                                                Integer sdeluxe = (Integer.parseInt(cbook.getdeluxe()));
                                                pdeluxe = pdeluxe - sdeluxe;
                                                Integer sregular = (Integer.parseInt(cbook.getregular()));
                                                pregular = pregular - sregular;
                                            }

                                        }

                                    }
                                }
                                if (pgrand < Integer.parseInt(grandno.getText()) || pregular < Integer.parseInt(regularno.getText()) || pdeluxe < Integer.parseInt(deluxeno.getText())) {
                                    flag = 1;

                                    break;
                                }

                            }

                            oisc.close();
                            fisc.close();
                        } catch (EOFException ez) {
                        } catch (ClassNotFoundException ex2) {
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                    if (flag == 0) {
                        bookingflag = 0;
                        JOptionPane.showMessageDialog(null, "Booking is available, proceed to pay!", null, JOptionPane.INFORMATION_MESSAGE);
                    } else if (flag == 1) {
                        bookingflag = 1;
                        JOptionPane.showMessageDialog(null, "Booking not Available! Change dates or number of rooms and try again.", null, JOptionPane.INFORMATION_MESSAGE);
                    } else if (flag == 2) {
                        bookingflag = 1;
                        JOptionPane.showMessageDialog(null, "Invalid date. Please put date after " + s + " !", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    }
                
            }
        });

        JLabel regular = new JLabel("Regular Suite", JLabel.CENTER);
        regular.setOpaque(false);
        regular.setBounds(80, 340, 400, 50);
        regular.setFont(new Font("Times New Roman", Font.BOLD, 30));
        background.add(regular);

        regularno.setBounds(500, 360, 80, 30);
        background.add(regularno);
        regularroom.setBounds(500, 330, 80, 40);
        background.add(regularroom);

        for (int i = 0; i < 5;) {
            regularroom.addItem(room[i++]);
        }
        regularno.setEditable(false);

        regularroom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                regularno.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
            }
        });

        JLabel grand = new JLabel("Grand Suite", JLabel.CENTER);
        grand.setOpaque(false);
        grand.setBounds(80, 250, 400, 50);
        grand.setFont(new Font("Times New Roman", Font.BOLD, 30));
        background.add(grand);

        grandno.setBounds(500, 270, 80, 30);
        background.add(grandno);
        grandroom.setBounds(500, 240, 80, 40);
        background.add(grandroom);

        for (int i = 0; i < 5;) {
            grandroom.addItem(room[i++]);
        }
        grandno.setEditable(false);

        grandroom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                grandno.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
            }
        });

        JLabel deluxe = new JLabel("Deluxe Suite", JLabel.CENTER);
        deluxe.setOpaque(false);
        deluxe.setBounds(80, 160, 400, 50);
        deluxe.setFont(new Font("Times New Roman", Font.BOLD, 30));
        background.add(deluxe);

        deluxeno.setBounds(500, 180, 80, 30);
        background.add(deluxeno);
        deluxeroom.setBounds(500, 150, 80, 40);
        background.add(deluxeroom);

        for (int i = 0; i < 5;) {
            deluxeroom.addItem(room[i++]);
        }
        deluxeno.setEditable(false);

        deluxeroom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deluxeno.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                String del = deluxeno.getText();
            }
        });

        amt.setBounds(750, 250, 400, 50);
        background.add(amt);
        pay.setBounds(750, 550, 400, 50);
        background.add(pay);
        amount.setBounds(750, 400, 400, 50);
        background.add(amount);
        amount.setEditable(false);
        
        amt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar cal1 = Calendar.getInstance();
                Calendar cal2 = Calendar.getInstance();

                Integer yin = (Integer.parseInt(tyearin.getText()));
                Integer min = (Integer.parseInt(tmonthin.getText()));
                Integer din = (Integer.parseInt(tdatein.getText()));
                Integer yout = (Integer.parseInt(tyearout.getText()));
                Integer mout = (Integer.parseInt(tmonthout.getText()));
                Integer dout = (Integer.parseInt(tdateout.getText()));
                cal1.set(yin, min, din);
                cal2.set(yout, mout, dout);
                long milis1 = cal1.getTimeInMillis();
                long milis2 = cal2.getTimeInMillis();
                long diff = milis2 - milis1;

                 diffDays = (int) (diff / (24 * 60 * 60 * 1000));
                Integer s = (Login_page.logperson.getsum(Integer.parseInt(regularno.getText()), Integer.parseInt(grandno.getText()), Integer.parseInt(deluxeno.getText())));
                s = s * diffDays;
                amount.setText(s.toString());
            }
        });
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (bookingflag == 0) {
                    
                   
                    {dispose();
                        int i = JOptionPane.showConfirmDialog(null, "Booking Successful. View Booking");

                    ArrayList<Per> al = new ArrayList();
                    try {
                        FileInputStream fis = new FileInputStream("newPerson.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        Per c;
                        while ((c = (Per) ois.readObject()) != null) {

                            if (c.getname().equals(Login_page.logperson.getname())) {
                                c.setrooms(deluxeno.getText(), regularno.getText(), grandno.getText());
                                c.city = Login_page.logperson.city;
                                c.setdates(tdatein.getText(), tmonthin.getText(), tyearin.getText(), tdateout.getText(), tmonthout.getText(), tyearout.getText());
                                c.getsum(Integer.parseInt(regularno.getText())*diffDays, Integer.parseInt(grandno.getText())*diffDays, Integer.parseInt(deluxeno.getText())*diffDays);
                                Login_page.logperson.setdates(tdatein.getText(), tmonthin.getText(), tyearin.getText(), tdateout.getText(), tmonthout.getText(), tyearout.getText());
                                
                                Login_page.logperson.setrooms(deluxeno.getText(), regularno.getText(), grandno.getText());
                                
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

                    try {
                        FileOutputStream fos;
                        ObjectOutputStream oos;
                        fos = new FileOutputStream("newPerson.dat");
                        oos = new ObjectOutputStream(fos);

                        Per c;
                        Iterator i1 = al.iterator();
                        while (i1.hasNext()) {
                            c = (Per) i1.next();
                            oos.writeObject(c);

                        }

                        fos.close();
                        oos.close();

                    } catch (IOException e3) {
                    }
                    if (i == 0) {
                        View_book vb = new View_book();
                        vb.setupscreen();
                    } 
                    else {
                        int j=JOptionPane.showConfirmDialog(null, "Logout ?");
                        if(j==0)
                        {
                            Login_page.logperson=null;
                            dispose();
                            screen s=new screen();
                            s.setupscreen();
                        }
                    }
                    }
                }
                 else {
                    JOptionPane.showMessageDialog(null, "Booking is not available, please make changes!", null, JOptionPane.INFORMATION_MESSAGE);
                }
                
            
        }});
    }

    public int compareDatesByDateMethods(DateFormat df, Date oldDate, Date newDate) {

        if (oldDate.equals(newDate)) {

            return 0;
        }

        if (oldDate.before(newDate)) {

            return 1;

        }

        if (oldDate.after(newDate)) {

            return 0;
        }
        return 0;
    }
}
