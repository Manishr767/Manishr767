package JFrame_container;

import javax.swing.*;
import java.awt.*;

public class FrameTest2 extends JFrame {
    public FrameTest2(){
        setSize(300,200);
        setTitle("Testing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



    }



    public static void main(String[] args) {
        FrameTest2 ft2 = new FrameTest2();
        //JFrame ft = new JFrame();

    }

}
