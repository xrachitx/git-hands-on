import java.io.*;

class ReadWriteCharacters{
   public static void main(String[] args){
      File sourceFile = new File("source.txt");
      File destFile = new File("destination.txt");
      FileReader fileinstr = null;
      FileWriter fileoutstr = null;
      try{
         fileinstr = new FileReader(sourceFile);
         fileoutstr = new FileWriter(destFile);
         int ch;
         while((ch=fileinstr.read()) != -1){
            fileoutstr.write(ch);
         }
      }catch(IOException e){
        System.out.println(e);
        System.exit(-1);
      }finally{
        try{
           fileinstr.close();
           fileoutstr.close();
        }catch(IOException e){}
      }
   }
}
