import java.util.*; 
class palindrome{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int num1=num;
int remainder, result=0;
while(num>0)
{
remainder = num%10;
result = result * 10 + remainder;
num = num/10;
}
if(num1==result)
{
System.out.println("No. is palindrome");
}
else
{
System.out.println("No. is not a palindrome");

}
}
}