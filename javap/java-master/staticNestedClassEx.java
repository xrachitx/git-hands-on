class outer {
  
  private static int x=20;

  	static class inner  
	{
	  	
	 void display() 
        { 
	System.out.println(x);
	}
  	}
}

public class staticNestedClassEx 
{
  public static void main(String[] args)
 {
   	outer.inner obj=new outer.inner();
        obj.display();
  }
}