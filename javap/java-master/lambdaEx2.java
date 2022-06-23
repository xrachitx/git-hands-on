class lambdaEx2
{
public static void main(String []args)
{
      shape s2=(a,b)->
   {
	int c=a+b;
	System.out.println(c);
   };
	
	s2.add(10,20);
	
   }

}
interface shape
{

void add(int a,int b);
}
