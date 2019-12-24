/* Q5.md
 * Author : unnokid
 * created date : 2019-12-24
 */
package person;
//사람이면서 Student과 구분되는 작업해주기
public class PartTimer extends Person implements PartTimeJob
{
    public PartTimer(int ID, String name, String gender)
    {
        super(ID,name,gender);
    }

    public String work()
    {
        return "PartTime";
    }

    public String eat()
    {
        return "bread";
    }

    public void workPartTime()
    {

    }


}
