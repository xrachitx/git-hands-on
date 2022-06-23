class UDefExcept extends Exception{
   String note="";
   int marks;

   public UDefExcept(){
   }

   public UDefExcept(String s1){
     super(s1);
   }

   public String toString(){
     if(marks <= 40)
       note="You need to Improve";
     else
       note="Good Efforts";
     return note;
   }
}

public class ExcetionExample{

   public static void main(String []args){
      ExcetionExample t=new ExcetionExample();
      t.tm();
   }

   public void tm(){
     try {
       int j=0;
       if(j < 40)
          throw new MyExcept();
       }
      catch(MyExcept ee1){
        System.out.println("My Exception" + ee1);
     }
   }
}  
