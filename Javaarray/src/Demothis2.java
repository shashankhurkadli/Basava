
public class Demothis2
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
   Demothis2 d1=new Demothis2();
		d1.display();
		
	}
}
