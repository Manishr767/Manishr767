package JFrame_container;

import javax.swing.*;
import java.awt.*;

public class JFrameTest extends JFrame {
    public JFrameTest(){
        setSize(300,200);
        setLocation(500,100);
        setTitle("Jframe Property Test");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);// (3) changes background color
        JButton button1 = new JButton("Ok");
       // getContentPane().setBackground(Color.blue);
        JButton button2 = new JButton("cancel");
        add(button1);
        add(button2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        JFrameTest jf = new JFrameTest();
    }

}
