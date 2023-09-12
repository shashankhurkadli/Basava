import java.util.*;
public class Character1234 
{
	
		 public static void main(String[] args) 
		 {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string : ");
		        String entry = scanner.nextLine();
		        char s[]=entry.toCharArray();
		        
		        int upper = 0;
		        int lower = 0;
		        int digit = 0;
		        int other = 0;
		        int space = 0;
		        
		        for(int i=0;i<s.length;i++)
		   	    {
		   		 if(s[i]>='A' && s[i]<='Z')
		              {
		   			   upper++;
		              }
		   		 else if(s[i]>='a' && s[i]<='z')
		            {
		   	         lower++;
		            }
		   		else if(s[i]>='0' && s[i]<='9')
	            {
	   	         digit++;
	            }
		   		else if(s[i]>=' ')
	            {
	   	         space++;
	            }
		   		else
		   		{
		   			other++;
		   		}
		   		}
		        System.out.println("the upper case characters are = "+upper);
		        System.out.println("the lower case characters = "+lower);
		        System.out.println("the count of digits = "+digit);
		        System.out.println("the count of other characters are = "+other);
		        System.out.println("the count of blank spaces is = "+space);
		   	
		        scanner.close(); 
		 }
	}

