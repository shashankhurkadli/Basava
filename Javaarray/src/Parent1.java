
class Parent3
{
int Page;
String pname;
public int page;
void print() 
{
    System.out.println("I am parent");
}

}

class Parent1 extends Parent3
{
String cname;
String adress;
int cage;

public static void main(String[] args) 
{
    
    Parent3 p = new Parent3();
    p.page=85;
    p.pname="loh";
    Parent1 p1=new Parent1();
    p1.cname="vin";
    p1.adress="Bang";
    p1.cage=26;
    p1.print();
    
System.out.println(p.page);
System.out.println(p.pname);
System.out.println(p1.cname);
System.out.println(p1.cage);
System.out.println(p1.adress);
    
}

}



