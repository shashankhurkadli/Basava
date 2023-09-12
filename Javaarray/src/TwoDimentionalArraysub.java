
public class TwoDimentionalArraysub 
	
	{
		public static void main(String[] args)
		{
			int row=2,colum=2;
			int a[][]= {{1,2},{3,4}};
			int b[][]= {{1,2},{3,4}};
	        int sum[][]=new int[row][colum];
	        
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<colum;j++)
					{
					sum[i][j]=a[i][j]-b[i][j];
						System.out.print(sum[i][j]+" ");
					}
				System.out.println();
					
			}
		}
		

	}


