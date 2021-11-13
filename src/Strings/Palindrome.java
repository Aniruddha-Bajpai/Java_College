package Strings;
import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S= sc.next();
        Palindrome obj=new Palindrome();
        obj.Palindrome(S);
    }

    private void Palindrome(String str) {
        StringBuffer sb=new StringBuffer(str);
        if(str.equals(sb.reverse().toString()))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }

}
