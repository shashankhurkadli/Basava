public class Exceptionhandling 
{
	public static void main(String[] args) 
	{
	int arr[]=new int[5];
	System.out.println("Starting");
	System.out.println("Array value "+arr[3]);
	System.out.println("ending");
	

	try {
		System.out.println("Array value "+arr[3]);
	}
	catch(Exception e)
	{
e.printStackTrace();
	}
}
	

}
