//package com;
//import java.util.*;
//
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
//        while(true) {
//            System.out.println("< Enter 1. Opening Calculator 2. Closing Calculator >");
//            int op = in.nextInt();
//            while (op == 1) {
//                System.out.println("< Welcome >");
//                System.out.println("< Enter operation to be performed [+,-,/,%,*] [2-->Closing the calculator] >");
//                String func = in.next().trim();
//                if (func.equals("2")) {
//                    op = 2;
//                    break;
//                }
//                System.out.println("< Enter >");
//                System.out.println("< First Number >");
//                int n1 = in.nextInt();
//                System.out.println("< Second Number >");
//                int n2 = in.nextInt();
//                if (func.equals("+")) {
//                    System.out.println("< Result >");
//                    System.out.println(n1 + n2);
//                } else if (func.equals("-")) {
//                    System.out.println("< Result >");
//                    System.out.println(n1 - n2);
//                } else if (func.equals("*")) {
//                    System.out.println("< Result >");
//                    System.out.println(n1 * n2);
//                } else if (func.equals("/")) {
//                    System.out.println("< Result >");
//                    System.out.println(n1 / n2);
//                } else if (func.equals("%")) {
//                    System.out.println("< Result >");
//                    System.out.println(n1 % n2);
//                } else if (func.equals("2")) {
//                    op = 2;
//                    break;
//                } else {
//                    System.out.println("< Invalid Operation >");
//                }
//            }
//            if (op == 2) {
//                System.out.println("< Calculator closed >");
//                break;
//            }
//
//        }
//
//    }
//}

package com;
import java.util.*;
class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(powerInt(n1,n2));
        System.out.println(powerDouble(n1,n2));
    }
    public static double powerInt(int num1,int num2){
        return  Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}


















