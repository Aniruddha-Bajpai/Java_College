package Practice_Question_SET1;
import java.util.*;
public class bitwise {
    public static void main(String args[]) {
        Scanner in =  new Scanner(System.in);
        int a;
        a = in.nextInt();
        a = a<<2;   //a*(2^2)
        System.out.println("multiply by 4 using bitwise operator "+a);
    }
}
