package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel L_Religion = new JLabel("Religion:");
        L_Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Religion.setBounds(100, 140, 100, 30);
        add(L_Religion);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel L_Category = new JLabel("Category:");
        L_Category.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Category.setBounds(100, 190, 200, 30);
        add(L_Category);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Others"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel L_Income = new JLabel("Income:");
        L_Income.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Income.setBounds(100, 240, 200, 30);
        add(L_Income);

        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel L_Educational = new JLabel("Educational");
        L_Educational.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Educational.setBounds(100, 290, 200, 30);
        add(L_Educational);

        JLabel L_Qualification = new JLabel("Qualification:");
        L_Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Qualification.setBounds(100, 315, 200, 30);
        add(L_Qualification);

        String valEducation[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctarate", "Others"};
        education = new JComboBox(valEducation);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel L_Occupation = new JLabel("Occupation:");
        L_Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Occupation.setBounds(100, 365, 200, 30);
        add(L_Occupation);

        String valOccupation[] = {"Salaried", "Student", "Self-Employed", "Bussiness", "Retired", "Others"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 365, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel L_PAN = new JLabel("PAN Number:");
        L_PAN.setFont(new Font("Raleway", Font.BOLD, 20));
        L_PAN.setBounds(100, 415, 200, 30);
        add(L_PAN);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 415, 400, 30);
        add(panTextField);

        JLabel L_Aadhar = new JLabel("Aadhar Number:");
        L_Aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        L_Aadhar.setBounds(100, 465, 200, 30);
        add(L_Aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 465, 400, 30);
        add(aadharTextField);

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 515, 200, 30);
        add(seniorCitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 515, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 515, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 565, 200, 30);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 565, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 565, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 665, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();

        String soccupation = (String) occupation.getSelectedItem();

        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try {
            conn c = new conn();
            String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '" + seniorcitizen + "', '" + existingaccount + "')";
            c.s.executeUpdate(query);

            setVisible(false);
            new SignupThree(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
