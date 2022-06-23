//This example shows implementaion of class and object
//To take employee details from user and display details to the user
import java.util.*;

class employeeDetails
{
Scanner sc=new Scanner(System.in);
public int emp_id;
public String emp_name;
public void setDetails()
{
System.out.println("Enter Employee ID");
emp_id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee Name");
emp_name=sc.nextLine();


}
public void getDetails()
{
System.out.println("Emp id:"+emp_id);
System.out.println("Emp Name:"+emp_name);

}


}