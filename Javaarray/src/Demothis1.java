
public class Demothis1
{
	void display() 
	{
		this.show();
		System.out.println("inside display function");
	}
	void show()
	{
		System.out.println("inside show function");
	}
	public static void main(String[] args)
	{
   Demothis1 d1=new Demothis1();
		d1.display();
		
	}
}
