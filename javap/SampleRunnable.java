class SampleRunnable implements Runnable{
   public static void main(String[] args){
     SampleRunnable SRun = new SampleRunnable();
     Thread thr = new Thread(SRun);
     thr.start();
     System.out.println("Hello World >> from the main program");
   }

 public void run(){
   System.out.println("Hello world >> from thread");
   try{
      Thread.sleep(10000);
   }catch(InterruptedException e){
       System.out.println("Thread Interrupted");
   }
 }
}
  
