package questions.swing.graphics;

import questions.swing.logic.Logic;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel {
    private JPanel contentPanel = new JPanel();
    private JButton rouletteButton = new JButton("추첨");
    private JButton saveButton = new JButton("저장");

    public ButtonPanel(){
        contentPanel.setLayout(new BorderLayout(0,10));

        rouletteButton.setFont(new Font("궁서",Font.BOLD,20));
        saveButton.setFont(new Font("궁서",Font.BOLD,20));

        rouletteButton.addActionListener(event -> Logic.getInstance().getLucky());
        saveButton.addActionListener(event -> Logic.getInstance().saveLuckyList());

        contentPanel.add(rouletteButton,BorderLayout.CENTER);
        contentPanel.add(saveButton,BorderLayout.SOUTH);
    }


    public JPanel getContentPanel(){
        return contentPanel;
    }
}
