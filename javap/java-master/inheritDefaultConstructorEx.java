	class inheritDefaultConstructorEx
	{
		public static void main(String []args)
		{
			
			B b=new B();
			
		}
		
	}

 	class A
		{

			A()
			{
			System.out.println("I am constructor in Class A");
			}
			
		}
		class B extends A
		{

		B()
		{
		System.out.println("I am constructor in Class B");
		}
			
		}