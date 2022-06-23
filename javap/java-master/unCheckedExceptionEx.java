class unCheckedExceptionEx
{
public static void main(String []args)
{
try{
double result=10/0;
System.out.println(result);
}
catch(ArithmeticException e)
{
e.printStackTrace();
}

}

}