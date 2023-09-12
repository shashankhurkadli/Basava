public class Parent2 
{
	int x=10;

}
class Sample extends Parent2
{
	void display()
	{
		System.out.println("hi");
	}
}
class child
{
	public static void main(String[] args) 
	{
		Sample d1=new Sample();
		System.out.println(d1.x);
		d1.display();
		
		
	}
}
