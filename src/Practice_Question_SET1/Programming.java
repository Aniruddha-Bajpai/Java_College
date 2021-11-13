package Practice_Question_SET1;

public class Programming {
    public String message;
    Programming()
    {
         message = "programming languages";
    }
    Programming(String message)
    {
        this.message=message;
    }
    void display()
    {
        System.out.println("I love "+message);
    }
    public static void main(String args[])
    {
        Programming ob =new Programming("Java");
        ob.display();
    }
}
