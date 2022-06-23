

public class SRDemo extends Thread 
{
 public void run()
 { 
//try {

 for( int i = 0; i < 7; i++ )

 { 
 //Thread.sleep(5000);
 System.out.println("Thread: " + i );
 } 
//} 
/*catch( InterruptedException e ) 
{
 e.printStackTrace(); 
}*/
 }
 public static void main( String args[ ] )
 { 
SRDemo srd1 = new SRDemo(); 
SRDemo srd2 = new SRDemo();

srd1.setName("First"); 
srd2.setName("Second"); 
srd1.start(); 
srd2.start(); 
Thread.sleep(5000);
try { 
Thread.sleep(5000);
srd1.suspend(); 
System.out.println("Suspending thread First"); 
Thread.sleep(5000); 
srd1.resume(); 
System.out.println("Resuming thread First");
Thread.sleep(5000); 
srd2.suspend(); 
System.out.println("Suspending thread Second"); 
Thread.sleep(5000); 
srd2.resume(); 
System.out.println("Resuming thread Second"); 
} 
catch(InterruptedException e)
 { 
e.printStackTrace();
 }
 }
 } 