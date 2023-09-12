
public class ConvertingChar 
{
	public static void main(String[] args)
	{
		String str="JAVA";
		char s[]=str.toCharArray();
		for(int i=0;i< s.length;i++)
		{
			if(s[i]>='A'&&s[i]<='Z')
				s[i]=(char)((int)s[i]+32);
			
		}
		
	
	for(int i=0;i< s.length;i++)
	{
	System.out.println(s[i]);	
	}

	}
}
