	import java.util.Scanner;

	public class IncomeTax 
	{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the annual income: ");
	        double income = scanner.nextDouble();

	        double incomeTax = calculateIncomeTax(income);
	        System.out.println("Income tax to be paid is: " + incomeTax);
	    }

	    public static double calculateIncomeTax(double income) {
	        double tax = 0;

	        if (income <= 100000) {
	           
	        } else if (income <= 160000) {
	            tax = (income - 50000) * 0.10;
	        } else if (income <= 150000) {
	            tax = 10000 + (income - 60000) * 0.20;
	        } else {
	            tax = 10000 + 18000 + (income - 150000) * 0.30;
	        }

	        return tax;
	    }
	}


