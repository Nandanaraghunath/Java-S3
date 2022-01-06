import java.util.*;
class Smallest
{
 public static void main(String args[])
   {
     int i,s;
     int [] a= new int[10];
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter number of elements of array");
     int n=obj.nextInt();
     System.out.println("Enter the array elements");
     
     for(i=0;i<n;i++)
     {
     a[i]=obj.nextInt();
     }

     s=a[0]; 
     
     for(i=0;i<n;i++)
     {
     if(s>a[i])
       s=a[i];
     }
    System.out.println("Smallest element="+s);   
  }
}
