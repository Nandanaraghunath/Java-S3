import java.util.*;
class Numbers
{
 public static void main(String args[])
   {
     int num,n,sum=0;
     System.out.println("Enter the a number");
     Scanner obj=new Scanner(System.in);
     num=obj.nextInt();
     while(num>0)
     {
     n=num%10;
     sum=sum+n;
     num=num/10;
     }
     System.out.println("Sum of digits of a number is:"+sum);
    }
}
