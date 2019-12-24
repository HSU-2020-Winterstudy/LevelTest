/**
 * Author : Disarmy
 * Created date : 2019-12-22
 */

public class PartTimer extends Person implements PartTimeJob {

    /*
     * First Constructor */
    public PartTimer(int id, String name, String gender) {
        super(id, name, gender);
    }

    /*
     * Second Constructor */
    public PartTimer(String name, String gender){
        super(name, gender);
    }

    public static PartTimer randomGenerator(){
        PartTimer partTimer;
        String gender;
        if((int)(Math.random()*2) % 2 == 0){
            gender = "남자";
        }
        else
            gender = "여자";

        partTimer = new PartTimer(" ", gender){

            @Override
            public void work() {

            }

            @Override
            public void eat() {

            }
        };
        partTimer.setHashName();

        return partTimer;
    }

    @Override
    public void workPartTime() {

    }

    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }
}
