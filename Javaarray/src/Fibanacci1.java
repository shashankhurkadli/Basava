
public class Fibanacci1 
{
public static void main(String[] args)
{
int a1=0;
int a2=1;
int a3=0;
 
for(int i=0;i<=20;i++)
{
	a3=a1+a2;
	a1=a2;
	a2=a3;
	System.out.println(a1);
}
}
}
