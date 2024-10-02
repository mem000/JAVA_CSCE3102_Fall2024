package GUI;

import javax.swing.JFrame;
import java.awt.*;

public class _01_SimpleFrame {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("My Frame"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(500, 500); // sets the x-dimension, and y-dimension of frame
        frame.setLocationRelativeTo(null); // centers the frame on the screen
        frame.setVisible(true); // Display the frame // make frame visible

//        ImageIcon icon = new ImageIcon("image/angry.png"); // create an ImageIcon
//        frame.setIconImage(icon.getImage()); // change icon of frame
//        frame.getContentPane().setBackground(Color.blue); // change the background color
//        frame.getContentPane().setBackground(new Color(200, 255, 100)); // using custom color
    }
}
