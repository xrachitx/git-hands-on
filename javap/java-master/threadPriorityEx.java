class threadPriorityEx
{
public static void main(String[] args)
{
threadA a=new threadA();
threadB b=new threadB();
threadC c=new threadC();
c.setPriority(Thread.MAX_PRIORITY);
b.setPriority(Thread.NORM_PRIORITY);
a.setPriority(Thread.MIN_PRIORITY);


a.start();
b.start();
c.start();
}

}
class threadA extends Thread
{

public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println(i);
}
System.out.println("Thread A completed");
}
}
class threadB extends Thread
{

public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println(i);
}
System.out.println("Thread B completed");
}
}
class threadC extends Thread
{

public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println(i);
}
System.out.println("Thread C completed");
}
}