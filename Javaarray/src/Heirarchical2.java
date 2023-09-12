class Laptop
{
String Processor1;
String Processor2;
String RAM1;
String RAM2;
String HDD;
	

	Laptop (String Processor1,String Processor2,String RAM1,String RAM2,String HDD)
{
this.Processor1=Processor1;
this.Processor2=Processor2;
this.RAM1=RAM1;
this.RAM2=RAM2;
this.HDD=HDD;
}

void print()

{

System.out.println("Features of Laptop ->"+this.Processor1+"-> "+this.Processor2+"-> "+this.RAM1+"-> "+this.RAM2+"-> "+this.HDD);

System.out.println();

}

Laptop()

{

this("i5","i8","8gb","4gb","1tb");

}

}

class Dell4 extends Laptop{

String Model;

int Price;

 

Dell4(String Model,int Price)

{

this.Model=Model;

this.Price=Price;

}

 

void print()

{

System.out.println("Dell -> "+Model+" "+Price+" "+Processor1+" "+RAM1+" "+HDD);

}
}
class Lenevo extends Laptop
{

String Model;

int Price;

 

Lenevo(String Model,int Price)

{

this.Model=Model;

this.Price=Price;

}

 

void print()

{

System.out.println("Lenevo -> "+Model+" "+Price+" "+Processor2+" "+RAM2+" "+HDD);

}

 

 

}

 
 class Heirarchical2 {

 

public static void main(String[] args) {

// TODO Auto-generated method stub
	Laptop l1=new Laptop();

l1.print();

Dell4 d1=new Dell4("inspiron",40000);

Lenevo l2=new Lenevo("lenevo33",30000);

d1.print();

l2.print();
}
}



 




