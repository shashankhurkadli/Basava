import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class Comarable1 implements Comparable<Comarable1>
{
int tid;
String tname;
String tsubject;

Comarable1(int tid, String tname,String tsubject)
{
 super();
 this.tid=tid;
 this.tname=tname;
 this.tsubject=tsubject;
}

@Override
public int compareTo(Comarable1 o) {
	// TODO Auto-generated method stub
//	if(this.tid==o.tid)
//	{
//		return 0;
//	}
//	else if(this.tid>o.tid)
//	{
//		return -1;
//	}
//	return 1;
	return o.tid-this.tid;
}

@Override
public String toString() {
	return "Comarable1 [tid=" + tid + ", tname=" + tname + ", tsubject=" + tsubject + "]";
}
public static void main(String[] args)
{
	Comarable1 c1=new Comarable1(40 , "subash", "kannada");
	Comarable1 c2=new Comarable1(50 , "santosh" , "english");
	Comarable1 c3= new Comarable1(60 , "girish" , "biology");
	Comarable1 c4= new Comarable1(70 , "ajit" , "chemistry");
	 
	List<Comarable1> list= new ArrayList<>();
	Collections.addAll(list, c1,c2,c3,c4);
	Collections.sort(list);
	
	ListIterator i= list.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
		
	}
			
}
}
