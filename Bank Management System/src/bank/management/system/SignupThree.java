package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton saving, fixed, current, recurring;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        JLabel additionalDetails = new JLabel("Page 3: Account Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(280, 40, 400, 40);
        add(additionalDetails);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(100, 140, 200, 30);
        add(type);

        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBounds(100, 180, 150, 20);
        saving.setBackground(Color.WHITE);
        add(saving);

        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Raleway", Font.BOLD, 16));
        fixed.setBounds(350, 180, 250, 20);
        fixed.setBackground(Color.WHITE);
        add(fixed);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBounds(100, 220, 200, 20);
        current.setBackground(Color.WHITE);
        add(current);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 16));
        recurring.setBounds(350, 220, 250, 20);
        recurring.setBackground(Color.WHITE);
        add(recurring);

        ButtonGroup AccountTypeGroup = new ButtonGroup();
        AccountTypeGroup.add(saving);
        AccountTypeGroup.add(fixed);
        AccountTypeGroup.add(current);
        AccountTypeGroup.add(recurring);

        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-5160");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel cardInstruction = new JLabel("Your 16 Digit Card Number");
        cardInstruction.setFont(new Font("Raleway", Font.BOLD, 12));
        cardInstruction.setBounds(100, 335, 400, 20);
        add(cardInstruction);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pinInstruction = new JLabel("Your 4 Digit Password");
        pinInstruction.setFont(new Font("Raleway", Font.BOLD, 12));
        pinInstruction.setBounds(100, 400, 300, 20);
        add(pinInstruction);

        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above entered details are correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (saving.isSelected()) {
                accountType = "Saving Account";
            } else if (fixed.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (current.isSelected()) {
                accountType = "Current Account";
            } else if (recurring.isSelected()) {
                accountType = "Reccuring deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040921000000000L);

            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";
            if (c1.isSelected()) {
                facility += "ATM Card, ";
            }
            if (c2.isSelected()) {
                facility += "Internet Banking, ";
            }
            if (c3.isSelected()) {
                facility += "Mobile Banking, ";
            }
            if (c4.isSelected()) {
                facility += "EMAIL & SMS Alert, ";
            }
            if (c5.isSelected()) {
                facility += "Cheque Book, ";
            }
            if (c6.isSelected()) {
                facility += "E-Statement, ";
            }

            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null, "Please confirm the declaration to proceed.");
                }else {
                    conn c = new conn();
                    String query1 = "insert into signupthree values('" + formno + "', '" + accountType + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility + "')";
                    String query2 = "insert into login values('" + formno + "', '" + cardnumber + "', '" + pinnumber + "')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number " + cardnumber + "\n Pin: " + pinnumber);
                }
                
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                    
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String args[]) {
        new SignupThree("");
    }
}
