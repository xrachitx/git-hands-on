import java.text.*;
import java.util.*; 

public class dateex 
{ 
	public static void main(String[] args) 
	{ 
		Date d1 = new Date();
		String strDateFormat = "dd-MMM-yyyy"; 
     SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);  
		System.out.println("Current date is " + d1);
                System.out.println(objSDF.format(d1));
		
	} 
} 
