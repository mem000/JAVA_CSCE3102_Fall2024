package GUI;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class _00_Main {
    public static void main(String[] args) {
        //simpleFrame();
        //new MyFrame();
        //simpleFrameWithLabel();
        simpleFrameWithPanels();
    }

    public static void simpleFrame() {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("My Frame"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(500, 500); // sets the x-dimension, and y-dimension of frame
        frame.setLocationRelativeTo(null); // centers the frame on the screen
        frame.setVisible(true); // Display the frame // make frame visible

        ImageIcon icon = new ImageIcon("image/eye.png"); // create an ImageIcon
        frame.setIconImage(icon.getImage()); // change icon of frame
        frame.getContentPane().setBackground(Color.blue); // change the background color
//        frame.getContentPane().setBackground(new Color(200, 255, 100)); // using custom color

    }

    public static void simpleFrameWithLabel() {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("My Frame"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(500, 500); // sets the x-dimension, and y-dimension of frame
        frame.setLocationRelativeTo(null); // centers the frame on the screen
        ImageIcon icon1 = new ImageIcon("image/eye.png"); // create an ImageIcon
        frame.setIconImage(icon1.getImage()); // change icon of frame

        //creating JLabel and setting its attributes
        //JLabel - A GUI display area for a string of text, an image, or both.
        JLabel label = new JLabel();
        label.setText("Welcome to Java GUI"); //set Text of label
        ImageIcon icon2 = new ImageIcon("image/flower1.png");
        label.setIcon(icon2);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //sset text TOP, CENTER, BOTTOM of iamgeicon
        label.setForeground(Color.GREEN); //set font color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 20)); //set font of text
        label.setIconTextGap(-5); //set gap of text to image
        label.setBackground(Color.BLACK); //set background color
        label.setOpaque(true); //display background color

        frame.setLayout(null); // Sets the layout manager for the frame to null, allowing for absolute positioning
        label.setBounds(100, 0, 250, 250); //set x,y position within frame as well as dimensions

        Border borderLine = BorderFactory.createLineBorder(Color.BLUE, 3);
        label.setBorder(borderLine); //sets border of label
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        frame.add(label);

        frame.setVisible(true); // Display the frame // make frame visible
        // Packs the frame to fit the preferred sizes and layouts of its components
//        frame.pack();  //called after adding all components
    }

    public static void simpleFrameWithPanels() {


        JFrame frame = new JFrame();
        frame.setTitle("Frame with Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        // JPanel = a GUI component that functions as a container to hold other components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(400, 150, 100, 100);

        ImageIcon icon = new ImageIcon("image/egy1.png");
        JLabel label = new JLabel();
        label.setText("Egypt");
        label.setIcon(icon);

        redPanel.add(label);
        bluePanel.add(label);
        greenPanel.add(blackPanel);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true); // make frame visible
        //call revalidate() and repaint() on the frame to ensure that the layout is updated.
        frame.revalidate();
        frame.repaint();
    }
}
