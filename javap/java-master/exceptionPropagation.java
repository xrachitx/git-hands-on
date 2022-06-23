class exceptionPropagation
{

	public static void method1()
	{
	int a=10/0;
	}
	public static void method2()
	{
	method1();
	}
	public static void method3()
	{
	try{  
    	method2();  
   	}catch(Exception e){System.out.println("exception handled");}  
	}

	public static void main(String []args)
	{
	method3();
	}

}