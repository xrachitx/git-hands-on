import java.util.*;
class pattern2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,rowsize,k,space=8,star=1;
		System.out.println("Enter no. of rows want to                 print pattern");
		rowsize=sc.nextInt();
		for(i=1;i<=rowsize;i++)
		{
		        System.out.println();
			for(j=1;j<=space;j++)
			{
			System.out.print(" ");
			}
			for(k=1;k<=star;k++)
			{
			System.out.print("*");
			}
			space=space-1;
			star=star+2;
		}

	}
   
}

