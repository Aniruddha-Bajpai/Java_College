package Practice_Question_SET1;

import java.util.*;
public class AddLastDigit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum =0;
        sum = (n1%10)+(n2%10);
        System.out.println(sum);
    }
}
