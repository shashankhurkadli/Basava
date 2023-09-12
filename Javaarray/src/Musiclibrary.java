import java.util.ArrayList;
import java.util.Collections;

public class Musiclibrary
{
String s1;
int option;
 
public Musiclibrary(String s1)
{
	this.s1=s1;
}


@Override
public String toString() {
	return "Musiclibrary s1 - " + s1 + "";
}


public void selectRandomOption(int i)
{
	option=i;
}

public static void main(String[] args)
{
	ArrayList<Musiclibrary >m=new ArrayList<Musiclibrary>();
	Musiclibrary m1=new Musiclibrary("psy&fly");
	Musiclibrary m2=new Musiclibrary("dreamcatcher");
	Musiclibrary m3=new Musiclibrary("company");
	Musiclibrary m4=new Musiclibrary("calm down");
	Musiclibrary m5=new Musiclibrary("tera zike");
	
	Collections.addAll(m,m1,m2,m3,m4,m5);
	
	for(Musiclibrary sa:m)
	{
		System.out.println(sa);
	}
	System.out.println("----------------");
	m.remove(m1);
	
	for(Musiclibrary s:m)
	{
		System.out.println(s);
	}
	
	System.out.println();
	m1.selectRandomOption(2);
	System.out.println("RandomOption : "+m.get(m1.option));
}
}

