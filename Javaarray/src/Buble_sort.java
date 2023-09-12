import java.util.Arrays;

public class Buble_sort
{
public static void main(String[] args)
{
	int a[]= {1,2,7,4,9};
	for(int i=0; i<=a.length-1;i++)
	
	{
		for(int j=1;j<=a.length-1;j++)
		{
			if((j+1<=a.length-1)&&(a[j]>a[j+1]))
			{
				int temp= a[j];
				a[j]=a[j+1];
				a[j+1]= temp;
				
			}
		}
	
	}
	System.out.println(Arrays.toString(a));

	
}
}


