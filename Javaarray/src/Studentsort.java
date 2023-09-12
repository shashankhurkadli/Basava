    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.ListIterator;
    
   class Collegesbr
   {
	   String collegename;
	  public  Collegesbr(String collegename)
	   {
		   this.collegename=collegename;
	   }
   }
 
    public class Studentsort extends Collegesbr implements Comparable<Studentsort>
    {    
    
        int s_id;
        String s_name;
        
        public Studentsort(String collegename , int s_id , String s_name )
        {
        	
            super(collegename);
            this.s_id=s_id;
            this.s_name=s_name;
        }
        @Override
        public int compareTo(Studentsort s) {
            // TODO Auto-generated method stub
            return this.collegename.compareTo(s.collegename);
        }
        
        
        @Override
		public String toString() {
			return "Studentsort [s_id=" + s_id + ", s_name=" + s_name + ", collegename=" + collegename +  "]";
		}
        public static void main(String[] args)
		{
            Studentsort s1=new Studentsort("SBR" , 25 , "Abhi");
            Studentsort s2=new Studentsort("sgvp" , 12 , "Balaji");
            Studentsort s3=new Studentsort("MGS" ,23 , "Shashank");
            Studentsort s4=new Studentsort(" abc" , 58, "Praveen");
            Studentsort s5=new Studentsort("XYZ", 65, "Sharan");
            Studentsort s6=new Studentsort(" BHN" , 90, "Nags");
            
            
        List<Studentsort> list=new ArrayList<Studentsort>();
        Collections.addAll(list, s1,s2,s3,s4,s5,s6);
        Collections.sort(list);
        
        ListIterator i=list.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        }
 
        
}
