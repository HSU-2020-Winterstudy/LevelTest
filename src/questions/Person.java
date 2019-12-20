package questions;


import java.util.Random;

public abstract class Person {
    private int ID;
    private String name;
    private String sex;

    /**
     * @param ID   = Person's identify number
     * @param name = Person's name
     * @param sex  = Person's sex (man or woman)
     */
    public Person(int ID, String name, String sex) {
        if (AutoIDGenerator.checkIDIsEqual(ID)) {
            this.ID = ID;
        } else {
            this.ID = -1;
        }
        this.name = name;
        this.sex = sex;
    }

    /**
     * ID = Initialize -1
     *
     * @param name = Person's name
     * @param sex  = Person's sex (man or woman)
     */
    public Person(String name, String sex) {
        this.ID = AutoIDGenerator.getNextID();
        this.name = name;
        this.sex = sex;
    }

    /**
     * @return Person's identify number
     */
    public int getID() {
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    /**
     * @return Person's name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Person's Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Person's sex (man or woman)
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    abstract public void work();

    abstract public void eat();

    public static Person autoGenerator() {

        String className;
        String hashCode;
        String sex;
        Random random = new Random(System.currentTimeMillis());
        int randomSex = random.nextInt(2);

        if (randomSex == 1) {
            sex = "men";
        } else {
            sex = "woman";
        }
        Person person = null;
        try {
            Class<?> classInfo = Person.class;
            className = classInfo.getName();
            person = (Person) classInfo.newInstance();
            hashCode = Integer.toHexString(person.hashCode()).toUpperCase();

            person.setName(className + "-" + hashCode);
            person.setSex(sex);

        } catch (IllegalAccessException | InstantiationException e1) {
            e1.printStackTrace();
        }
        return person;
    }


    @Override
    public String toString() {
        return "Name "+name+" ID "+ID+" Sex "+sex;
    }
}
