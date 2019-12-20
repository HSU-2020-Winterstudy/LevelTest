package question_1;

public class Person {
    private int ID;
    private String name;
    private String sex;

    public Person(int ID, String name, String sex){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
    }
    public Person(String name, String sex){
        this.name = name;
        this.sex = sex;
        this.ID = -1;
    }
}
