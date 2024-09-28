package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _01_MyFrame extends JFrame implements ActionListener {
    JButton btn, btn2;
    JLabel label2;
    int counter = 0;

    public _01_MyFrame() {
        // JFrame = a GUI window to add components to

        this.setTitle("My Frame"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //this.setResizable(false); // prevent frame from being resized
        this.setSize(500, 500); // sets the x-dimension, and y-dimension of frame
        this.setLocationRelativeTo(null); // centers the frame on the screen
        //this.setBounds(100, 300, 500, 500);
        this.setVisible(true); // Display the frame // make frame visible

        ImageIcon icon = new ImageIcon("image/eye.png"); // create an ImageIcon
        this.setIconImage(icon.getImage()); // change icon of frame
        this.getContentPane().setBackground(Color.blue); // change the background color
//        this.getContentPane().setBackground(new Color(200, 255, 100)); // using custom color

        //Creating and adding a button
        this.setLayout(null);
        // Button = a button that performs an action when clicked on.
        btn = new JButton();
        btn.setText("Click Me");
        btn.setBounds(20, 20, 200, 50);
        btn.addActionListener(this);
        btn.setFocusable(false);
        ImageIcon icon2 = new ImageIcon("image/angry.png");
        btn.setIcon(icon2);
        btn.setHorizontalTextPosition(JButton.LEFT);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setFont(new Font("Comic Sans", Font.BOLD, 20));
        //btn.setForeground(Color.black);
        btn.setBackground(Color.green);
        //btn.setEnabled(false);
        this.add(btn);

        //creating another button and label
        btn2 = new JButton();
        btn2.setText("Show Icon");
        btn2.setBounds(250, 20, 150, 50);
        btn2.setFont(new Font("Comic Sans", Font.BOLD, 20));

        btn2.addActionListener(this);

        label2 = new JLabel();
        label2.setIcon(new ImageIcon("image/smile.png"));
        label2.setBounds(20, 100, 256, 256);
        label2.setVisible(false);

        this.add(btn2);
        this.add(label2);


        //call revalidate() and repaint() on the frame to ensure that the layout is updated.
        this.revalidate();
        this.repaint();

    }

    public static void main(String[] args) {
        new _01_MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            System.out.println("The button is clicked! " + ++counter);
            //JOptionPane.showMessageDialog(null, "The button is clicked!");
        }
        if (e.getSource() == btn2) {
            if (btn2.getText().equals("Show Icon")) {
                label2.setVisible(true);
                btn2.setText("Hide Icon");
            } else {
                label2.setVisible(false);
                btn2.setText("Show Icon");
            }

        }
    }
}
