import java.util.*;

	public class Accounting1 
	{
		static int balance = 100000;
		public static  void Deposite() 
		 {
			 Scanner sc = new Scanner(System.in);
		     System.out.print("Enter the deposite amount : ");
		     int deposite = sc.nextInt();
			 if (deposite > 0) 
		        {
		            balance = balance + deposite;
		            System.out.println(deposite + " deposite successfully.");
		            Balance();
		        } 
			 else 
			 {
		            System.out.println(" unsuccessfull");
		            Balance();
		     }
			 sc.close();
		 }   
		 
		public static void Withdraw() 
		{
			 Scanner sc = new Scanner(System.in);
		     System.out.print("Enter the deposite amount : ");
		     int withdraw = sc.nextInt();
		     if (withdraw > 0 && withdraw <= balance) 
		     {
		            balance = balance-withdraw;
		            System.out.println(withdraw + " withdrawn successfully");
		            Balance();
		     } 
		     else 
		     {
		    	 
		            System.out.println(" withdrawal unsuccessfull");
		            Balance();
		     }
		     sc.close();
		}
		     public static void Balance()
		     {
		    	 System.out.println("Current Balance: " + balance); 
		     }

		public static void main(String[] args) 
		    {     
			 Scanner sc = new Scanner(System.in);
		     System.out.print("   PRESS   \n 1 for deposite\n 2 for withdrawal\n 3 for balance");
		     int option = sc.nextInt();	
		     if(option == 1)
		     {
		    	 Deposite();
		     }
		     else if(option == 2)
		     {
		    	 Withdraw();
		     }
		     else
		     {
		    	 Balance();
		     }
		     sc.close();
		}	
	}


