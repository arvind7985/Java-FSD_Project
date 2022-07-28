package project_2;
import java.util.*;

public class Finally_throw {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		
		try {
			
			
			System.out.println("Value: "+(a/b));
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Wrong input");
		}
		
		// finally always execute
		finally {
			
			System.out.println("Scanner Closed Successfully");
		}
		
	}

}
