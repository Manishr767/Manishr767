package LayoutTest;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {

    public BorderLayoutTest(){
        setTitle("Flowlayout Test");
        setSize(300,200);
        setLayout(new BorderLayout());
        Button Button1 = new Button("button1");
        Button Button2 = new Button("button2");
        Button Button3 = new Button("button3");
        Button Button4 = new Button("button4");
        Button Button5 = new Button("button5");
        add(Button1,"North");
        add(Button2,"South");
        add(Button3,"West");
        add(Button4,"East");
        add(Button5,"Center");
        setVisible(true);

    }

    public static void main(String[] args) {

        BorderLayoutTest fl = new BorderLayoutTest();
    }
}
