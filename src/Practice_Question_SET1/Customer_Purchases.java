package Practice_Question_SET1;

import java.util.*;
public class Customer_Purchases {
    private long ctno;
    private int price,qty;
    private String surname,firstname,product;

    public long getCtno() {
        return ctno;
    }

    public void setCtno(long ctno) {
        this.ctno = ctno;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
class  Printing
{
    public double t = 0.15;
    public double c = 0.085;
    public double d = 0.10;
    public double total;
    void Print_Details(String fn,String sn,String pd,int p,int q)
    {
        System.out.println("Customer Invoice");
        System.out.println();
        System.out.println("First Name : "+fn);
        System.out.println("Sur Name : "+sn);
        System.out.println("Product : "+pd);
        System.out.println("Price : "+p);
        System.out.println("Quantity : "+q);
        System.out.println();
    }
    void Purchase_Report(int price)
    {
        total = (price+ (t*price))-((d*price)+(c*price));
        System.out.println("REPORT OPTION PERCENTAGE");
        System.out.println();
        System.out.printf("Tax %f %%\n",t*100);
        System.out.printf("Commission %f %%\n",c*100);
        System.out.printf("Discount %f %%\n",d*100);
        System.out.println("TOTAL = %f\n"+total);
    }
}
class main
{
    public static void main(String args[])
    {
        Scanner ci = new Scanner(System.in);
        System.out.println("< Enter the number of customer purchases >");
        int cpl = ci.nextInt();
        Customer_Purchases[] cp_array =new Customer_Purchases[cpl];
        for(int i=0;i<cpl;i++)
        {
           cp_array[i] = new Customer_Purchases();
           System.out.println("<FIRST NAME>");
           cp_array[i].setFirstname(ci.next());
            System.out.println("<SURNAME>");
            cp_array[i].setSurname(ci.next());
            System.out.println("<CUSTOMER NUMBER>");
           cp_array[i].setCtno(ci.nextLong());
            System.out.println("<PRODUCT>");
           cp_array[i].setProduct(ci.next());
            System.out.println("<PRICE>");
            cp_array[i].setPrice(ci.nextInt());
            System.out.println("<QUANTITY>");
           cp_array[i].setQty(ci.nextInt());
        }
        Printing p=new Printing();
        for(int i=0;i<cpl;i++)
        {
            System.out.println(i+"  ############################### PURCHASE DETAILS ####################################  ");
            p.Print_Details(cp_array[i].getFirstname(),cp_array[i].getSurname(),cp_array[i].getProduct(),cp_array[i].getPrice(),cp_array[i].getQty());
            System.out.println(i+" ####################################### PURCHASE REPORT #################################");
            p.Purchase_Report(cp_array[i].getPrice());
        }
    }
}
