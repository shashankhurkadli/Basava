import java.util.*;
public class ATM2 

 

{

 
static int balance=500,pin;

 

int passWord;

 

String userId;

 

ATM2(int passWord,String userId)

 

{

 

if((userId.equals("deep")) && passWord==1234)

 

{

 

validation(passWord,userId);

 

}

 

else

 

{

 

System.out.println("Please enter valid ATM card");

 

System.out.println("Thank you");

 

}

 

}

 

void validation(int passWord,String userId)

 

{

 

String atmStatus;

 

System.out.println("Are you new user? yes or no");

 

Scanner sc =new Scanner(System.in);

 

atmStatus=sc.next();

 

if(atmStatus.equals("no")) 

 

{

 

System.out.println("Enter pin"); 

 

pin =sc.nextInt();

 

if(pin==1234)

 

{

 

banking(pin,userId,passWord);

 

} 

 

}

 

else if(atmStatus.equals("yes")) 

 

{

 

System.out.println("Give new pin");

 

pin=sc.nextInt();

 

System.out.println("Successfully generated new pin");

 

System.out.println("Do you want to continue banking yes or no");

 

 

 

if(sc.next().equals("yes"))

 

{

 

banking(pin,userId,passWord);

 

}

 

if(sc.next().equals("no"))

 

{

 

System.out.println("Thank you");

 

}

 

else

 

{

 

System.out.println("Wrong entry");

 

}

 

} 

 

}

 

void banking(int pin,String userId,int PassWord)

 

{

 

System.out.println("----------------------------------");

 

System.out.println("Select banking options Deposit Withdrow Balance view");

 

Scanner sc =new Scanner(System.in);

 

String option=sc.next();

 

switch(option)

 

{

 

case "deposit":deposit(pin,userId,passWord);

 

break;

 

case "withdrow":withdrow(pin,userId,passWord);

 

break;

 

case "balance view":balanceview(pin,userId,passWord);

 

break;

 

default: System.out.println("Wrong entry");

 

} 

 

}

 

void deposit(int pin,String userId,int PassWord)

 

{

 

System.out.println("----------------------------------");

 

System.out.println("Enter deposit amount"); 

 

Scanner sc =new Scanner(System.in);

 

int ATM2=sc.nextInt();

 

balance=balance+ATM2;

 

System.out.println("After deposit balance is "+balance);

 

System.out.println("Do you want to continue banking yes or no"); 

 

if(sc.next().equals("yes"))

 

{

 

banking(pin,userId,passWord);

 

}

 

if(sc.next().equals("no"))

 

{

 

System.out.println("Thank you");

 

}

 

else

 

{

 

System.out.println("Thank you finished");

 

} 

 

}

 

void withdrow(int pin,String userId,int PassWord)

 

{

 

System.out.println("----------------------------------");

 

System.out.println("Enter withdrow amount");

 

 

 

Scanner sc =new Scanner(System.in);

 

int ATM2=sc.nextInt();

 

if(balance>=ATM2)

 

{

 

balance=balance-ATM2;

 

 

 

System.out.println("After withdrow balance is "+balance);

 

}

 

else

 

{

 

System.out.println(" ");

 

System.out.println("do u want to continue banking?");

 

String temp=sc.next();

 

if(temp=="yes")

 

{

 

banking(pin,userId,passWord);

 

}

 

else

 

{

 

System.out.println("Finished");

 

 

 

} 

 

} 

 

}

 

void balanceview(int pin,String userId,int PassWord)

 

{

 

System.out.println("----------------------------------");

 

System.out.println("Your balance is"+balance);

 

System.out.println("Do you want to continue banking yes or no");

 

Scanner sc =new Scanner(System.in);

 

if(sc.next().equals("yes"))

 

{

 

banking(pin,userId,passWord);

 

}

 

if(sc.next().equals("no"))

 

{

 

System.out.println("Thank you");

 

}

 

else

 

{

 

System.out.println("Thank you finished");

 

} 

 

}

 

 

 

public static void main(String[] args) 

 

{

 

System.out.println("Enter user name "); 

 

Scanner sc =new Scanner(System.in);

 

String userId=sc.next();

 

System.out.println("Enter user Password"); 

 

int Password=sc.nextInt();

 

ATM2 atmObj= new ATM2(Password,userId);

 

 

 

}

 

 

 

}
