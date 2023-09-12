
public class StringSplitmt
{
	public static void main(String[] args)
	{
		String str1="Hello world";
		String str2[]=str1.split(" ");
		String str3=" ";
		
		for(int i=0;i<str2.length;i++)
		{
			String word=str2[i];
		for(int j=word.length()-1;j>=0;j--)	
		{
			str3+=word.charAt(j);
			
		}
		str3=str3+" ";
		}
	System.out.println(str3);
	
	}

}
