class abstractEx
{
public static void main(String []args)
{

rectangle r=new rectangle(6);
r.draw();
r.disp();

}

}
abstract class shape 
{
abstract void draw();
void disp()
{
System.out.println("i am in shape");
}
shape(int a)
{
System.out.println("i am shape constructor"+a);
}

}
class rectangle extends shape
{
rectangle(int n)
{
super(5);
}
void draw()
{
System.out.println("draw rect");
}

}
class circle extends shape
{
circle()
{
super(7);
}
void draw()
{
System.out.println("draw circle");
}

}