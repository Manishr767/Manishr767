package JFrame_container;

import javax.swing.*;
import java.awt.*;

public class ButtionTest extends JFrame {
    public ButtionTest(){
        setSize(400,300);
        setTitle("Button Test ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JButton btn = new JButton("click");
        JButton btn2 = new JButton("click");

        add(btn);
        add(btn2);
        setVisible(true);
    }
    public static void main(String[] args) {
        ButtionTest bt = new ButtionTest();

    }
}
