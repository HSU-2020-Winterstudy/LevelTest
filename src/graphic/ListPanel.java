package graphic;

import javax.swing.*;
import java.awt.*;

public class ListPanel {

    private int numList;

    private JPanel listPanel;
    private JLabel[] labels;

    public ListPanel() {

        numList = 3;

        listPanel = new JPanel(new GridLayout(numList, 1));
        listPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        labels = new JLabel[numList];
        for (int i = 0; i < numList; ++i) {
            labels[i] = new JLabel(Integer.toString(i));
            labels[i].setFont(new Font(Font.SERIF, Font.PLAIN, 30));
            labels[i].setHorizontalAlignment(SwingConstants.CENTER);
            labels[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            listPanel.add(labels[i]);
        }
    }

    public JPanel getPanel() {
        return listPanel;
    }
}
