import java.io.*;

public class FinallyException{
  public static FileInputStream inputStream(String fileName) 
      throws FileNotFoundException {
      FileInputStream fis = new FileInputStream(fileName);
      System.out.println("fis:File Input Stream Created");
      return fis;
  }
 
  public static void main(String []args){
      FileInputStream fis1 = null;
      String fileName = "sangwan.txt";
      try{
         fis1 = inputStream(fileName);
      } catch (FileNotFoundException ex) {
           System.out.println("FileNotFoundException occured");
      } catch(Exception ex) {
             System.out.println("General Exception Occured");
      }
      System.out.println(FinallyException.class.getName() + " Ended");
  }
}
