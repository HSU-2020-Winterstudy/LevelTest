/**
 * Author : Disarmy
 * Created date : 2019-12-20
 */

public class Person{
    private int id = -1;
    private String name;
    private String gender;

    //1번 생성자
   public Person(int id, String name, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    //2번 생성자
    public Person(String name, String gender){
       this.name = name;
       this.gender = gender;
    }

    public int getId(){
       return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

}