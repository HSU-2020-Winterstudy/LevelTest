package graphic;

import javax.swing.*;
import java.awt.*;

public class GamePanel {

    private JPanel gamePanel;
    private ListPanel listPanel;
    private JButton runButton;

    public GamePanel() {

        gamePanel = new JPanel(new BorderLayout());
        gamePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 5));

        listPanel = new ListPanel();
        gamePanel.add(listPanel.getPanel(), BorderLayout.CENTER);

        runButton = new JButton("추첨");
        runButton.setFont(new Font("궁서체", Font.PLAIN, 30));
        gamePanel.add(runButton, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return gamePanel;
    }
}
