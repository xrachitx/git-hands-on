import java.util.*;
class factorialex
{
	public static void main(String []args)
	{
	int num,i,fact=1;
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter number");
	 num=sc.nextInt();
         for(i=1;i<=num;i++)
	 {
	 fact=fact*i;
	 }
	System.out.println("Result:"+fact);
		
	}


}