package person;

/**
 *
 * Author: pllapallpal
 * Created date: 2019-12-20
 */
public abstract class Person {

    private int ID;
    private String name;
    // true: male, false: female
    private boolean gender;
    private static int nextID;

    /**
     *
     * constructor with the params below
     * @param ID
     * @param name
     * @param gender
     */
    public Person(int ID, String name, boolean gender) {
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
    public Person(String name, boolean gender) {
        this.ID = nextID++;
        this.name = name;
        this.gender = gender;
    }

    public abstract void work();

    public abstract void eat();

    /**
     *
     * @return auto-generated Person object
     */
    public static Person generatePerson() {

        Person person = new Person(" ", true) {
            @Override
            public void work() {
                System.out.println("person works!");
            }

            @Override
            public void eat() {
                System.out.println("person eats!");
            }
        };

        person.setName();
        person.setGender();

        return person;
    }

    /**
     * in order to use in auto-generated
     * @return name set by hashcode
     */
    private void setName() {
        this.name = this.getClass().getSuperclass().getSimpleName() + "-" + Integer.toHexString(this.hashCode()).toUpperCase();
    }

    /**
     * in order to use in auto-generated
     * @return gender set randomly
     */
    private void setGender() {
        int genderSetter = (int) (Math.random() * 2);
        this.gender = genderSetter != 0;
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
    public boolean getGender() {
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
