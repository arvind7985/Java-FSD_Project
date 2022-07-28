package project_2;
interface First {
	
	public default void show() {
		System.out.println("This is my first  interface method");
	}

}
interface Second {
	
	public default  void show() {
		System.out.println("This is my second interface");
	}

}


public class DiamondProblem implements First,Second {
	
	public void show() {
		
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		DiamondProblem  t = new DiamondProblem();
		t.show();
	}

}
