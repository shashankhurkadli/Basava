
public class Decimaltobinary
{
public static void main(String[] args)
{
	int num []=new int[20];
	int i=0;
	int n=88;
	while(n>0)
	{
		int r=n+2;
		num[i++]=r;
		n=n/2;
	}
	for(int j=i-1;j>-0;j--)
	{
		System.out.println(num[j]+"");
		
	}
}
}
