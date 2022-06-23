class emp1
{
public int id;
public String name;
public void setdata(int a, String b)
{
id=a;
name=b;
}
public void getdata()
{
System.out.println("Id:"+id+"\n"+"Name:"+name);
}
}
class methodEx
{

public static void main(String []args)
{
emp1 e=new emp1();
e.setdata(111,"kumar");
e.getdata();
} 
}