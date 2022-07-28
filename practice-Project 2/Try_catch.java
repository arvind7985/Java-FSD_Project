package project_2;
import java.util.*;

public class Try_catch {
	public static void main(String [] args)
	{

	String str="Cggfhjfg";
	int number;
	
     

		try {
			
			number=Integer.parseInt(str);
			System.out.println("Number == "+number);
		}
		catch (Exception e) {
			
			System.out.println("Exception Occured: "+e);
		}
		// Airthmetic exception
		int a=1;
		int b=1;
		
		
		try {
			int c=a/b;
			System.out.println("Result is: "+c);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		int ar[]= {1,2,3,4,5};
		
		
		try {
			
			System.out.println("Result is: "+ar[6]);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		

}
	
}
