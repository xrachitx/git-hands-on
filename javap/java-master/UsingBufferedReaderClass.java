import java.io.*;
public class UsingBufferedReaderClass
{
    public static void main(String ar[])throws IOException
{
        InputStreamReader isr=new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter first value");
        String s1=br.readLine();

        System.out.println("Enter Second value");
        String s2=br.readLine();
       
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
       
        System.out.println("Addition = "+(a+b));
    }
}