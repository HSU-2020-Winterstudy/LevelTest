package questions.swing.logic;

import questions.FileManager;
import questions.NewDynamic;
import questions.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Logic {
    private static Logic instance;
    private NewDynamic<Person> personList;
    private FileManager fileManager = new FileManager();
    private DropNameTask dropNameTask;
    private ScheduledExecutorService service;
    private ScheduledFuture<?> dropFuture;
    private boolean isRouletteRunning = false;
    private JLabel luckyLabel;
    private ArrayList<Person> generatedPerson = new ArrayList<>();
    private NewDynamic<Person> luckyPeople;

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
        dropNameTask = new DropNameTask();
        FileManager fileManager = new FileManager();
        personList = fileManager.fileReader();
        luckyPeople = new NewDynamic<>();
    }
    public void addLabels(JLabel[] labels){
        luckyLabel = labels[2];
        dropNameTask.addLabel(labels);
    }

    public String randomPerson() {
        int randomIndex = (int) (Math.random() * personList.size());
        generatedPerson.add(personList.get(randomIndex));
        return personList.get(randomIndex).getName();
    }
    public void roulette(){
        if(!isRouletteRunning){
            service = Executors.newScheduledThreadPool(1);
            dropFuture = service.scheduleWithFixedDelay(dropNameTask,0,100, TimeUnit.MILLISECONDS);
            isRouletteRunning = true;
        }
    }
    public void stopRoulette(){
        if(isRouletteRunning){
            dropFuture.cancel(true);
            service.shutdown();
            isRouletteRunning = false;
            int personIndex = getPersonIndex(luckyLabel.getText());
            luckyPeople.put(generatedPerson.get(personIndex));
            JOptionPane.showMessageDialog(null, generatedPerson.get(personIndex).toString(), "You are Lucky!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private int getPersonIndex(String name){
        for(int i=0;i<generatedPerson.size();i++){
            if(generatedPerson.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void saveLuckyList() {
        fileManager.fileWriter("luckyMan.txt", luckyPeople);
    }

    public JTextArea display() {
        JTextArea displayTA = new JTextArea();
        if (luckyPeople != null) {
            for (int i = 0; i < luckyPeople.size(); i++) {
                displayTA.append(luckyPeople.get(i).toString() + "\n");
            }
        }
        return displayTA;
    }
}
