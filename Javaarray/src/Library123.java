import java.util.Comparator;
import java.util.*;
class Library
{
	int Bid;
	String Bname;
	 Library(int Bid , String Bname)
	 {
		 super();
		 this.Bid=Bid;
		 this.Bname=Bname;
	 }
	@Override
	public String toString() {
		return "Library [Bid=" + Bid + ", Bname=" + Bname + "]";
	}
}
	 
	class BidComparator implements Comparator<Library>
	{

		@Override
		public int compare(Library o1, Library o2) {
			// TODO Auto-generated method stub
			return o1.Bid-o2.Bid;
		}
		
	}

public class Library123
{
public static void main(String[] args) 
{
	Library l1=new Library(2 , "half girlfriend");
	Library l2=new Library(4 , "Who am i ");
	TreeSet<Library> s=new TreeSet<Library>(new BidComparator() );

	Collections.addAll(s ,l1,l2);

	for(Library k:s)

	{

	System.out.println(k);

	}

	}

	 

	
}
