import java.util.ArrayList;

public class Collection2 
{
	String type;
	int id;
	//String name;
	String brand;
   long price;
	
	public Collection2(String type,int id,String brand,long price)
	
	{
		this.id=id;
		this.type=type;
	    //this.name=name;
	    this.brand=brand;
	    this.price= price;
	}
	public void disp() {
		
		System.out.println("Collection2 [type=" + type + ", id=" + id + ", brand=" + brand + ", price=" + price + "]");
		
	}
	public static void main(String[] args) 
	{
		ArrayList<Collection2> c= new ArrayList<Collection2>();
		Collection2 c1=new Collection2("mobile",123,"Apple",68688);
		c.add(c1);
		c.add(new Collection2("TV",124,"Apple",729000));
		c.add(new Collection2("Laptop",125,"Apple",2000));
		
		
		for(int i=0;i<c.size();i++)
		{
			if(c.get(i).price>1000)
{
			c.remove(i);
}
			
		}
		for(Collection2 c1c:c)
		{
			c1c.disp();
			
		}
		//System.out.println("Product: "+c1c.type+" "+c1c.id+" "+c1c.brand+" "+c1c.price);
		}
		//System.out.println(c);
		
}



