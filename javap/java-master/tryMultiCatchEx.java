class tryMultiCatchEx
{
	public static void main(String []args)
	{
		
		try
		{
		int res=10/0;
		System.out.println(res);
		}
		catch(ArithmeticException  ex1)
		{
			ex1.printStackTrace();
		}
		
		catch(Exception  ex2)
		{
		ex2.printStackTrace();
		}
		
		
	
	}

}