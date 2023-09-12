
public class ConstructorP
{
	String name;
	int id;
	ConstructorP(String name, int id)
	{
		this.name= name;
		this.id=id;
		System.out.println(name+" "+id);
		}
public static void main(String[] args) {
	ConstructorP c=new ConstructorP("shashank",20);
}
}

