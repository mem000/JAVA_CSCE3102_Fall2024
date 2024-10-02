package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _12_ActionListenerExample {
    public static void main(String[] args) {
        MyFrame12 frame = new MyFrame12();
        frame.setVisible(true);
    }
}

class MyFrame12 extends JFrame implements ActionListener {
    private JButton button;

    public MyFrame12() {
        // Set up frame
        setTitle("ActionListener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create button
        button = new JButton("Click Me");
        button.addActionListener(this);  // Register ActionListener

        // Add button to frame
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This will be triggered when the button is clicked
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button clicked!");
        }
    }


}

