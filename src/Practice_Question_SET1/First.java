package com;
import java.util.*;
public class First
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
          String s = in.nextLine();

//        Q1. LARGEST OF THREE NUMBERS ?
//        System.out.println( "< Enter three numbers >");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int l = a>b && a>c ? a: b>a && b>c ? b: c>a && c>b ? c : a;
//        System.out.println("Largest element is "+l);

//        Q2. Extracting Nth Fibonacci Number .
//        System.out.println("< Enter the position of the number to display from the fibonacci series >") ;
//        int a =0,b=1,pos ;
//        pos = in.nextInt() ;
//        for (int i = 2; i <= pos; i++) {
//            int temp = b ;
//            b += a ;
//            a = temp ;
//        }
//        System.out.println(pos + " fibonacci number is "+ b) ;

//        Q3. Counting occurences of given digit in a number
//        System.out.println("< Enter the number to check for counting occurences >");
//        int n = in.nextInt() ;
//        System.out.println("< Enter the number of occurences of the digit >");
//        int d = in.nextInt() ;
//        int temp = n ,count_digit = 0 ;
//        while (temp != 0){
//            if (temp%10 == d)
//            count_digit += 1 ;
//            temp /= 10 ;
//        }
//        System.out.println(d+" has "+count_digit+" occurences ");

//        Q4. Reversing a number
//        System.out.println("< ENTER THE NUMBER >");
//        int n = in.nextInt(); //23587
//        int rev = 0 ;
//        while (n != 0){
//            int rem = n%10;
//            rev = rem + (rev*10) ;
//            n /= 10 ;
//        }
//        System.out.println("The reverse of the number is "+rev); //78532
        System.out.println(s);
    }
}