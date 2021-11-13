package Practice_Question_SET1;

import java.util.Scanner;
public class Stu {
    public int rollnumber,marks;
    public String name,University_name;
    Stu(int rollnumber ,int marks,String name,String University_name)
    {
        this.rollnumber = rollnumber;
        this.marks = marks;
        this.name =name;
        this.University_name = University_name;
    }
    public static void result(Stu obj_arr[])
    {int index =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<obj_arr.length;i++)
        {
            if(obj_arr[i].marks> max)
            {
                max = obj_arr[i].marks;
                index = i;
            }
        }
        System.out.printf("%d %s",obj_arr[index].marks,obj_arr[index].name);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number of object to be created ");
        int l = sc.nextInt();
        Stu[] object = new Stu[l];
        for(int i = 0;i<object.length;i++)
        {
            System.out.println("Add attribute to the objects ");
            object[i] = new Stu(sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
        }
        result(object);
    }
}
