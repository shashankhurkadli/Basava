
public class Palandrom1
{
public static void main(String[] args) 
{
int r,sum=0,temp;
int n=454;

temp=n;
while(n>0)
{
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
if(temp==sum)

	System.out.println("palandrome number");
	
else
	System.out.println("not palandrome number");

}
}
