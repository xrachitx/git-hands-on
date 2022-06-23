class Sort{
  int num = 0;
  Boolean value = false;
  synchronized int get(){
    if(value == false)
      try{
         wait();
      }catch(InterruptedException e){
        System.out.println("Interrupted Exception Caught");
      }
    System.out.println("consume: " +num);
    value=false;
    notify();
    return num;
  }

  synchronized void put(int num){
    if(value == true)
      try{
         wait();
      }catch(InterruptedException e){
         System.out.println("Interrupted Exception Caught");
      }
    this.num = num;
    System.out.println("Produce:" + num);
    value = false;
    notify();
  }
}

class Construct extends Thread{
  Sort s;
  Construct(Sort s){
    this.s = s;
    this.start();
  }

  public void run(){
    int i = 0;
    s.put(++i);
  }
}

class User extends Thread{
   Sort s;
   User(Sort s){
      this.s = s;
      this.start();
   }

   public void run(){
     s.get();
   }
}

public class InterThread{
   public static void main(String[] args){
     Sort s= new Sort();
     new Construct(s);
     new User(s);
   }
} 
