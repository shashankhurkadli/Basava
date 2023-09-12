
public class Copyconstructur2 
{
     int a,b,c;
     Copyconstructur2()
     {
    	 this.a=10;
    	 this.b=20;
    	 System.out.println((this.b)+(this.a));
     }
     Copyconstructur2 (Copyconstructur2 c)
     {
    	 this.a=c.a;
    	 this.b=c.b;
    	 this.c=this.a*this.b;
    	 System.out.println(this.c);
     }
public static void main(String[] args)
{
	Copyconstructur2 c =new Copyconstructur2 ();
	Copyconstructur2 c2=new Copyconstructur2 (c);
	
}
}
