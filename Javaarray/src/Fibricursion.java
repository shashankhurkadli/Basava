
public class Fibricursion 
{
	public static int Fibricursion (int count)
	{
		if (count==0)
		{
		return 0;
	
		}
		
		if (count==1||count==2)
		{
		return 1;
	    }
	 return Fibricursion(count - 1)+Fibricursion(count - 2);
	}
public static void main(String[] args)
{
	int fib_len=9;
	
	System.out.println("Fibonacci Series of " + fib_len + " numbers is: \n");
	
	for(int i=0;i<fib_len;i++)
	{
		System.out.print(Fibricursion(i)+" ");
		
		}
		

	
}
}
	
		
		
	


