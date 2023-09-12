public class CopyConstructor
{
	int eid;
	String name;
	CopyConstructor(int eid,String name)
	{
		System.out.println(this.eid=eid);
		System.out.println(this.name=name);
		
	}
	CopyConstructor(CopyConstructor e1)
	{
		eid=e1.eid;
		name=e1.name;
	}
		public static void main(String[] args) 
		{
			
			CopyConstructor e1=new CopyConstructor(24,"abc");
			CopyConstructor e2=new CopyConstructor(e1);
			
		}
	

}
