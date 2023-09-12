
 class Association3
{
	String city;
	String state;
	String country;
	int pincode;
	public Association3(String city, String state, String country, int pincode)
	{
	this.city=city;
	this.state=state;
	this.country=country;
	this.pincode=pincode;
	}

}
class Association2
{
	String name;
	String company;
	Association3  add;
	public Association2(String name, String company, Association3 add)
	{
	
		this.name=name;
		this.company=company;
		this.add=add;
	}
	void display()
	{
		System.out.println("name "+name);
		System.out.println("company "+company);
		System.out.println("address");
		System.out.println("city "+add.city);
		System.out.println("state "+add.state);
		System.out.println("country "+add.country);
		System.out.println("pincode "+add.pincode);
		
	}
	
}
class Association1
{
public static void main(String[] args) 
{
	Association3 a=new Association3("Bangalore","karnataka","india",584122);
	Association2 a2=new Association2("shashank","eizitech",a);
	a2.display();
	
}	
}