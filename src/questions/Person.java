package questions;


public class Person {
    private int ID;
    private String name;
    private String sex;

    /**
     * @param ID = Person's identify number
     * @param name = Person's name
     * @param sex = Person's sex (man or woman)
     */
    public Person(int ID, String name, String sex){
        if(AutoIDGenerator.checkIDIsEqual(ID)){
            this.ID = ID;
        }
        else{
            this.ID = -1;
        }
        this.name = name;
        this.sex = sex;
    }

    /**
     * ID = Initialize -1
     * @param name = Person's name
     * @param sex = Person's sex (man or woman)
     */
    public Person(String name, String sex){
        this.ID = AutoIDGenerator.getNextID();
        this.name = name;
        this.sex = sex;
        this.ID = -1;
    }

    /**
     *
     * @return Person's identify number
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @return Person's name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Person's sex (man or woman)
     */
    public String getSex() {
        return sex;
    }
}
