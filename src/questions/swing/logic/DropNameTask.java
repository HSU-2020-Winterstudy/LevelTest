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

    public void setTopLabel() {
        topLabel.setText(Logic.getInstance().randomPerson());
    }

    public void setMidLabel() {
        midLabel.setText(topLabel.getText());
    }

    public void setBotLabel() {
        botLabel.setText(midLabel.getText());
    }

    public void addLabel(JLabel[] labels) {
        this.topLabel = labels[2];
        this.midLabel = labels[1];
        this.botLabel = labels[0];
    }
}
