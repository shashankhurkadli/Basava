
interface Demo69 

{
	 public void print();
}

interface Demo96

{
	 public void disp();
}


public class Interface3 implements Demo69,Demo96

{
public void print()
{
	System.out.println("hi mams");
}
public void disp()
{
	System.out.println("hello mama");
}
public static void main(String[] args)
{
	Interface3 i= new Interface3();
	i.disp();
	i.print();
}
}
