public class StopMe extends Thread{
  public void run(){
   int count = 1;
   System.out.println("I can Count");
   for(;;){
      System.out.print(count++ + " ");
      try{
        Thread.sleep(500);
      }catch(InterruptedException e){}
    }
   } 
   public static void main(String[] args) throws java.io.IOException {
     Thread counter = new StopMe();
     counter.start();
     System.out.println("Press enter to stop the thread counting");
     System.in.read();
     counter.stop();
  }
}
