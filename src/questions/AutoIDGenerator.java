package questions;


public class AutoIDGenerator {
    private static int nextID = 10;

    /**
     *
     * @param ID Person's identify number
     * @return If Person's ID is equal nextID return true,
     *         else return false and Person's ID = -1
     */
    public static boolean checkIDIsEqual(int ID){
        if(ID != nextID){
            return false;
        }
        nextID++;
        return true;
    }

    /**
     *
     * @return NextID and Increase
     */
    public static int getNextID(){
        return nextID++;
    }

    /**
     *
     * @param person Person object
     * @return If Person's ID is between -1 and NextID return true (this object is safe)
     */
    public static boolean checkIsOk(Person person){
        if(-1 < person.getID() && person.getID() < nextID){
            return true;
        }
        return false;
    }
}
