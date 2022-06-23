mport java.io.*;
public class UsingConsoleClass{
    public static void main(String ar[])
{
        Console c=System.console();
       
        String s1=c.readLine("Enter Fist value   ");
        String s2=c.readLine("Enter Second value ");;
       
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
       
        System.out.println("Addition = "+(a+b));
    }
}