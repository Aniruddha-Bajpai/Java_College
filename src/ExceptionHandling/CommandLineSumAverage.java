package ExceptionHandling;

public class CommandLineSumAverage {
    public static void main(String args [])
    {
        int sum= 0;
        double avg;
        for(int i=0;i<args.length;i++)
        {
            sum+= Integer.parseInt(args[i]);
        }
        avg = sum/ args.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
