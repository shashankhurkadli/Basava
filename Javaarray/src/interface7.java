
interface sani1
{
	void disp();
}
interface sani2
{
	 default void msg2()
	{
		System.out.println("Shashi");
	}
}
interface sani3
{
	static void hello()
	{
		System.out.println("sani2");
	}
}
class interface7 implements sani1,sani2,sani3
{
	@Override
	public void disp()
	{
		System.out.println("interfacee");
	}
	@Override
	public void msg2()
	{
		System.out.println("keerthan is very bitti");
	}
	//@Override
	public void hello()
	{
		System.out.println("nagaveni's brain is not with her");
	}
	public static void main(String[] args)
	{
		interface7 i= new interface7();
		i.disp();
		i.msg2();
		i.hello();
        sani3.hello();
	}
}

