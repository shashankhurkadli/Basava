
public class ConstructorOrld 
{ 
	int age ;
	String name;
	ConstructorOrld()
	{
		this.age=30;
		this.name="abc";
	}
	ConstructorOrld(int age)
	{
		this.age=age;
	}
	ConstructorOrld(int age , String name)
	{
		this.age=age;
		this.name=name;
		
	}
public static void main(String[] args)
{
	ConstructorOrld c1=new ConstructorOrld();
	System.out.println(c1.age+" "+c1.name);
	ConstructorOrld c2=new ConstructorOrld(40);
	System.out.println(c2.age);
	ConstructorOrld c3=new ConstructorOrld(23,"shahsank");
	System.out.println(c3.age+" "+c3.name);
}
}
