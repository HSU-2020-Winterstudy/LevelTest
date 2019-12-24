/* Q7.md
 * Author : unnokid
 * created date : 2019-12-24
 */

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
            System.out.println("student");
            System.out.println("ID: " + studentArray[i].getID());
            System.out.println("name: " + studentArray[i].getName());
            System.out.println("gender: "+ studentArray[i].getGender());
            System.out.print("work: ");studentArray[i].work();
            System.out.print("eat: ");studentArray[i].eat();
            System.out.print("workPartTime: ");studentArray[i].workPartTime();
            System.out.print("\n\n\n");
        }

        System.out.println("=========================\n");
        for(int i=0;i<3;i++)
        {
            System.out.println("PartTimer");
            System.out.println("ID: " + PartTimerArray[i].getID());
            System.out.println("name: " + PartTimerArray[i].getName());
            System.out.println("gender: "+ PartTimerArray[i].getGender());
            System.out.print("work: ");PartTimerArray[i].work();
            System.out.print("eat: ");PartTimerArray[i].eat();
            System.out.print("workPartTime: ");PartTimerArray[i].workPartTime();
        }
    }

}
