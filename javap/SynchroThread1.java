class share extends Thread{
  static String[] msg={"Following", "is", "a", "Synchronized", "Variable"};
  share(String threadname){
     super(threadname);
  }
  
  public void run(){
    display(getName());
  }

  public synchronized void display(String threadN){
    for(int k=0; k<=4; k++)
       System.out.println(threadN+msg[k]);
    try{
        this.sleep(1500);
    }catch(Exception e){}
  }
}

public class SynchroThread1{
   public static void main(String[] args){
     share T1 = new share("Thread 1:");
     T1.start();
     share T2 = new share("Thread 2:");
     T2.start();
   }
}


  
