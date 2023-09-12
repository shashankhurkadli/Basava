
public class Factorialofarray 
{
	public static void check(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			int fact=1; 
	      for(int j=2;j<=a[i];j++)
	   {
		fact=fact*j;
	   }
				System.out.println(a[i]+" factorial is " + fact);
				
			}
	}
		public static void main(String[] args)
		{
			int a[]= {1,2,3,4,5};
			check(a);
		
		}
	
	
	}
	


