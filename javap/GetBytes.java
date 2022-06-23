import java.io.*;

class GetBytes{
   public static void main(String[] args){
      FileInputStream flInStr = null;
      int a;
      try{
        flInStr = new FileInputStream(args[0]);
        while((a=flInStr.read()) != -1){
          System.out.print((char)a);
        }
        flInStr.close();
      }catch(IOException e){
         System.out.println(e);
      }
   }
}
