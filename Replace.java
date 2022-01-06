import java.util.*;
class Replace
{
 public static void main(String args[])
   {
     int i,n,r,p;
     int [] a= new int[10];
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter number of elements of array");
     n=obj.nextInt();
     System.out.println("Enter the array elements");
     
     for(i=0;i<n;i++)
     {
     a[i]=obj.nextInt();
     }
     
     System.out.println("Enter the number which is to be replaced");
     r=obj.nextInt();  
     for(i=0;i<n;i++)
       {
         if(r==a[i])
           {
             System.out.println("Enter the new number");
             p=obj.nextInt();
             a[i]=p;
           }       
       }
     System.out.println("New array");
      for(i=0;i<n;i++)
     {
       System.out.println(""+a[i]);
     }     
   }
}
