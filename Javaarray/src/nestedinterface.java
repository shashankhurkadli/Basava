interface Demo30
{
	void display();
	public interface Demo40
	{
		void msg();
	}
	
}
public class nestedinterface implements Demo30.Demo40
{
public void msg()
{
	System.out.println("am on my way");
}
public static void main(String[] args) 
{
	nestedinterface n=new nestedinterface();
	n.msg();
}
}
