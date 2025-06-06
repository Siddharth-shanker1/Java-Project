package bank.management.system;

import java.awt.Color;
import javax.swing.*;
//import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    String pinnumber;

    MiniStatement(String pinnumber) {
        this.pinnumber = pinnumber;

        setLayout(null);
        setTitle("Mini Statement");

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("Select * from login where pinnumber = '" + pinnumber + "'");
            while (rs.next()) {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            conn c = new conn();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("Select * from bank where pin = '" + pinnumber + "'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balance is Rs " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }

        JLabel bank = new JLabel("State Bank of India");
        bank.setBounds(130, 20, 150, 20);
        add(bank);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new MiniStatement("");
    }
}
