abstract class huli
{
	abstract void print();
}
 class huli2
{
	public void disp()
	{
		System.out.println("puli");
	}
}
class shima extends huli
{
	void print()
	{
		System.out.println("shivani");
	}
}
public class Abstraction2 
{
	public static void main(String[] args) {
		shima s= new shima();
		s.print();
		huli2 h = new huli2();
		h.disp();
	}
	
}
