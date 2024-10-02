package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _09_OpenNewWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    _09_OpenNewWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }

    public static void main(String[] args) {
        new _09_OpenNewWindow();
    }
}

class NewWindow {
    JFrame frame = new JFrame("Hello!");
    JLabel label = new JLabel("Hello!");

    NewWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        label.setBounds(50, 100, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setVisible(true);
        frame.add(label);

    }
}

