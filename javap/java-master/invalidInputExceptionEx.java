class invalidInputExceptionEx
{
 
public static void validInput(int num)throws invalidInputException
	{

	if(num!=100)
	{
	throw new invalidInputException("Number not correct");
	}
	else
	{
	System.out.println("valid");
	}
}
	public static void main(String []args)
	{
		try{
		validInput(100);
		}
		catch(invalidInputException ex)
		{
		ex.printStackTrace();
		}
}
}