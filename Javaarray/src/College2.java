
public class College2 implements Comparable<College2>
{
int c_id;
String c_name;

College2(int c_id , String c_name)
{
	this.c_id=c_id;
	this.c_name=c_name;
}
}
class Student extends College2
{
	int s_id;
	String s_name;
	Student(int s_id , String s_name)
	{
		
	}
	@Override
	public int compareTo(College2 c) {
		// TODO Auto-generated method stub
		return this.c_name.compareTo(c.c_name);
	}

}
