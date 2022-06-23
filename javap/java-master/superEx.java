class classA
{
int num1=10;
int num2=20;
int result;
public void add()
{
result=num1+num2;
System.out.println(result);
}
}
class classB extends classA
{
public void show()
{
System.out.println(super.num1);
super.add();
}
}
class superEx
{
public static void main(String []args)
{
classB b=new classB();
b.show();
}
}