package GUI;

import javax.swing.*;
import java.awt.*;

public class _03_SimpleFrameWithPanels {
    public static void main(String[] args) {
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
