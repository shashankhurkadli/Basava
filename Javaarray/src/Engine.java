 class Car

{
    String type;
    Car(String type)
    {
        this.type=type;
    }
}
class Carr
{
    String name;
    int price;
    Car e;
    Carr(Car e)
    {
        this.e=e;
        this.name="ABC";
        this.price=558555;
        this.e=e;
    }
void print()
    {
        System.out.println(name);
        System.out.println(price);
        System.out.println(e.type);
}
}
class Engine {
    public static void main(String[] args)
    {
Car e=new Car("gfd");
Carr c1=new Carr(e);
c1.print();
 
    }
}
 


