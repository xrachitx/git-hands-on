class callingMemberMethodUsingSuperEx
{
	public static void main(String []args)
	{
	B b=new B();
	b.show();
		
	}


}
class A 
{
	int num=10;
	void disp()
	{
	System.out.println("hello");
	}
}
class B extends A
{
	int num=20;
	void disp()
	{
	System.out.println("hi");
	}
	
	void show()
	{
	System.out.println(super.num);
	super.disp();
	}
}