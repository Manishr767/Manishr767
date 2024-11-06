package JCheckBox_JradioButton;

import javax.swing.*;
import java.awt.*;

public class CheckBoxRadioButton  extends JFrame {
    public CheckBoxRadioButton(){
        setSize(250,200);
        setTitle("ButoonTYpe");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // jCheckBox test
        JCheckBox cb1 = new JCheckBox("option1");
        JCheckBox cb2 = new JCheckBox("option2");
        this.add(cb1);
        this.add(cb2);

        //JRadioBUtton
        JRadioButton rb1 = new JRadioButton("button1");
        JRadioButton rb2 = new JRadioButton("button2");
        ButtonGroup btnG = new ButtonGroup();
        btnG.add(rb1);
        btnG.add(rb2);
        this.add(rb1);
        this.add(rb2);


        setVisible(true);

    }

    public static void main(String[] args) {
        CheckBoxRadioButton crb = new CheckBoxRadioButton();
    }
}
