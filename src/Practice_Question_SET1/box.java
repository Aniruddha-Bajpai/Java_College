package Practice_Question_SET1;
import java.util.Scanner;
class box3
{
    double length,breadth,height;
    box3(double length,double breadth,double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    void area()
    {
        System.out.println(2*(length*breadth+breadth*height+height*length));
    }
    void volume()
    {
        System.out.println(length*breadth*height);
    }
}
public class box extends box3
{
    box(double l,double b,double h)
    {
        super(l,b,h);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        box ob=new box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        ob.area();
        ob.volume();
    }

}
