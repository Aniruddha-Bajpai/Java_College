package Practice_Question_SET1;

public class FirstClass extends Compartment
{
    String coach ,notice;
    FirstClass(String coach,String notice)
    {
        this.coach=coach;
        this.notice=notice;
    }
    @Override
    public void notice()
    {
        System.out.println("Notice to "+coach+"coach :\n"+notice);
    }
}
class Ladies extends Compartment
{
    String coach,notice;
    Ladies(String coach,String notice)
    {
        this.coach=coach;
        this.notice=notice;
    }
    @Override
    public void notice() {
        System.out.println("Notice to "+coach+" coach :\n"+notice);
    }
}
class General extends Compartment
{
    String coach,notice;
    General(String coach,String notice)
    {
        this.coach=coach;
        this.notice=notice;
    }
    @Override
    public void notice() {
        System.out.println("Notice to "+coach+" coach :\n"+notice);
    }
}
class Luggage extends Compartment
{
    String coach,notice;
    Luggage(String coach,String notice)
    {
        this.coach=coach;
        this.notice=notice;
    }
    @Override
    public void notice() {
        System.out.println("Notice to "+coach+" coach :\n"+notice);
    }
}