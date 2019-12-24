/**
 * Author : Disarmy
 * Created date : 2019-12-22
 */

public abstract class Person {
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
    public static int getNextID() {
        return nextID;
    }

    /*
     * @return Person is correct*/
    public static boolean isCorrect(Person person) {
        if (person.id > -1 && person.id < nextID)
            return true;
        else
            return false;
    }

    /*
     * @return random Person */
    public static Person randomGenerator() {
        Person person;
        String gender;
        if ((int) (Math.random() * 2) % 2 == 0) {
            gender = "남자";
        } else
            gender = "여자";

        person = new Person(" ", gender) {

            @Override
            public void work() {
                System.out.println("Person work");
            }

            @Override
            public void eat() {
                System.out.println("Person eat");
            }
        };
        person.setHashName();

        return person;
    }

    public void setHashName() {
        this.name = getClass().getSimpleName() + "-" + Integer.toHexString(this.hashCode()).toUpperCase();
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void work();

    public abstract void eat();

}