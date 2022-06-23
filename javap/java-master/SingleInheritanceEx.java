	class SingleInheritanceEx
	{
		public static void main(String []args)
		{
			B b =new B();
			b.add();
			b.disp();
		}


	}

	class A
	{
		private int num1;
		public int num2;
		protected int num3;

		A()
		{

		num1=10;
		num2=20;
		num3=30;
		}
		void add()
		{
		int c=num1+num2+num3;
		System.out.println(c);
		}

	}
	class B extends A
	{
		int num4;
		B()
		{
		num4=40;
		}
		void disp()
		{
		int res=num2+num3+num4;
		System.out.println(res);
		}	
	}