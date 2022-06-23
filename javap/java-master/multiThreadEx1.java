class multiThreadEx1 
{

	public static void main(String []args)
	{
	new Mythread1().start();
	new Mythread2().start();
	new Mythread3().start();

	}

}
class Mythread1 extends Thread
{

	public void run()
	{
	System.out.println("I am in thread 1");
	}
}
class Mythread2 extends Thread
{

	public void run()
	{
	System.out.println("I am in thread 2");
	}
}
class Mythread3 extends Thread
{

	public void run()
	{
	System.out.println("I am in thread 3");
	}
}

