package project_2;
class child{
	public void display()
	{
		System.out.println("child ");
	}
}
public class polymorphism extends child{
	public void sum(int x,int y)
	{
		System.out.println("sum of two no "+(x+y));
	}
	public void sum(int x,int y,int z)
	{
		System.out.println("sum of two no "+(x+y+z));
	}
	
	public void display()
	{
		System.out.println("parent ");
	}
	public static void main(String [] args)
	{
		polymorphism ob=new polymorphism();
		ob.display();
		ob.sum(1,2);
		ob.sum(1, 2,3);
	
	}

}
