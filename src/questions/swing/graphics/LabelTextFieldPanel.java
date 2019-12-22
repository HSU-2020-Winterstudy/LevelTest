package questions.swing.graphics;

import javax.swing.*;
import java.awt.*;

public class LabelTextFieldPanel {
    private JPanel contentPanel;
    private JLabel topNameLabel;
    private JLabel midNameLabel;
    private JLabel botNameLabel;
    private JPanel labels;
    private JTextField inputTF;

    public LabelTextFieldPanel() {
        initialize();
        contentPanel.setLayout(new BorderLayout(0, 10));
        labels.setLayout(new GridLayout(3, 1));




        labels.add(topNameLabel);
        labels.add(midNameLabel);
        labels.add(botNameLabel);

        contentPanel.add(labels, BorderLayout.CENTER);
        contentPanel.add(inputTF, BorderLayout.SOUTH);
    }

    private void initialize() {
        contentPanel = new JPanel();
        topNameLabel = new JLabel("JohnDoe");
        midNameLabel = new JLabel("JaneDoe");
        botNameLabel = new JLabel("JLabel");
        labels = new JPanel();
        inputTF = new JTextField("JTextField");
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
