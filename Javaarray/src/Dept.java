
class Dept
	{
	int Empid= 120;
	}
	class Employee extends Dept
	{
	String Empname = "ABC";
	void display()
	{
	    System.out.println("Empid="+ super.Empid);
	    System.out.println("Empname="+Empname);
	}
	}
	class Super_variable
	{
	    public static void main(String[] args)
	 
	{
	        Employee e1= new Employee();
	        e1.display();
	}
	}


