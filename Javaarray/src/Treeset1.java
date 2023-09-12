import java.util.Iterator;
import java.util.*;
public class Treeset1 
{
	public static void main(String args[]){  
		 TreeSet<String> set=new TreeSet<String>();  
		         set.add("1Ravi");  
		         set.add("5Vijay");  
		         set.add("8Ajay");  
		         System.out.println("Traversing element through Iterator in descending order");  
		         Iterator i=set.descendingIterator();  
		         while(i.hasNext())  
		         {  
		             System.out.println(i.next());  
		         }  
		           
		 }  
		}  

