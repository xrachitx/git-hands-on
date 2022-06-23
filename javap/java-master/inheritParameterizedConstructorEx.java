	class inheritParameterizedConstructorEx
	{
		public static void main(String []args)
		{
			
			B b=new B(10);
			
		}
		
	}

 	class A
		{

			A(int num)
			{
			System.out.println("I am constructor in Class A"+num);
			}
			
		}
		class B extends A
		{

		B(int num2)
		{
		super(10);
		System.out.println("I am constructor in Class B"+num2);
		}
			
		}