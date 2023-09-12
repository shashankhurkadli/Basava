
public class Anogram1
{
	public static void main(String[] args)
	{
String str1="silent";
  String str2="liisten";
  String str3="";
  char arr1[]=str1.toCharArray();
  char arr2[]=str2.toCharArray();
  
  for(int i = 0;i<arr1.length;i++)
  {
	for(int j = 0;j<arr2.length;j++)
	{
	if(arr1[i]==arr2[j])
		{
		str3=str3 + arr1[i];
		arr2[j]='0';
		
		}	
	}
  }
  if(arr1.length == str3.length()&&arr2.length == str2.length())
  {
	 System.out.println("two strings are anagram str1-->" + str1+"str-->"+str2);
  }
  else {
	
		 System.out.println("two strings are  not anagram str1-->" + str1+"str-->"+str2);

}
	}
}
