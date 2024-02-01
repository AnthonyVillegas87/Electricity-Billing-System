import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel label;

    Font f, f1, f2;

    TextArea t1;

    String aboutMessage;

    public About() {
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);


        Font f = new Font("", Font.BOLD, 180);
        setFont(f);

        aboutMessage = "            About Project               \n" +
                " Electricity Billing System is a software-based application " +
                " developed in the Java programming language. This project aims at serving " +
                " the department of electricity by implementing a billing system. " +
                " Its sole purpose is the calculation of units consumed during a specific time " +
                " and the amount billed to customers which is to be paid to the billing department. " ;
          TextArea t1 = new TextArea(aboutMessage, 10, 40, Scrollbar.VERTICAL);
          t1.setEditable(false);
          t1.setBounds(20, 100, 450, 300);
          add(t1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
