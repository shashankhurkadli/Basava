import java.util.*;
public class Queue1 
{
public static void main(String[] args)
{
	Deque f =new LinkedList<>();
	f.add("nags");
	f.add("abhi");
	f.add("abhi");
	f.add("balaji");
	f.add("sandesh");
	//f.remove("abhi");
	f.pollLast();
	f.offerFirst("nishant puli");
	//f.element();
	
	System.out.println();
	
}
}
