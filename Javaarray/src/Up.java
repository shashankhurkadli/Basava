 class Upcasting
{
void print1()
{
	System.out.println("parent");
}
}
class Up extends Upcasting
{
	//@override
	void print()
	{
		System.out.println("child");
	}
	public static void main(String[] args)
	{
		Upcasting u = new Up();
		Up u1=(Up) u;
		u.print1();
		u1.print();
	}
}

	

