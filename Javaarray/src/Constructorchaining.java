
public class Constructorchaining 
{
  int age;
  String name;
  Constructorchaining()
  {
	  System.out.println("cons 1");
  }
  Constructorchaining(int age)
  {
	  this();
	  this.age=age;
	  System.out.println("cons 2");
  }
  
	  Constructorchaining(int age,String name)  
	  {
		  this(30);
		  this.age=age;
		  this.name=name;
		  System.out.println("cons 3"); 
		  
	  }
	   public static void main(String[] args)
	   {
		   Constructorchaining  c1= new Constructorchaining(23,"shashank");
	}
  
}
