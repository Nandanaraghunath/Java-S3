import java.util.*;
class large
{
 public static void main(String args[])
   {
     int i,j,l,n;
     int [][] a= new int[10][10];
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter number of rows");
     int r=obj.nextInt();
     System.out.println("Enter number of columns");
     int c=obj.nextInt();
     System.out.println("Enter the array elements");
     for(i=0;i<c;i++)
     {
      for(j=0;j<r;j++)
        {
          a[i][j]=obj.nextInt();
        }
     }

     l=a[0][0]; 
     
     for(i=0;i<c;i++)
     {
       for(j=0;j<r;j++)
         {
           if(l<a[i][j])
           l=a[i][j];
         }
     }
    System.out.println("Largest element="+l);   
  }
}
