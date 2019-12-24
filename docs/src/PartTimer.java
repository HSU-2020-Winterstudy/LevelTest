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

    //랜덤 생성 메서드
    public static PartTimer randomcreater()
    {
        String gender;
        //0~1나오는 함수
        if((int)(math.random()*2)%2 == 0)
        {
            gender ="남자";
        }
        else
        {
            gender ="여자";
        }
        PartTimer partTimer = new PartTimer("", gender)
        {
            @java.lang.Override
            public String eat()
            {
                return "bread";
            }

            @java.lang.Override
            public String work()
            {
                return "part-time job";
            }
        };

        partTimer.setname();
        return partTimer;

    }
    public void setname()
    {
        this.name = getClass().getSimpleName() + "-" + Integer.toHexString(this.hashCode()).toUpperCase();
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
