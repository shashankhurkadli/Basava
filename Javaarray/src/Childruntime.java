 
class Childruntime1 
{
void display()
{
	System.out.println("am huli");
}
void show(int a)
{
	System.out.println("vinod is tiger");
	System.out.println("a value is " + a);
}
}
class Childruntime extends Childruntime1
{
void display()
{
System.out.println("lohit is karadi");	
}
void show(int a)
{
	System.out.println("keerthan wanna say something");
	System.out.println("a value is " + a);
}
public static void main(String[] args)
{
	//Childruntime c=new Childruntime();
	Childruntime c1=new Childruntime();
	c1.display();
	c1.show(10);
	
}
}
	




	


