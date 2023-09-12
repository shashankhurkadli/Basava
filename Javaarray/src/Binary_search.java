
public class Binary_search
{
	public static void main(String [] args)
	{
		int a[] = {20,30,40,50,60,70,};
		int low =0;
		int high=a.length-1;
	    int key=60;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]<key)
			{
				low=low+1;
			}
			else if(a[mid]==key)
			{
				System.out.println("element found");
				break;
			}
			else if(a[mid]>key)
			{
				high=high-1;
			
			}
			//mid=(low+high)/2;
			if(low>high)
			{
				System.out.println("element not found");
					
		    }
			}
		}
				
				
		      
	

	}


