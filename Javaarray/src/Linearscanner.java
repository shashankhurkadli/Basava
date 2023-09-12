import java.util.Scanner;

public class Linearscanner 
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int i;
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter element");
		for( i=0;i<=a.length-1;i++)
		{
			//int i = 0;
			a[i]=sc.nextInt();
		}
		System.out.println("enter key to search");
		int key=sc.nextInt();
		int flag= 3;
		for ( i = 0; i < a.length; i++)
		{
			if(a[i]==key)
			{
				System.out.println("element"+key+"found at "+i+" position");
				flag=1;
				break;
				
			}
			else
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("element not found");
		}
		
		}
		
		
	}


