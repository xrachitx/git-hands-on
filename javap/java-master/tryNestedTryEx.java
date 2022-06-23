class tryNestedTryEx
{
	public static void main(String []args)
	{
		int []num=new int[]{1,2,3};
		
		try
		{
		int res=10/5;
		
		
			try{
				System.out.println(num[5]);
			   }
			catch(ArrayIndexOutOfBoundsException  ex1)
			{
			ex1.printStackTrace();
			}
		System.out.println(res);
		}
		catch(Exception  ex2)
		{
		ex2.printStackTrace();
		}
		
		
	
	}

}