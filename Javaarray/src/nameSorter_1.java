import java.util.Collections;
import java.util.Comparator;

public class nameSorter_1 implements Comparator<Employee>

{

 

@Override

public int compare(Employee o1, Employee o2) {

 

return o1.name.compareTo(o2.name);

} 

 

}

class idSorter_1 implements Comparator<Employee>

{

 

@Override

public int compare(Employee o1, Employee o2) 

{

 

return o1.id-o2.id;

}

 

}

public class Employee 

{

Integer id;

String name;

String company_Name;

static int ie;

final static int ir=0;

Employee(Integer id,String name,String company_Name) 

{

this.id=id;

this.name=name;

this.company_Name=company_Name;

}

 

// void disp()

// {

// System.out.println("\nid :"+id+"\nname : "+name+"\ncompany_Name : "+company_Name);

// }

 

 

//public Integer getId() {

// return id;

// }

//

// public void setId(Integer id) {

// this.id = id;

// }

//

// public String getName() {

// return name;

// }

//

// public void setName(String name) {

// this.name = name;

// }

//

// public String getCompany_Name() {

// return company_Name;

// }

//

// public void setCompany_Name(String company_Name) {

// this.company_Name = company_Name;

// }

 

public String toString()

{

return "\nEmployee -id="+id+",name="+name+" "; 

 

}

 

 

public static void main(String[] args) 

{

Employee e1 = new Employee(201,"Abhishek","Eizitech"); 

Employee e2 = new Employee(202,"Praveen","HGS");

Employee e3 = new Employee(200,"Aryan","HGS");

nameSorter_1 n1= new nameSorter_1();

idSorter_1 i= new idSorter_1 ();

ArrayList<Employee> l = new ArrayList<Employee>();

 

l.add(e1);

l.add(e2);

l.add(e3);

Collections.sort(l,i);

// Collections.sort(l,n1);

//Comparator.comparing(Employee::getName); 

//Collections.sort(l,Comparator.comparing(Employee::getName)); 

System.out.println(l);

 

//System.out.println(l);

// for(Employee e : l)

// {

// System.out.println("\nid : "+e.id+"\nname : "+e.name+"\ncompany_Name : "+e.company_Name);

// }

 

// for(Employee e : l)

// {

// e.disp();

// }

// System.out.println(l);

// 

// System.out.println(l.get(0));

 

// Iterator i = l.iterator();

// while(i.hasNext())

// {

// System.out.println(i.next());

// }

 

}
}

 



 




