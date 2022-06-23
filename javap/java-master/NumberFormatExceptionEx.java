class NumberFormatExceptionEx
{
	public static void main(String []args)
	{
		int i;
		String str="hello";
		try
		{
		i=Integer.parseInt(str);
		System.out.println(i);
		}
		catch(NullPointerException  ex)
		{
		ex.printStackTrace();
		}
	
	}

}