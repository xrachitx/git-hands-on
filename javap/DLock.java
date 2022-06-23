public class DLock{
  public static void main(String[] args){
    final Object res1 = "First Resource";
    final Object res2 = "Second Resource";
  
    Thread th1 = new Thread(){
     public void run(){
        synchronize(res1){
          System.out.println("First Thread: locked first resource");
          try{
            Thread.sleep(100);
          }catch(InterruptedException e){}
        }
        synchronize(res2){
          System.out.println("First Thread: Locked Second Resource");
        }
     }
    };
    Thread th2 = new Thread();
    public void run(){
        synchronized(res2){
           System.out.println("Second Thread: Locked second resource");
           try{
              Thread.sleep(100);
           }catch(InterruptedException e){}
         }
         synchronized (res1){
           System.out.println("Second Thread" locked first resource");
         }
     }
    th1.start();
    th2.start();
  }
}
