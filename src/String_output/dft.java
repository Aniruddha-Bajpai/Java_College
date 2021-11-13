package String_output;

public class dft {
    int[]la= new int[1];
    boolean b;
    int I;
    Object o;//default value of object is null
    public void print()
    {
        //0 false 0 null
        System.out.println(la[0]+""+b+""+I+""+o);
    }
    public static void main(String args[])
    {
        dft obj= new dft();
        obj.print();
    }
}
