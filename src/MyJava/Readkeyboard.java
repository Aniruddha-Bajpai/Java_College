import java.lang.*;
import java.util.*;
class Readkeyboard
{
public static void main(String arg[])
{
Scanner sc = new Scanner (System.in);
sc.useRadix(2);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.print(a);
}
}