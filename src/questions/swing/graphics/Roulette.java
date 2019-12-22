package questions.swing.graphics;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Roulette {
    private JFrame mainFrame;
    private JPanel contentPanel;
    private LabelTextFieldPanel labelTextFieldPanel;


    GridBagConstraints gbc = new GridBagConstraints();

    public Roulette(){
        initialize();
        contentPanel.setLayout(new BorderLayout(10,0));
        contentPanel.setBorder(new EmptyBorder(10,10,10,10));

        contentPanel.add(labelTextFieldPanel.getContentPanel(),BorderLayout.CENTER);

        mainFrame.add(contentPanel);
        mainFrame.setSize(640,360);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    private void initialize(){
        mainFrame = new JFrame();
        contentPanel = new JPanel();
        labelTextFieldPanel = new LabelTextFieldPanel();
    }
}
