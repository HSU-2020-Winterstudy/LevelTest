package graphic;

import javax.swing.*;
import java.awt.*;

public class MainPanel {

    private JPanel mainPanel;

    public MainPanel() {

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // ListPanel
        mainPanel.add(new GamePanel().getPanel(), BorderLayout.CENTER);

        // InputPanel
        mainPanel.add(new InputPanel().getPanel(), BorderLayout.SOUTH);

    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
