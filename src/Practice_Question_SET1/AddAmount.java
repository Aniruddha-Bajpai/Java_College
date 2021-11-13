package Practice_Question_SET1;
class PiggieBank
{
    public double initialAmount;
    PiggieBank()
    {
        initialAmount=50.0;
    }
    public static void main(String args[])
    {
        AddAmount ob = new AddAmount(56);
        PiggieBank pb = new PiggieBank();
        pb.initialAmount+= ob.amount;
        System.out.println(pb.initialAmount);
    }
}
public class AddAmount
{
    public double amount;
    AddAmount()
    {
        amount=50.0;
    }
    AddAmount(double amount)
    {
        this.amount=amount;
    }
}