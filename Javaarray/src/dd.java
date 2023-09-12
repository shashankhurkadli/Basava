public class dd 
{
	public static void main(String[] args) throws Exception
	{
		int age=43;
		int a[] = new int[2];
		
//		try 
//		{
//			a[3]=87;
//		}
//		catch(StringIndexOutOfBoundsException e2)
//
//		{
//			System.out.println("dd");
//		}
//		finally 
//		{
//			System.out.println("Exeption handled");
//		}
		
		if(age<50)
		{
			throw new Exception("Young");
		}
		else 
		{
			System.out.println("old");
		}
	}

}
