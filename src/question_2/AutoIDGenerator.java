package question_2;

import question_1.Person;

public class AutoIDGenerator {
    private static int nextID = 10;
    public static boolean checkIDIsEqual(int ID){
        if(ID != nextID){
            return false;
        }
        nextID++;
        return true;
    }
    public static int getNextID(){
        return nextID++;
    }
    public static boolean checkIsOk(Person person){
        if(-1 < person.getID() && person.getID() < nextID){
            return true;
        }
        return false;
    }
}
