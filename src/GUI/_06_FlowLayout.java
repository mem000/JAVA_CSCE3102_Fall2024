package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class _06_FlowLayout {
    public static void main(String[] args) {
        // Layout Manager - Defines the natural layout for components within a container

        // FlowLayout = places components in a row, sized at their preferred size.
        // If the horizontal space in the container is too small,
        // the FlowLayout class uses the next available row.

        JFrame frame = new JFrame("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);


//        JPanel panel1 = new JPanel();
//        panel1.setPreferredSize(new Dimension(100, 200));
//        //panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));  // FlowLayout.TRAILING // FlowLayout.LEADING
//        panel1.setLayout(new FlowLayout(FlowLayout.TRAILING)); //default = FlowLayout.CENTER
//        panel1.setBackground(Color.lightGray);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("Hello"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("FlowLayout Manager"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        //frame.add(panel1);

        frame.setVisible(true);
    }
}
