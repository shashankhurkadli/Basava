
public class ConvertingUp 
{
	public static void main(String[] args)
	{
		char ch='A';
		int c=(int)ch;
		if(c>=5&&c<=90)
		{
			c=c+32;
			ch=(char)c;
		System.out.println(ch);
		}
		else if (c>=97&&c<=122)
		{
			c=c-32;
			ch=(char)c;
			System.out.println(ch);
		}
	}

}
