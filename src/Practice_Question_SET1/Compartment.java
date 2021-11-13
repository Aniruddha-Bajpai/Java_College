package Practice_Question_SET1;
import java.util.Scanner;
import java.util.Random;
/*
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice
message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
 */

abstract public class Compartment
{
    abstract public void notice();
}
class TestCompartment
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        Compartment obj1 = new Ladies("Ladies","All the passengers are requested to board the train on time as train would leave at the schedule time");
        Compartment obj2 = new Luggage("Luggae","The luggage coach cannot take any more luggage and must be made vacant as soon as the destination is reached");
        Compartment obj3 = new FirstClass("FirstClass","All the first class passengers are requested to preorder there night dinner if needed at the website");
        Compartment obj4 = new General("General","All the general candidate are requested to show their ticket at the time of boarding to the ticket collecting officer ");
        obj1.notice();
        obj2.notice();
        obj3.notice();
        obj4.notice();
    }
}



