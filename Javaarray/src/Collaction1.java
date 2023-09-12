
import java.util.ArrayList;


public class Collaction1 
{
	int id;
	String name;
	Collaction1 (int id ,String name)
	{
	    this.id=id;
	    this.name=name;
	}
	public static void main(String[] args) {
	    ArrayList<Collaction1 > l1=new ArrayList<>();
	    Collaction1  e1=new Collaction1 (1,"shashank");
	    Collaction1  e2=new Collaction1 (2,"nishant");
	    l1.add(e1);
	    l1.add(e2);
	    System.out.println(l1);
	 
	for(Collaction1  emp:l1)
	{
	System.out.println(emp.id+" "+emp.name);    
	}
}
}
