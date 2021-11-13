package String_output;

public class Test2 {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder(5);
        sb.append("ab");
        String str="";
        str= str.concat("ab");
//        System.out.println(sb);
//        System.out.println(str);
        if(sb.equals(str))
        {
            System.out.println("Equal 1");
        }
        else if(sb.toString().equals(str.toString()))
        {
            System.out.println("Equal 2");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
