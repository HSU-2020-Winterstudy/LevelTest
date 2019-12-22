package questions;

import java.util.Random;

public class PartTimer extends Person implements PartTimeJob{
    public PartTimer(int ID, String name, sexType sex) {
        super(ID, name, sex);
    }

    public PartTimer(String name, sexType sex) {
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
        PartTimer partTimer;
        if(randomSex == 1){
            partTimer = new PartTimer("", sexType.FEMALE);
        }
        else {
            partTimer = new PartTimer("",sexType.MALE);
        }
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
