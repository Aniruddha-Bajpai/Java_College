package Practice_Question_SET1;

import java.util.*;
public class optimising_prime {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int c=2;
        while(c<n){
            if(n%c==0) {
                System.out.println("not prime");
                break;
            }
            c++;
        }
    }
}
