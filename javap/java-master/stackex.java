import java.util.*;
public class stackex {
	public static void main(String[] args) 
{
	      Stack<Integer> s1 = new Stack<Integer> ();

	      s1.push (12);
	      s1.push (95);
	      s1.push (89);

System.out.println("check whether stack is empty?"+s1.empty());
System.out.println ("stack elements: "+s1);
System.out.println("Top element of stack is: "+s1.peek ());
	      System.out.println ("Element removed from stack is: "+s1.pop ());
	      System.out.println ("stack elements after removal: "+s1);
	      System.out.println ("Check for element '56' in stack: "+s1.search (56));
	}
}