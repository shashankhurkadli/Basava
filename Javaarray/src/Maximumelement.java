
public class Maximumelement 
{
	public static void main(String[] args)
	{
		int a[]= {5,7,8,1,3};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min =a[i];
			
			}
		}
	System.out.println("minimum element"+min);			
		
	
	}

}
