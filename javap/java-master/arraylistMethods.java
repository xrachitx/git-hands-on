import java.util.*;
class arraylistMethods
{
	public static void main(String []args)
	{
	int ch;
	String str1=null;
	ArrayList<String> list=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
		do{
		System.out.println("\nEnter your choice");
		System.out.println("1.Add Elements\n2.Display\n3.insert at specified poition\n4.Get Size\n5.Get item \n6.Exit");
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
			case 1:
			System.out.println("Enter Elements");
			str1=sc.nextLine();
			list.add(str1);
			break;
			case 2:
			System.out.println("Elements are:");
				System.out.print("[");
				for(String x :list)
				{

				System.out.print(x+" ");
				}
				System.out.print("]");
			break;
			case 3:
			System.out.println("Enter position");
			int pos=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Element");
			String str2=sc.nextLine();
			list.add(pos,str2);
			break;
			case 4:
			System.out.println("Size:"+list.size());
			break;
			case 5:
			System.out.println("Enter index");
			int pos1=sc.nextInt();
			sc.nextLine();
			System.out.println("Your Selected Item:"+list.get(pos1));
break;
			case 6:
				System.exit(0);
			default:
			 System.out.println("Invalid options");



		}

		}while(ch!=6);
		
		
	}

}