package Practice_Question_SET1;
import java.util.Scanner;
public class Student1 {
    public String name ;
    public int age;
    public String address;
    Student1()
    {
        name ="Unknown";
        age = 0;
        address = "not available";
    }
    public void setInfo(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name ,int age,String address)
    {
        this.name =name;
        this.age=age;
        this.address=address;
    }
    public String toString()
    {
        return "NAME: "+name+"\nAGE: "+age+"\nADDRESS: "+address;
    }
}
class TestStudent1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student1 obj[]=new Student1[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("<Adding values to object>");
            obj[i]=new Student1();
            obj[i].setInfo(sc.next(),sc.nextInt(), sc.next());
        }
        for(Student1 s:obj)
        {
            System.out.println(s);
        }
    }
}
