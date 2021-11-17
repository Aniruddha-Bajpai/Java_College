package College_coding.arrayPractice;
import java.util.Scanner;
//Q1. write a Java program to find if the given number is palindrome or not
//
//        Example1)
//        C:\>java Sample 110011
//        O/P: 110011 is a palindrome
//
//        Example2)
//        C:\>java Sample 1234
//        O/P: 1234 is not a palindrome
public class Question_1 {
    public static void main(String args[]) {
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        int temp =num;
        int rev = 0;
        while (num!=0)//110011
        {
            int r = num%10;
            rev = rev*10 +r;
            num/=10;
        }
        if (rev==temp)
        {
            System.out.println(temp+" is a palindrome number");
        }
        else
        {
            System.out.println(temp+" is not a palindrome number");
        }
    }
}
