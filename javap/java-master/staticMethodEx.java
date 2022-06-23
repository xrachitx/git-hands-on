class employee
{

static String name="Kumar";

public static void disp()
{
System.out.println(name);
}

}
class staticMethodEx
{
public static void main(String []args)
{
//static method calling by using class name
employee.disp();
}

}