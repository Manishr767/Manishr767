package LayoutTest;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest(){
        setTitle("Flowlayout Test");
        setSize(300,200);
        setLayout(new FlowLayout(FlowLayout.CENTER ,10,10));
        Button Button1 = new Button("button1");
        Button Button2 = new Button("button2");
        Button Button3 = new Button("button3");
        Button Button4 = new Button("button4");
        Button Button5 = new Button("button5");
        add(Button1);
        add(Button2);
        add(Button3);
        add(Button4);
        add(Button5);
        setVisible(true);

    }

    public static void main(String[] args) {
        FlowLayoutTest fl = new FlowLayoutTest();
    }
}
