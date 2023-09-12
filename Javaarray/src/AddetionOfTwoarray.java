import java.util.*;
public class AddetionOfTwoarray 
{
	

		public static void main(String[] args) {

		int i,j,k = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of a Array :");

		int size = sc.nextInt();

		int a[] = new int[size];

		int b[] = new int[size];

		int c[] = new int[size];

		System.out.println("Enter the Elements of I");

		for(i=0;i<a.length;i++)

		{

		a[i]=sc.nextInt();

		}

		System.out.println("Enter the Elements of J");

		for(j=0;j<b.length;j++)

		{

		b[j]=sc.nextInt();

		}

		j=0;

		for(i=0;i<a.length;i++)

		{

		c[k]=a[i]+b[j];

		j++;

		k++;

		/* if(j>size-1)

		{

		break;

		}*/

		}

		System.out.println("The Addition of Two Array is :");

		for(k=0;k<c.length;k++)

		{

		System.out.println(c[k]);

		}

		}

		}

		

