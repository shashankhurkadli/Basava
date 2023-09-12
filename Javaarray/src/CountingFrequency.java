
public class CountingFrequency
{
public static void main(String[] args) 
{
	
	String str="Hello Every One Hello";
	String strarr[]=str.split(" ");
	String word="Hello";
	int count=0;
			for(int i=0;i<strarr.length;i++)
			{
				
				if (strarr[i].equals(word))
				{
					count=count+1;
				}
			}
	System.out.println(count);
}

}
