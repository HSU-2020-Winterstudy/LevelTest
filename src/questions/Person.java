package questions;


import java.io.Serializable;
import java.util.Random;

public abstract class Person implements Serializable {
    enum sexType{
        MALE,FEMALE;
    }
    private static int nextID = 1;
    private int ID;
    private String name;
    private sexType sex;

    /**
     * @param ID Person's identify number
     * @return If Person's ID is equal nextID return true,
     * else return false and Person's ID = -1
     */
    public static boolean checkIDIsEqual(int ID) {
        if (ID != nextID) {
            return false;
        }
        nextID++;
        return true;
    }

    /**
     * @return NextID and Increase
     */
    public static int getNextID() {
        return nextID;
    }

    /**
     * @param person Person object
     * @return If Person's ID is between -1 and NextID return true (this object is safe)
     */
    public static boolean checkIsOk(Person person) {
        if (-1 < person.getID() && person.getID() < nextID) {
            return true;
        }
        return false;
    }

    /**
     * @param ID   = Person's identify number
     * @param name = Person's name
     * @param sex  = Person's sex (man or woman)
     */
    public Person(int ID, String name, sexType sex) {
        if (checkIDIsEqual(ID)) {
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
    public Person(String name, sexType sex) {
        this.ID = getNextID();
        nextID++;
        this.name = name;
        this.sex = sex;
    }

    /**
     * @return Person's identify number
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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
    public sexType getSex() {
        return sex;
    }

    public void setSex(sexType sex) {
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

        Person person = null;
        try {
            Class<?> classInfo = Person.class;
            className = classInfo.getName();
            person = (Person) classInfo.newInstance();
            hashCode = Integer.toHexString(person.hashCode()).toUpperCase();

            person.setName(className + "-" + hashCode);
            if(randomSex == 1){
                person.setSex(sexType.MALE);
            }
            else{
                person.setSex(sexType.FEMALE);
            }


        } catch (IllegalAccessException | InstantiationException e1) {
            e1.printStackTrace();
        }
        return person;
    }


    @Override
    public String toString() {
        return "Name " + name + " ID " + ID + " Sex " + sex;
    }
}
