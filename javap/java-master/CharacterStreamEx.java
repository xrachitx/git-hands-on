import java.io.*; 
 
class CharacterStreamEx 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // Accept a string  
        String str = "File Handling in Java";
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("D:\\FileWrite1.txt"); 
  
        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("Writing successful"); 
        //close the file  
        fw.close(); 
// variable declaration 
        int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("D:\\FileWrite1.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 



    } 
}