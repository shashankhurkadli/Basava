
public class EmployChainning 
{
	int epage;				
    String epname;
    long epsalary;
    String compname;
    EmployChainning()
{
	  System.out.println("cons 1");
}
     EmployChainning(int epage)
{
	  this();
	  this.epage=epage;
	  System.out.println("cons 2");
}

    EmployChainning(int epage,String epname)  
	  {
		  this(30);
		  this.epage=epage;
		  this.epname=epname;
		  System.out.println("cons 3"); 
		  
	  }
    EmployChainning(int epage,String epname,long epsalary)  
	  {
		  this(30,"shashank");
		  this.epage=epage;
		  this.epname=epname;
		  this.epsalary=epsalary;
		  System.out.println("cons 4"); 
	  }
    EmployChainning(int epage,String epname,long epsalary,String compname)  
	  {
		  this(30,"shashank",5000000);
		  this.epage=epage;
		  this.epname=epname;
		  this.epsalary=epsalary;
		  this.compname=compname;
		  System.out.println("cons 5"); 
	  }
	   public static void main(String[] args)
	   {
		   EmployChainning c1= new EmployChainning(23,"shashank",5000000,"apple");
	}

}



