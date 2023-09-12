
public class Recursion1 
{
static int fact(int a)
{
	if(a>=1)
	{
	return a*fact(a-1);
	
	}
	return 1;
	
}
public static void main(String[] args)
{
int num=5;
int fact=fact(num);
System.out.println("factorial number "+fact);
}
}
