package Puzzler_Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Puzzler extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    /**
     * Keeps a reference to the object <b>board</b> in order to call the method
     * reset whenever the user clicks the reset button.
     */

    private Board board;

    /**
     * Creates the layout of the application.
     */

    public Puzzler() {
        super("Puzzler");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);

        board = new Board();
        add(board, BorderLayout.CENTER);

        JButton button = new JButton("Reset");
        button.setFocusPainted(false);
        button.addActionListener(this);

        JPanel control = new JPanel();
        control.setBackground(Color.WHITE);
        control.add(button);
        add(control, BorderLayout.SOUTH);

        pack();
        setResizable(false);
        setVisible(true);

        board.setAllowsClicks(true);
    }

    /**
     * This method must be implemented as part of the contract specified by
     * ActionListener. When the user clicks the reset button, it calls the
     * method <b>reset</b> of the object designated by <b>board</b>.
     *
     * @see ActionListener#actionPerformed(ActionEvent)
     */

    public void actionPerformed(ActionEvent e) {
        if (board.allowsClicks()) {
            board.setAllowsClicks(false);
            board.reset();
            board.setAllowsClicks(true);
        }
    }

    /**
     * Java programs start by executing the main method. Here, this main method
     * creates the main window of the application.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        new Puzzler();
    }

}
