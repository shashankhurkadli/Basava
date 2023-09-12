import java.util.TreeMap;
import java.util.*;
import java.util.Map.Entry;
public class Treemap1
{
public static void main(String[] args) 
{
TreeMap<String , Integer> h= new TreeMap<>();
h.put(" sangan  OWNER", 1 );
h.put(" Shashank", 30);
h.put(" nishant", 90);
h.put(" sourab", 180);
h.put(" akshay", 60);
h.put(" aditya", 360);

System.out.println("ivattina mesurements");
System.out.println(h);

for(Entry y:h . entrySet()) 
{
System.out.println(y.getKey()+ " "+y.getValue());
}
}
}
