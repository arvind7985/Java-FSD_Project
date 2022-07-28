package project_2;
class D{
	private int x,y;
	public void setter(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getter()
	{
		return x+y;
	}
	
}

public class Encapsulation {
	
	public static void main(String []args)
	{
		D ob=new D();
		ob.setter(2, 3);
		int sum=ob.getter();
		System.out.println(sum);
	}
	

}
