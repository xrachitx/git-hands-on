import java.io.*;

public class deleteFileEx {
   public static void main(String[] args)throws IOException 
	{ 
      		
         	boolean success = (new File("D:\\output.txt")).delete();
         
         	if (success) {
            System.out.println("The file has been successfully deleted"); 
                }
        }
}