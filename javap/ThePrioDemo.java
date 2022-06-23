class clicker implements Runnable{
  int click = 0;
  Thread t;
  private volatile Boolean running = true;
  public clicker(int p){
     t = new Thread(this);
     t.setPriority(p);
  }
 
  public void run(){
    while(running){
      click++;
    }
  }
 
  public void stop(){
    running = false;
  }

  public void start(){
    t.start();
  }
}

class ThePrioDemo{
  public static void main(String []args){
     Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
     clicker the = new clicker(Thread.NORM_PRIORITY + 2);
     clicker pri = new clicker(Thread.NORM_PRIORITY-2);
     the.start();
     pri.start();
     try{
       Thread.sleep(10000);
     } catch(InterruptedException e){
        System.out.println("Main Thread Interrupted");
     }

     the.stop();
     pri.stop();
     try{
        the.t.join();
        pri.t.join();
     } catch(InterruptedException e) {
       System.out.println("InterruptedException Caught");
     }

     System.out.println("Low Priority Thread: " + the.click);
     System.out.println("High Priority Thread: " + pri.click);
   }
}
