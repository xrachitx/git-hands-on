class throwExceptionEx
{
  	public static void getAge(int age)
	{
		if(age<18){
			throw new ArithmeticException("Age Not valid");
			}
		else
			{System.out.println("Valid");} 
	}
	
	public static void main(String []args)
	{

	getAge(19);
	}


}