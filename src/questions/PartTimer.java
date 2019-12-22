package questions;

import java.util.Random;

public class PartTimer extends Person implements PartTimeJob{
    public PartTimer(int ID, String name, String sex) {
        super(ID, name, sex);
    }

    public PartTimer(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void workPartTime() {
        System.out.println("PartTimer workPartTime");
    }

    @Override
    public void work() {
        System.out.println("PartTimer work");
    }

    @Override
    public void eat() {
        System.out.println("PartTimer eat");
    }

    /**
     *
     * @return PartTimer who has randomSex and name (className and hashCode)
     */
    public static PartTimer autoGenerator(){
        String className;
        String hashCode;
        String sex;
        Random random = new Random(System.currentTimeMillis());
        int randomSex = random.nextInt(3);

        if(randomSex == 1){
            sex = "men";
        }
        else {
            sex = "woman";
        }
        PartTimer partTimer = new PartTimer("",sex);
        Class<?> classInfo = PartTimer.class;
        className = classInfo.getName();
        hashCode = Integer.toHexString(partTimer.hashCode()).toUpperCase();

        partTimer.setName(className+"-"+hashCode);
        return partTimer;
    }

    @Override
    public String toString() {
        return String.format("PartTimer{name = %s, id = %d, sex = %s}", getName(),getID(),getSex());
    }
}
