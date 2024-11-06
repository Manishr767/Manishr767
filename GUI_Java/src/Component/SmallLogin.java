package Component;

import javax.swing.*;
import java.awt.*;

public class SmallLogin extends JFrame {
    public SmallLogin(){
        setTitle("Small Login");
        setSize(300, 200);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // ID Label and Field
        JLabel idLabel = new JLabel("ID");
        idLabel.setFont(new Font("Arial", Font.BOLD, 20));
        idLabel.setBounds(30, 20, 50, 30);

        JTextField idField = new JTextField(20);
        idField.setBounds(90, 20, 150, 30);

        // Password Label and Field
        JLabel pwLabel = new JLabel("PW");
        pwLabel.setFont(new Font("Arial", Font.BOLD, 20));
        pwLabel.setBounds(30, 70, 50, 30);

        JTextField pwField = new JTextField(20);
        pwField.setBounds(90, 70, 150, 30);

        // Login and Cancel Buttons
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 120, 80, 30);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(150, 120, 80, 30);

        // Add components to frame
        add(idLabel);
        add(idField);
        add(pwLabel);
        add(pwField);
        add(loginButton);
        add(cancelButton);

        setVisible(true);
    }

    public static void main(String[] args) {
       SmallLogin sl = new SmallLogin();
    }
}