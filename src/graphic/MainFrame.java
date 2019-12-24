package graphic;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame mainFrame;

    public MainFrame() {

        mainFrame = new JFrame("Q15");

        mainFrame.getContentPane().add(new MainPanel().getPanel(), BorderLayout.CENTER);

        mainFrame.setSize(800, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public JFrame getFrame() {
        return mainFrame;
    }
}
