
public class Pattern 
{
	public static void main(String[] args) 

	{

	int n=5;

	for(int j=1;j<=n;j++)

	{

	for(int i=1;i<=n;i++)

	{

	if(i>=j)

	{

	System.out.print("* ");

	}

	else

	{

	System.out.print(" ");

	}

	 

	}

	System.out.println();

	}

	 

	for(int j=2;j<=n;j++)

	{

	for(int i=1;i<=n;i++)

	{

	if(i>n-j)

	 

	{

	System.out.print("* ");

	}

	else

	{

	System.out.print(" ");

	}

	 

	}

	System.out.println();

	}

	 

	}

	 

	 
}
