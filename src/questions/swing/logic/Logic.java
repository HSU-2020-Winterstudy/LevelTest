package questions.swing.logic;

import questions.FileManager;
import questions.NewDynamic;
import questions.Person;

import javax.swing.*;
import java.util.function.Consumer;

public class Logic {
    private static Logic instance;
    private NewDynamic<Person> personList;
    private NewDynamic<Person> luckyPerson;
    private FileManager fileManager = new FileManager();
    private Consumer<String> topLabelSetText;
    private Consumer<String> midLabelSetText;
    private Consumer<String> botLabelSetText;
    private String[] luckyInfo = new String[2];

    private Logic() {
        initialize();
    }

    public static Logic getInstance() {
        if (instance == null) {
            instance = new Logic();
        }
        return instance;
    }

    private void initialize() {
        FileManager fileManager = new FileManager();
        personList = fileManager.fileReader();
        luckyPerson = new NewDynamic<>();
    }

    public void addTopLabelSetText(Consumer<String> setText) {
        this.topLabelSetText = setText;
    }
    public void addMidLabelSetText(Consumer<String> setText) {
        this.midLabelSetText = setText;
    }
    public void addBotLabelSetText(Consumer<String> setText) {
        this.botLabelSetText = setText;
    }

    public void getLucky() {
        int luckyIndex = (int) (Math.random() * personList.size());
        luckyPerson.put(personList.get(luckyIndex));
        luckyInfo[0] = personList.get(luckyIndex).getName();
        luckyInfo[1] = personList.get(luckyIndex).toString();
        midLabelSetText.accept(luckyInfo[0]);
        getAboveLucky();
        getUnderLucky();
        JOptionPane.showMessageDialog(null,luckyInfo[1],"You are Lucky!",JOptionPane.INFORMATION_MESSAGE);
    }

    public void getAboveLucky() {
        int randomIndex = (int) (Math.random() * personList.size());
        topLabelSetText.accept(personList.get(randomIndex).getName());
    }

    public void getUnderLucky() {
        int randomIndex = (int) (Math.random() * personList.size());
        botLabelSetText.accept(personList.get(randomIndex).getName());
    }
    public void saveLuckyList(){
        fileManager.fileWriter(luckyPerson);
    }
}
