class TwoStrings{
  synchronized static void print(String str1, String str2){
     System.out.print(str1);
     try{
        Thread.sleep(400);
     }catch(InterruptedException e){}
     System.out.println(str2);
  }
}

class PrintStringsThread implements Runnable{
   Thread thread;
   String str1, str2;
   PrintStringsThread(String str1, String str2){
     this.str1=str1;
     this.str2=str2;
     thread = new Thread(this);
     thread.start();
   }

   public void run(){
     TwoStrings.print(str1,str2);
   }
}

class SynchroThread2{
   public static void main(String[] args){
     new PrintStringsThread("Hello","Dear");
     new PrintStringsThread("How do","You do");
     new PrintStringsThread("Nice","To meet you");
  }
}
