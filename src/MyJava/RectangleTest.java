class rectangle 
{
 	private double length ;
	private double breadth;
	public double getLen()
	{
		return length;
	}
	public double getbre()
	{
		return breadth;
	}
	public void setLen(double l)
	{
		length = l;
	}
	public void setbre(double b)
	{
		breadth = b;
	}
	public double area()
	{
		return getLen()*getbre();
	}
	public double perimeter()
	{
		return 2*(getLen()+getbre());
	}
}

public class RectangleTest 
{
	public static void main(String args[])
	{
		rectangle obj = new rectangle ();
		obj.setLen(10.5);
		obj.setbre(5.5);
		System.out.println("Area "+obj.area());
		System.out.println("Perimeter "+obj.perimeter());
	}
}


