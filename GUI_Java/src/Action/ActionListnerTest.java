package Action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest extends JFrame {

    public ActionListenerTest(){
        setSize(600,700);
        setTitle("ActionLister Test");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn1 = new JButton("Click me");
        JButton btn1 = new JButton("Click me");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        this.add(btn1);
        setVisible(true);
    }

    public static void main(String[] args) {
        ActionListenerTest alt = new ActionListenerTest();
    }
}
