package project_2;
class A{
	void display(){
	System.out.println("Display child");
	}
}

public class inheritance extends A {
	
	public static void main(String [] args)
	{
		inheritance ob=new inheritance();
		ob.display();
	}

}
