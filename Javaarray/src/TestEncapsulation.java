class Encapsulation
{
	    private int Pid;
		private String Pname;
		public void setPid(int Pid)
		{
			this .Pid= Pid;
		}
		public void setPname(String Pname)
		{
			this.Pname=Pname;
		}
		public  int getPid()
		{
			return this.Pid;
		}
		public  String getPname()
		{
			return this.Pname;
		}
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation p = new Encapsulation ();	
		p.setPid(12);
		p.setPname("puli");
		System.out.println("product id"+p.getPid());
		System.out.println("product name"+p.getPname());


	
	}

}}
