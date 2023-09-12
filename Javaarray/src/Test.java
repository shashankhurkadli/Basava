
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Iterator;
	class Product
	{
	    int pid;
	    String pname;
	    public Product(int pid,String pname)
	    {
	        super();
	        this.pid=pid;
	        this.pname=pname;
	    }
	    @Override
	    public String toString() {
	        return "Comparable123 [pid=" + pid + ", pname=" + pname + "]";
	    }
	}
	class NameComparable implements Comparator<Product>
	{
	 
	@Override
	    public int compare(Product o1, Product o2) {
	        // TODO Auto-generated method stub
	        return o1.pname.compareTo(o2.pname);
	    }
	}
	class Idcomparator implements Comparator<Product>{
	 
	    @Override
	    public int compare(Product o1, Product o2) {
	        // TODO Auto-generated method stub
	        return o1.pid-o2.pid;
	    }
	    
	}
	public class Test {
	public static void main(String[] args) {
	    Product p1=new Product(4,"Fan");
	    Product p2=new Product(1,"Tv");
	    Product p3=new Product(8,"AC");
	    ArrayList<Product> list=new ArrayList<>();
	    Collections.addAll(list,p1,p2,p3);
	    NameComparable name=new NameComparable();
	    Idcomparator id=new Idcomparator();
	    Collections.sort(list,name);
	    Iterator i=list.listIterator();
	    while(i.hasNext())
	    {
	        System.out.println(i.next());
	    }
	    System.out.println("ID Sorter");
	    Collections.sort(list,id);
	    
	    Iterator i2=list.listIterator();
	    while(i2.hasNext())
	    {
	        System.out.println(i2.next());
	    }
	    
	    
	}
	}

