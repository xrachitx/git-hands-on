class lambdaEx
{
public static void main(String []args)
{
shape s=()->{
System.out.println("interface method");};
s.draw();
}

}
interface shape
{
void draw();
}
