package Practice_Question_SET1;
import java.util.Scanner;
public class Display {
    public String Instancename ;
    Display(String name)
    {
        Instancename=name;
    }
    public String toString()
    {
        return "Instance name : "+Instancename;
    }
}
class Displaytest
{
    public static void main(String args[])
    {
        System.out.println("How many instances ,do you want to create ?");
        Scanner sc=new Scanner(System.in);
        int l = sc.nextInt();
        Display obj[] =new Display[l];
        for(int i=0;i<l;i++)
        {
            System.out.println("< Adding name to the instance > ");
            obj[i] =new Display(sc.next());
        }
        for (Display s : obj)
        {
            System.out.println(s);
        }
    }
}