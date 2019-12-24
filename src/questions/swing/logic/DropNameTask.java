package questions.swing.logic;

import javax.swing.*;

public class DropNameTask implements Runnable {

    private JLabel topLabel;
    private JLabel midLabel;
    private JLabel botLabel;

    @Override
    public void run() {
        setBotLabel();
        setMidLabel();
        setTopLabel();
    }

    /**
     * SetText random Person's Name
     */
    public void setTopLabel() {
        topLabel.setText(Logic.getInstance().randomPerson());
    }

    /**
     * Get name in topLabel
     */
    public void setMidLabel() {
        midLabel.setText(topLabel.getText());
    }

    /**
     * Get name in midLabel
     */
    public void setBotLabel() {
        botLabel.setText(midLabel.getText());
    }

    public void addLabel(JLabel[] labels) {
        this.topLabel = labels[2];
        this.midLabel = labels[1];
        this.botLabel = labels[0];
    }
}
