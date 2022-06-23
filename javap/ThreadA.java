import java.lang.Runnable;

class MyNewThread1 implements Runnable{
  Thread a;
  MyNewThread1(){
    a = new Thread(this, "A Thread");
    System.out.println("Demo thread :" + a);
    a.start();
  }

  public void run(){
    try{
       for(int j=5;j>0;j--){
         System.out.println("Demo thread : " +j);
         Thread.sleep(300);
       }
    } catch(InterruptedException e){
      System.out.println("Demo interrupted. ");
    }
    System.out.println("Exiting Demo Thread.");
  }
}

class ThreadA{
  public static void main(String []args){
     new MyNewThread1();
     try{
        for(int j=5;j>0;j--){
          System.out.println("The Main Thread: " + j);
          Thread.sleep(1500);
        }
     }catch (InterruptedException e){
        System.out.println("The Main Thread Interrupted.");
     }
     System.out.println("The Main Thread Exiting.");
  }
}
