/**
 * Author : Disarmy
 * Created date : 2019-12-22
 */

public class Person {
    private int id = -1;
    private String name;
    private String gender;
    private static int nextID;

    /*
     * First Constructor */
    public Person(int id, String name, String gender) {
        if (id != nextID)
            this.id = -1;
        else
            this.id = id;
        this.name = name;
        this.gender = gender;
    }

    /*
     * Second Constructor */
    public Person(String name, String gender) {
        this.id = nextID++;
        this.name = name;
        this.gender = gender;
    }

    /*
     * @return Person's id */
    public int getId() {
        return id;
    }

    /*
     * @return Person's name */
    public String getName() {
        return name;
    }

    /*
     * @return Person's gender */
    public String getGender() {
        return gender;
    }

    /*
     * @return Person's nextID */
    public static int getNextID(){
        return nextID;
    }
    
    /*
     * @return Person is correct*/
    public static boolean isCorrect() {
        if (this.id > -1 && this.id < nextID)
            return true;
        else
            return false;
    }
}