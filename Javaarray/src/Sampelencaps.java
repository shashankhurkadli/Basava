class  Sampelencaps
{
	private int age;
	private int salary;
	
	public void setage(int age)
	{
	this.age=age;	
	}
	public int getage()
	{
		return age;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getsalary()
	{
		return salary;
	}
	public static void main(String[] args) 
	{
		 Sampelencaps s= new  Sampelencaps();
		 s.setage(23);
		 s.setsalary(50000);
		System.out.println(s.getage());
		System.out.println(s.getsalary());
	}
}



 


