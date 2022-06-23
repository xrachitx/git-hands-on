import java.lang.Thread;

class NewThreadY extends Thread{
  NewThreadY(){
    super("DemoA Thread");
    System.out.println("ChildC thread: " + this);
    start();
  }
  public void run(){
  try{
        for(int j=5;j>0;j--){
            System.out.println("ChildC Thread: " + j);
            Thread.sleep(400);
          }
       }catch(InterruptedException e){
          System.out.println("ChildC Interrupted."); 
       }
    System.out.println("Exiting ChildC Thread.");
   }
}

class ExtendThread{
  public static void main(String []argc){
     new NewThreadY();
     try{
       for(int j=5; j>0; j--){
          System.out.println("The Main Thread: " + j);
          Thread.sleep(1500);
        }
      }catch(InterruptedException e){
         System.out.println("The Main Thread Interrupted.");
      }
      System.out.println("The Main Thread exiting.");
   }
}
