package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException1 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the size of the array");
            int[] arr = new int[sc.nextInt()];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter index of elements in the array");
            int index = sc.nextInt();
            System.out.println(arr[index]);
            System.out.println("The array elements successfully accessed");
        }
        catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }catch(NumberFormatException obj)
        {
            System.out.println(obj);
        }
        catch(InputMismatchException obj)
        {
            System.out.println(obj);
        }

    }
}
