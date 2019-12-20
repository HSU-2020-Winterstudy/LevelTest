package question_2;

public class AutoIDGenerater {
    private static int nextID = 10;
    public static boolean checkIDIsEqual(int ID){
        if(ID != nextID){
            return false;
        }
        nextID++;
        return true;
    }
}
