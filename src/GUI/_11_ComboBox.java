package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _11_ComboBox {
    public static void main(String[] args) {
        new MyFrame_11();
    }
}


class MyFrame_11 extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame_11() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());


        String[] levels = {"Easy", "Medium", "Hard"};
        comboBox = new JComboBox<>(levels); //you must pass array of reference objects to the JComboBox
        comboBox.addActionListener(this);

        this.add(new JLabel("Difficulty: "));
        this.add(comboBox);

        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem() + " is selected");
            //System.out.println(comboBox.getSelectedIndex());
        }
    }
}

//More helpful methods
// comboBox.setEditable(true); // Makes the combo box editable
// comboBox.getItemCount(); // Gets the number of items in the combo box
// comboBox.addItem(Item); // Adds an item to the combo box
// comboBox.insertItemAt(Item, index); // Inserts an item at the specified index
// comboBox.setSelectedIndex(index); // Sets the selected item by index
// comboBox.removeItem(Item); // Removes the specified item from the combo box
// comboBox.removeItemAt(index); // Removes the item at the specified index
// comboBox.removeAllItems(); // Removes all items from the combo box



