class Share extends Thread{
   static String[] msg = {"Following","is","a","Synchronized","variable"};
   
   Share(String threadname){
     super(threadname);
   }

   public void run(){
     display(getName());
   }

   public void display(String ThreadN){
     synchronized(this){
       for(int i=0; i<=4;i++)
         System.out.println(ThreadN + msg[i]);
       try{
          this.sleep(1000);
       }catch(Exception e){}
     }
  }
}

public class SynchroStatement{
   public static void main(String[] args){
      Share T1 = new Share("Thread 1:");
      T1.start();
      Share T2 = new Share("Thread 2:");
      T2.start();
   }
}
