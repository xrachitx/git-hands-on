import java.io.*;

class CreateNewFile{
  public static void main(String[] args){
    try{
       File fileObj;
       fileObj = new File("BookDetails.txt");
       if(!fileObj.exists()){
         fileObj.createNewFile();
         System.out.println("A New file \"BookDetails.txt\" has been created in the current directory");
       }
    }catch(Exception e){
       System.err.println("Error:"+e.getMessage());
    }
  }
}
