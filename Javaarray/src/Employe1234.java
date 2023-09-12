
        class Emp
		{
	    private int id;
	    private String name;
	    private String designation;
	    private int salary;
	    private int pf;
	    private int allowance;

	   
	    public Emp() {
	        this.id = 0;
	        this.name = "";
	        this.designation = "";
	        this.salary = 0;
	        this.pf = 0;
	        this.allowance = 0;
	    }

	    
	    public Emp(int id, String name, int salary) {
	        this(); 
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }


	    private void calculate() {
	        pf = (int) (salary * 0.12);
	        allowance = (int) (salary * 0.15);
	    }

	 
	    public int calculateTotalSalary() {
	        calculate(); 
	        int total = salary + pf + allowance;
	        return total;
	    }


	    public void display() {
	        System.out.println("Employee details:");
	        System.out.println("[ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Total Salary: " + calculateTotalSalary() + "]");
	    }
	}

	public class Employe1234
	 {
	    public static void main(String[] args) {
	        Emp e1 = new Emp(1, "NISHANT", 27000);
	        e1.display();

	        Emp e2 = new Emp(2, "SANGAN", 40000);
	        e2.display();
	        
	        Emp e3 = new Emp(3, "AKSHAY", 38000);
	        e3.display();
	    }
	}


