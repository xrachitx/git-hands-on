import java.util.StringTokenizer;  

public class StrTokenizer{  
 public static void main(String args[]){  
   String a=":";
   StringTokenizer st = new StringTokenizer("my: name: is: Ram"," ");  
     System.out.println("Total Tokens : " + st.countTokens());
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  
