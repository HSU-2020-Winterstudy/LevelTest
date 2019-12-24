package questions.swing.graphics;

import questions.swing.logic.Logic;

import javax.swing.*;
import java.awt.*;

public class ListWindow {
    private JFrame mainFrame= new JFrame();
    private JPanel contentPanel = new JPanel();
    private JTextArea displayTA;
    private JButton exitButton = new JButton("Exit");

    /**
     * Display winner
     */
    public ListWindow(){
        contentPanel.setLayout(new BorderLayout());
        displayTA = Logic.getInstance().display();
        contentPanel.add(displayTA,BorderLayout.CENTER);
        contentPanel.add(exitButton,BorderLayout.SOUTH);

        exitButton.addActionListener(event -> mainFrame.setVisible(false));

        mainFrame.add(contentPanel);
        mainFrame.pack();
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

}
