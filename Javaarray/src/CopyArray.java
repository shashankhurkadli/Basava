
public class CopyArray 
{
	public static void main(String[] args) {
		{
			int[] arr1= new int[]{5,6,7,8,9};
			int[] arr2= new int[arr1.length];
			
			for(int i=0;i<arr1.length;i++)
			{
				arr2[i]=arr1[i];
				
				System.out.println("elements of original array: ");
				for(int i1=0;i1<arr1.length;i1++)
				{
					System.out.print(arr1[i1]+" ");
					
				}
				System.out.println("elements of new array: ");
				for(int i1=0;i1<arr2.length;i1++)
				{
					System.out.print(arr2[i1]+" ");
				}
			}
		}
	}

}
