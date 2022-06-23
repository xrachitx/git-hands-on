class NullPointerExceptionEx
{
	public static void main(String []args)
	{
		String str=null;
		try
		{
		System.out.println(str.length());
		}
		catch(NullPointerException  ex)
		{
		ex.printStackTrace();
		}
	
	}

}