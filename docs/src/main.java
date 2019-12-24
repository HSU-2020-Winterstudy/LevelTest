/* Q7.md
 * Author : unnokid
 * created date : 2019-12-24
 */

package person;

public class main
{
    public static void main(String[] args)
    {

        Student [] studentArray = new Student[3];
        PartTimer  [] PartTimerArray = new PartTimer[3];

        for(int i=0; i<3;i++)
        {
            studentArray[i] = Student.randomcreater();
            PartTimerArray[i] = PartTimer.randomcreater();
        }

        //각 모든 메소드 출력
        for(int i=0;i<3;i++)
        {
            system.out.println("student");
            system.out.println("ID: " + studentArray[i].getID());
            system.out.println("name: " + studentArray[i].getName());
            system.out.println("gender: "+ studentArray[i].getGender);
            system.out.println("next");
            system.out.println("student");

        }
    }



}
