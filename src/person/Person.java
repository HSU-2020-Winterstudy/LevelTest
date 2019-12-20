package person;

public class Person {

    private int ID;
    private String name;
    private String gender;

    public Person(int ID, String name, String gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public Person(String name, String gender) {
        this.ID = -1;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }
}
