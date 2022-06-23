import java.io.*;

class AddBytes{
   public static void main(String[] args){
      byte progNames[] = {'J','a','v','a','\n','D','o','t','N','e','t','\n','C','\n','C','+','+','\n','C','#','\n','P','y','t','h','o','n','\n'};
      FileOutputStream flOutStr = null;
      try{
        flOutStr = new FileOutputStream("progLanguages.txt");
        flOutStr.write(progNames);
        flOutStr.close();
      }catch(IOException e){
         System.out.println(e);
         System.exit(-1);
      }
    }
}
