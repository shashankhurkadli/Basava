import java.util.ArrayList;
import java.util.Collections;

public class Inventory 
{
	String s1;
	
	 
	public Inventory ( String s1)
	{
		this.s1=s1;
	}
	@Override
	public String toString()
	{
		return "Inventory [s1=" + s1 +  "]";

	}
	public static void main(String[] args)
	{
		ArrayList<Inventory>m=new ArrayList<Inventory >();
		Inventory  m1=new Inventory ("mobile");
		Inventory  m2=new Inventory ("laptop");
		Inventory  m3=new Inventory ("tv");
		Inventory  m4=new Inventory (" airpod");
		Inventory  m5=new Inventory ("ipad ");
		
	m.add(m1);
	m.add(m2);
	m.add(m3);
	m.add(m4);
	m.add(m5);
	
//	for(Inventory i:m)
//	{
//		System.out.println(i);
//	}
	System.out.println(m);
	m.remove(m2);
	System.out.println(m);
	}
	
	
}
