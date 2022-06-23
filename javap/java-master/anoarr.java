// Java program to illustrate the 
// concept of anonymous array 
class anoarr { 
	public static void main(String[] args) 
	{ 
		// anonymous array 
		sum(new int[]{ 1, 2, 3 }); 
	} 
	public static void sum(int[] a) 
	{ 
		int total = 0; 
		for (int i : a) 
	        total = total + i; 
	        System.out.println("sum is:" + total); 
	} 
} 
