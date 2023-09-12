import java.util.*;
 class Treemap 
{
	 private String name;
     private int age;

     public Treemap(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         // TODO Auto-generated method stub
         return name;
     }

     public int getAge() {
         // TODO Auto-generated method stub
         return age;
     }

     @Override
     public String toString() {
         return "Mappp112 [name=" + name + ", age=" + age + "]";
     }
     

public class Treemap2 {
 public static void main(String[] args) {
     HashMap<Integer,Treemap> hash = new HashMap<Integer, Treemap>();
     hash.put(1, new Treemap("a", 25));
     hash.put(2, new Treemap("b", 30));
     hash.put(3, new Treemap("c", 22));
     hash.put(4, new Treemap("d", 27));
     hash.put(5, new Treemap("e", 29));

     System.out.println(hash);

     for (Map.Entry<Integer, Treemap> entry : hash.entrySet()) {
         int key = entry.getKey();
         Treemap obj = entry.getValue();
         System.out.println(key + " " + obj.getName() + " " + obj.getAge());
     }
 }
}
} 