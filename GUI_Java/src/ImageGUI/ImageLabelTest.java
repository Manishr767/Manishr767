package ImageGUI;

import javax.swing.*;
import java.awt.*;

public class ImageLabelTest extends JFrame {
    public ImageLabelTest(){
        this.setSize(300,400);
        setTitle("Image Test");
        setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/dogImage.jpg"));
        int newWidth = 400; // Set the desired width
        int newHeight = 300; // Set the desired height
       Image originalImage = icon.getImage();
       Image resizeImage = originalImage.getScaledInstance(200,140,Image.SCALE_SMOOTH);
       ImageIcon resizedIcon = new ImageIcon(resizeImage);
        JLabel label = new JLabel(resizedIcon);
        add(label);
        Image resizeImage1 = originalImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon1 = new ImageIcon(resizeImage);
        JLabel label1 = new JLabel(resizedIcon1);
        add(label1);

        setVisible(true);

    }

    public static void main(String[] args) {
       ImageLabelTest img = new ImageLabelTest();

    }

}
