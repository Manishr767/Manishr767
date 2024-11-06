package JFrame_container;

import javax.swing.*;
import java.awt.*;

public class PanelTest extends JFrame {
    public PanelTest(){
        this.setSize(400,300);
        setLocation(500,100);
        setTitle("JPanel Test");
       // setLayout(new FlowLayout());
        setLayout(new GridLayout(2,1));
        getContentPane().setBackground(Color.yellow);// (3) changes background color
        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("cancel");

        JPanel panel1 = new JPanel();
        setSize(200,300);
        JPanel panel2 = new JPanel();
        setSize(200,300);
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.blue);

        // getContentPane().setBackground(Color.blue);


        panel1.add(button1);
        panel2.add(button2);
        add(panel1);
        add(panel2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PanelTest pt = new PanelTest();
    }
}
