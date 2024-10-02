package GUI;

import javax.swing.*;

public class _10_JOptionPane {
    public static void main(String[] args) {
        // JOptionPane: pop up a standard dialog box that prompts users for a value
        // or informs them of something.
//        JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//
//
//        JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Here is more useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "really?", "Title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!!!", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is an error message", "ERROR 404!", JOptionPane.ERROR_MESSAGE);

        //---------------------------------------------------------------------
        int answer = JOptionPane.showConfirmDialog(
                null,
                "Do you love Pizza?",
                "This is my title",
                JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("answer = " + answer);
        //---------------------------------------------------------------------
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name);
        //---------------------------------------------------------------------
//        String[] responses = {"No, you're awesome!", "thank you :)", "blush"};
//        ImageIcon icon = new ImageIcon("image/cat1.png");
//        JOptionPane.showOptionDialog(
//                null,
//                "You are awesome!",
//                "Secret Message",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,
//                icon,
//                responses,
//                0);

        //---------------------------------------------------------------------
    }
}
