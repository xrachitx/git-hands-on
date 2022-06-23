class multilevel
{

public static void main(String []args)
{
computer c=new computer();
c.disp();
}

}
class faculty
{
double salary;
double totalSalary;

faculty()
{
salary=25000.00;
totalSalary=0.0;
}

}
class science extends faculty
{
private double bonus;
science()
{
bonus=2000.00;
}
protected void disp()
{
totalSalary=salary+bonus;
System.out.println("Total Salary of Science Teacher:"+totalSalary);
}
}
class computer extends science
{
private double bonus;
computer()
{
bonus=3000;
}
protected void disp()
{
super.disp();
totalSalary=salary+bonus;
System.out.println("Total Salary of Computer Teacher:"+totalSalary);
}
}