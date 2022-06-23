class ArrayIndexOutOfBoundsExceptionEx
{
	public static void main(String []args)
	{
		int []num=new int[]{1,2,3,4,5};
		try
		{
		
		System.out.println(num[5]);
		}
		catch(ArrayIndexOutOfBoundsException  ex)
		{
		ex.printStackTrace();
		}
	
	}

}