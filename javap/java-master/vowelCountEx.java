import java.io.*;
import java.util.*;
class vowelCountEx
{
public static void main(String args[])throws IOException
{
int n=0,ct=0,wo=0;
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter the file do u want to read");
String f=d.readLine();
FileInputStream f1=new FileInputStream(f);
DataInputStream in=new DataInputStream(f1);
String strline;
while((strline=in.readLine())!=null)
{
n=n+1;
for(int i=0;i<strline.length();i++)
{
char c=strline.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
ct++;
}
}
StringTokenizer st=new StringTokenizer(strline);
while(st.hasMoreTokens())
{
String s=st.nextToken();
wo++;
}
}
System.out.println("File Contains");
System.out.println(n + " Lines");
System.out.println(ct + " Vowels");
System.out.println(wo + " Words"
);
}
}