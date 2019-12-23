package questions.swing.graphics;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.function.Consumer;

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


        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        topNameLabel.setBorder(border);
        midNameLabel.setBorder(border);
        botNameLabel.setBorder(border);

        topNameLabel.setFont(new Font("궁서",Font.BOLD,30));
        midNameLabel.setFont(new Font("궁서",Font.BOLD,30));
        botNameLabel.setFont(new Font("궁서",Font.BOLD,30));
        inputTF.setFont(new Font("궁서", Font.BOLD,20));
        inputTF.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));

        topNameLabel.setOpaque(true);
        midNameLabel.setOpaque(true);
        botNameLabel.setOpaque(true);
        topNameLabel.setBackground(Color.white);
        midNameLabel.setBackground(Color.white);
        botNameLabel.setBackground(Color.white);
        topNameLabel.setHorizontalAlignment(JLabel.CENTER);
        midNameLabel.setHorizontalAlignment(JLabel.CENTER);
        botNameLabel.setHorizontalAlignment(JLabel.CENTER);

        labels.add(topNameLabel);
        labels.add(midNameLabel);
        labels.add(botNameLabel);

        contentPanel.add(labels, BorderLayout.CENTER);
        contentPanel.add(inputTF, BorderLayout.SOUTH);
    }
    public Consumer<String> topLabelSetText(){
        return string -> topNameLabel.setText(string);
    }
    public Consumer<String> midLabelSetText(){
        return string -> midNameLabel.setText(string);
    }
    public Consumer<String> botLabelSetText(){
        return string -> botNameLabel.setText(string);
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
