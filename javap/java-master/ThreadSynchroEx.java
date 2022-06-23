class BankAccount {

    int accountNumber; 
	
    double accountBalance=1000;

    public synchronized void deposit(double amount) 
    {
	double newAccountBalance;

	if( amount < 0.0)
	{
          System.out.println("Can Not deposit");
	}
		
	else
	{
          newAccountBalance = accountBalance + amount;
          accountBalance = newAccountBalance;
	 System.out.println("Total balance amount:"+accountBalance); 
         }
}
     }
class Thread1 extends Thread
{
BankAccount b;
Thread1(BankAccount b)
{
this.b=b;
}
public void run()
{
b.deposit(200);
}}
class Thread2 extends Thread
{
BankAccount b;
Thread2(BankAccount b)
{
this.b=b;
}
public void run()
{

b.deposit(300);
}}
public class ThreadSynchroEx{
 public static void main(String args[])
{
BankAccount b1=new BankAccount();
  Thread1 t1=new Thread1(b1);
  Thread2 t2=new Thread2(b1);
  t1.start();
  t2.start();
 }
}
