
public class Comparetwoarray 
{
	public static void main(String[] args)
	{
		Comparetwoarray c=new Comparetwoarray();
		
		
		int n1[]= {1,2,3,4,5,7};
		int n2[]= {1,2,3,4,5,7};
	
		System.out.println(c.compare(n1,n2));
	}
	
	
	public boolean compare(int[]n1,int[]n2)
	{
		
		if(n1.length!=n2.length)
		{
			System.out.println("given array ax not equal");
			//return false;
			}
	
	for(int i=0;i<=n1.length-1;i++)
	{
		if(n1[i]!=n2[i])
		{
			System.out.println("Arrays are not equal");
			//return false;
			
		}
	}
		
	System.out.println("given arrays are equal");

	return true;

	}
}
