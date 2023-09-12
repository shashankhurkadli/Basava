class Customer
		{
	       private String accountNumber;
		    private double balance;
		 
		    public Customer(String accountNumber, double balance) 
		    {
		        this.setAccountNumber(accountNumber);
		        this.balance = balance;
		    }
		 
		    public void deposit(double amount)
		    {
		        balance += amount;
		    }
		 
		    public void withdraw(double amount) 
		    {
		        if (balance >= amount)
		        {
		            balance -= amount;
		        } else
		        {
		            System.out.println("Insufficient balance");
		        }
		    }
		 
		    public double getBalance()   
		    {
		        return balance;
		    }
		 
		    public String getAccountNumber()
		    {
		        return accountNumber;
		    }
		 
		    public void setAccountNumber(String accountNumber)
		    {
		        this.accountNumber = accountNumber;
		    }
	
		}


