package person;

/**
 *
 * Author: pllapallpal
 * Created date: 2019-12-20
 */
public abstract class Person {

    public enum Gender {
        MALE,
        FEMALE;
    }

    private int ID;
    private String name;
    // true: male, false: female
    private static int nextID;
    private Gender gender;

    /**
     *
     * constructor with the params below
     * @param ID
     * @param name
     * @param gender
     */
    public Person(int ID, String name, Gender gender) {
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
    public Person(String name, Gender gender) {
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

        Person person = new Person(" ", Gender.MALE) {
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
    protected void setName() {
        this.name = getClass().getSimpleName() + "-" + Integer.toHexString(this.hashCode()).toUpperCase();
    }

    /**
     * in order to use in auto-generated
     * @return gender set randomly
     */
    protected void setGender() {
        int genderSetter = (int) (Math.random() * 2);
        switch (genderSetter) {
            case 0:
                this.gender = Gender.MALE;
                break;
            case 1:
                this.gender = Gender.FEMALE;
                break;
        }
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

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return gender of the object
     */
    public Gender getGender() {
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
