package Practice_Question_SET1;

import java.util.*;
class TenDigit
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0 ,c=0;
        while(c!=2){
            k = n%10;
            n = n/10;
            c++;
        }
        System.out.println(k);
    }
}