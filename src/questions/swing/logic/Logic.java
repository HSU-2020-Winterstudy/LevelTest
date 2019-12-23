package questions.swing.logic;

import questions.FileManager;
import questions.NewDynamic;
import questions.Person;

public class Logic {
    private NewDynamic<Person> personList;
    private NewDynamic<Person> luckyPerson;
    public Logic(){
        initialize();
    }
    private void initialize(){
       FileManager fileManager = new FileManager();
       personList = fileManager.fileReader();
       luckyPerson = new NewDynamic<>();
    }

    public String[] getLucky(){
        int luckyIndex = (int)(Math.random()*personList.size());
        luckyPerson.put(personList.get(luckyIndex));
        String[] luckyInfo = new String[2];
        luckyInfo[0] = personList.get(luckyIndex).getName();
        luckyInfo[1] = personList.get(luckyIndex).toString();
        return luckyInfo;
    }
    public String getAboveLucky(){
        int randomIndex = (int)(Math.random()*personList.size());
        return personList.get(randomIndex).getName();
    }
    public String getUnderLucky(){
        int randomIndex = (int)(Math.random()*personList.size());
        return personList.get(randomIndex).getName();
    }
}
