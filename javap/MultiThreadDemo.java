import java.lang.Runnable;

class NewThread implements Runnable{
  String name;
  Thread t;
  NewThread(String threadname){
    name = threadname;
    t = new Thread(this,name);
    System.out.println("New Thread: " +t);
    t.start();
  }
     
  public void main(){
  try{
    for(int j=5;j>0;j--){
       System.out.println(name + ": " + j);
       Thread.sleep(1000);
     }
   }catch(InterruptedException e){
     System.out.println(name + " Exiting");
    }
  }
}

class MultiThreadDemo{
   public static void main(String []args){
      new NewThread("One");
      new NewThread("Two");
      new NewThread("Three");
      try{
         Thread.sleep(10000);
      }catch(InterruptedException e){
        System.out.println("Main Thread Interrupted.");
      }
      System.out.println("Main Thread Exiting.");
   }
}
