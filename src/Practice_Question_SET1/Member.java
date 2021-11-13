package Practice_Question_SET1;

import javax.net.ssl.ManagerFactoryParameters;
import java.util.Scanner;

class Employee extends Member
{
 String specialization;
 String Department ;
 Employee(String Name,int age,String addrss,String pno,int salary,String specialization,String Department)
 {
     super( Name, age, addrss, pno, salary);
     this.Department = Department ;
     this.specialization = specialization ;
 }
}
class Manager extends Member
{
    String specialization;
    String Department;
    Manager(String Name,int age,String addrss,String pno,int salary,String Department ,String specialization)
    {
        super( Name, age, addrss, pno, salary);
        this.Department=Department;
        this.specialization=specialization;
    }

}
public class Member {
    String Name;
    int age;
    String pno;
    String addrss;
    int salary;
     Member(String Name,int age,String addrss,String pno,int salary)
    {
        this.addrss=addrss;
        this.age=age;
        this.Name=Name;
        this.pno=pno;
        this.salary=salary;
    }
    void printSalary()
    {
        System.out.println(salary);
    }
}
class Test_Employee_Manager
{
    public static void main(String[] args)
    {
        Scanner input_console = new Scanner(System.in);
        Employee obj1 =new Employee("Aniruddha Bajpai",19,"Lucknow","9198787712",900000,"Backend","Maintenance");
        Manager obj2 =new Manager("Aniruddha bajpai",19,"Lucknow","9198787712",2500000,"Product based","Devops");
        System.out.println("Salary of the employee is ");
        obj1.printSalary();
        System.out.println("Salary of the Manager is ");
        obj2.printSalary();
    }
}

