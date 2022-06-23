interface i1{
 void disp();
}
interface i2
{
void disp1();
}

class A implements i1,i2
{
public void disp()
{
System.out.println("disp method");
}
public void disp1()
{
System.out.println("disp1 method");
}
}
public class interfaceEx
{

public static void main(String []args)
{
A a=new A();
a.disp();
a.disp1();
}
}