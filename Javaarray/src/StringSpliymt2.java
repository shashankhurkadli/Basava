
public class StringSpliymt2
{
	public static void main(String[] args)
	{
		String s1="Hello world";
		String s2="";
		String s3="";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)!=' ')
			{
				s2=s1.charAt(i)+s2;
			}
			if(s1.charAt(i)==' ')
			{
				s3=s2+s3;
				s2="";
				
			}
			
		}
		System.out.println(s3+" "+s2);
	}
		
	}

