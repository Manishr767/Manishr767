package JFrame_container;

import javax.swing.*;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame();  // big container
        f.setTitle("Test Title");
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
