package graphic;

import javax.swing.*;
import java.awt.*;

public class InputPanel {

    private JPanel inputPanel;
    private JTextField textField;
    private JButton addButton;

    public InputPanel() {

        inputPanel = new JPanel(new BorderLayout(5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        textField = new JTextField("JTextField");
        textField.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        inputPanel.add(textField, BorderLayout.CENTER);

        addButton = new JButton("저장");
        addButton.setFont(new Font("궁서체", Font.PLAIN, 30));
        inputPanel.add(addButton, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return inputPanel;
    }
}
