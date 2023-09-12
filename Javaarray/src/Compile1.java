
public class Compile1
{
	int age;
	String name;
	void print()
	{
		System.out.println();
	}
	void print(int age) 
	{
		System.out.println("age  " + age);
	}
	void print(String name)
	{
		System.out.println("name  " + name);
	}
	void print(int age,String name)
	{
		System.out.println("age  " + age+ " name "+ name);
	}
	public static void main(String[] args) 
	{
		Compile1 c= new Compile1();
		c.print(20);
		c.print("sani");
		c.print(20 , "sani");
	}
}	




