package person;

/**
 *
 * Author: pllapallpal
 * Created date: 2019-12-20
 */
public class Person {

    private int ID;
    private String name;
    private String gender;
    private static int nextID;

    /**
     *
     * constructor with the params below
     * @param ID
     * @param name
     * @param gender
     */
    public Person(int ID, String name, String gender) {
        if (nextID == ID) {
            this.ID = nextID++;
        }
        else {
            ID = -1;
        }
        this.name = name;
        this.gender = gender;
    }

    /**
     *
     * constructor with the params below
     * @param name
     * @param gender
     * the ID is initialized with the static variable nextID
     */
    public Person(String name, String gender) {
        this.ID = nextID++;
        this.name = name;
        this.gender = gender;
    }

    /**
     *
     * @param person
     * @return whether the object person is correct
     */
    public static boolean isCorrect(Person person) {
        return (person.ID > -1 && person.ID < nextID);
    }

    /**
     *
     * @return static value nextID
     */
    public static int getNextID() {
        return nextID;
    }

    /**
     *
     * @return name of the object
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return gender of the object
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return ID of the object
     */
    public int getID() {
        return ID;
    }
}
