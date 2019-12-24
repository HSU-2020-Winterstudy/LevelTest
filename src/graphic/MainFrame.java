package graphic;

import javax.swing.*;

public class MainFrame {

    private JFrame mainFrame;

    public MainFrame() {

        mainFrame = new JFrame("Q15");

        mainFrame.setSize(800, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public JFrame getFrame() {
        return mainFrame;
    }
}
