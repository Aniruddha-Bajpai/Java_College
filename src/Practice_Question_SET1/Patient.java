package Practice_Question_SET1;

import java.util.*;
class Patient
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patientName = sc.nextLine();
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        Patient ob = new Patient();
        System.out.println(ob.compute(height,weight));
    }
    public double compute(double wt, double ht){
        double bmi;
        bmi = wt/(ht*ht);
        return bmi;
    }
}