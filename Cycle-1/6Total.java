import java.util.*;
class Total
{
 public static void main(String args[])
 {
  int i,sum=0,n;
  System.out.println("To find the sum of n natural numbers,enter the value of n");
  Scanner obj=new Scanner(System.in);
  n=obj.nextInt();
  for(i=0;i<=n;i++)
  sum=sum+i;
  System.out.println("Sum of first n natural number="+sum);
 }
}
  
