public class CopyConstructor2
{
	int eid;
	String name;
	CopyConstructor2(int eid,String name)
	{
		System.out.println(this.eid=eid);
		System.out.println(this.name=name);
	}
	CopyConstructor2(CopyConstructor2 e1)
	{
		eid=e1.eid;
		name=e1.name;
	}
		public static void main(String[] args) 
		{
			CopyConstructor2 e1=new CopyConstructor2(24,"abc");
			CopyConstructor2 e2=new CopyConstructor2(e1);
			
		}
	

}
