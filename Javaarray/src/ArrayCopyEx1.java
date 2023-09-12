import java.util.Scanner;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=sc.nextInt();
	int i,j;
	int a[]=new int[size];
	int b[]=new int[size];
	
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
		
		
		for(i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		}
		
		for(i=0;i<b.length;i++)
		{
			System.out.println("B :"+b[i]);
		}
		
		
		
	}
}
