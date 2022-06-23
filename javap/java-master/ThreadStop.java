public class ThreadStop implements Runnable {

        public void run() {
                System.out.println("Starting " + Thread.currentThread().getName()
                                + "....");
                try {
                        Thread.sleep(5000);

                }
 		catch (Exception e) 
		{
                }

                System.out.println(Thread.currentThread().getName()
                                + " execution completed.");
        }

        public static void main(String[] args) throws Exception 
{
                ThreadStop threadstop1 = new ThreadStop();
                ThreadStop threadstop2 = new ThreadStop();
		Thread thread1=new Thread(threadstop1);
		Thread thread2=new Thread(threadstop2);

                thread1.start();
                thread2.start();
                // stop thread thread1
                thread1.stop();
                System.out.println(thread1.getName() + " stopped by user.");
                thread1.join();
                thread2.join();
        }
}