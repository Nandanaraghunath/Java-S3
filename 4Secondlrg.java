import java.util.*;
class Secondlrg
{
 public static void main(String args[])
   {
     int i,large,scndlarge;
     int [] a= new int[10];
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter number of elements of array");
     int n=obj.nextInt();
     System.out.println("Enter the array elements");
     
     for(i=0;i<n;i++)
     {
       a[i]=obj.nextInt();
     }

     large=a[0]; 
     
     for(i=0;i<n;i++)
     {
        if(large<a[i])
            large=a[i];
     }  
     
     scndlarge=a[0];
   
     for(i=0;i<n;i++)
     {   
        if(a[i]!=large && a[i]>scndlarge)
           scndlarge=a[i]; 
     }
     System.out.println("The second largest element="+scndlarge);
  }
}
