package LayoutTest;

import javax.swing.*;
import java.awt.*;

public class AbsoulateLayoutTest extends JFrame {

    public AbsoulateLayoutTest(){
        setTitle("AbsoluteLayout Test");
        this.setSize(300,200);
        setLayout(null);
        Button Button1 = new Button("button1");
        Button Button2 = new Button("button2");
        Button Button3 = new Button("button3");

        add(Button1);
        Button1.setBackground(Color.yellow);
        add(Button2);
        Button2.setBackground(Color.yellow);
        add(Button3);
        Button3.setBackground(Color.yellow);

        Button1.setLocation(50,100);
        Button1.setSize(90,50);
        Button2.setLocation(80,60);
        Button2.setSize(90,50);
        Button3.setLocation(70,110);
        Button3.setSize(90,50);
        //add(Button2);
        //add(Button3);

        setVisible(true);

    }

    public static void main(String[] args) {

        AbsoulateLayoutTest fl = new AbsoulateLayoutTest();
    }
}
