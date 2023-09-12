
class Practice
{
	int a,b,c;
	
	


	Practice()
	{
		this.a=10;
		this.b=20;
		this.c=30;
		System.out.println(a+b+c);
	}
	

	Practice(int a)
	{
		this.a=a;
	
		System.out.println(this.a);
	} 
	
	Practice(Practice  p)
	{
		this.a=p.a;  
		b=p.b; 
		c=p.c;
		System.out.println(a*b*c);
	}
}



	public class Demo extends Practice
	{
		Demo()
		{
			super();
		}
		Demo(Demo d)
		{
			super(d);
		}
		Demo(int a)
		{
			super(10);
			System.out.println(a);
		}
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Demo d2 = new Demo(d);
		Demo d3 = new Demo(10);
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}

}