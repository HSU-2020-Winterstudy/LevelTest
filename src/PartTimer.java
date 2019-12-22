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
