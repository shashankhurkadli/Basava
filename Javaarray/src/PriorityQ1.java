
//public class PriorityQ1 

	import java.util.*;

	 

	class Car123 

	{

	String carname;

	int price;

	String color;

	public Car123(String carname, int price, String color) {

	super();

	this.carname = carname;

	this.price = price;

	this.color = color;

	}

	@Override

	public String toString() {

	return "Car [carname=" + carname + ", price=" + price + ", color=" + color + "]";

	}

	}

	class pricecomparator implements Comparator<Car123>

	{

	 

	public int compare1(Car123 o1, Car123 o2) {

	// TODO Auto-generated method stub

	return o1.price-o2.price;

	 

	}

	@Override
	public int compare(Car123 o1, Car123 o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	}

	 

	public class PriorityQ1 {

	public static void main(String[] args) {

	// TODO Auto-generated method stub

	Car123 c=new Car123("BMW",5,"black");

	Car123 c1=new Car123("Toyota",2,"white");

	Car123 c2=new Car123("Rangerover",3,"red");

	Car123 c3=new Car123("swift",7,"gray");

	Queue<Car123> d=new PriorityQueue<Car123>(new pricecomparator());

	Collections.addAll(d,c,c1,c2,c3);

	Iterator<Car123> i=d.iterator();

	while(i.hasNext())

	{

	System.out.println(i.next());

	}
	}
	}

