import java.util.*;
class arithmeticOp
{
	public static void main(String []args)
	{
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first value");
		a=sc.nextInt();
		System.out.println("Enter second value");
		b=sc.nextInt();
		int add=a+b;
		int sub=a-b;
		int mult=a*b;
		double div=a/b;
		System.out.println("Addition"+add);
		System.out.println("Subtractipon"+sub);
		System.out.println("Multiplication"+mult);
		System.out.println("Division"+div);
	}


}