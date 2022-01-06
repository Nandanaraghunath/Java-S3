import java.util.*;
class Sumarray
{
public static void main(String args[])
 {
   int i, sum=0,n;
   int [] a=new int[10];
   System.out.println("Enter the number of elements of array");
   Scanner obj= new Scanner(System.in);
   n=obj.nextInt();
   System.out.println("Enter the array elements");
  
   for(i=0;i<n;i++)
   {
     a[i]=obj.nextInt();
     sum=sum+a[i];
   }   

   System.out.println("Sum="+sum);
 }
}
   
