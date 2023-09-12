import java.util.*;
public class Amstrong 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ArmStrong Number");
        int num =sc.nextInt();
        int count=0,rem,arm=0;
        int num1=num;
        int temp=num;
        int rem1;

        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }

        while(num!=0)
        {
            rem=num%10;
            rem1=rem;
            int i=1;
            while(i<count)
            {
                rem=rem*rem1;
                i++;
            }
            arm=arm+rem;
            num=num/10;
        }
        if(num1==arm)
        {
            System.out.println(arm+ " Number is a ArmStrong Number");
        }
        else
        {
            System.out.println(arm+"Number is not ArmStrong Number");
        }
    }
}
 /*  while(num!=0)
        {
            rem=num%10;
            arm= (int) (arm+Math.pow(rem,count));
            num=num/10;
        }*/
//System.out.println(arm);


