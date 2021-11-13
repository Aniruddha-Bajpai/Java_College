package Practice_Question_SET1;

import java.lang.*;
import java.util.*;
public class Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String gender = sc.nextLine();
        int age = sc.nextInt();
        Interest ob = new Interest();
        ob.percentage(gender,age);
    }
    void percentage(String g,int a){
        if(g.equals("Female")){
            if(a>=1 && a<=58){
                System.out.println("Percentage of interest is 8.2%");
            }
            else if(a>=59 && a<=100) {
                System.out.println("Percentage of interest is 9.2%");
            }
        }
        else{
            if(a>=1 && a<=58)
            {
                System.out.println("Percentage of interest is 8.4%");
            }
            else if(a>=59 && a<=100){
                System.out.println("Percentage of interest is 10.5%");
            }
        }
    }
}
