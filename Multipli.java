import java.util.*;
class Multipli
{
  public static void main(String args[])
  {
    int i,j;
    Scanner obj=new Scanner(System.in);
    
    System.out.println("Enter number of rows of array");
    int n=obj.nextInt();
    System.out.println("Enter number of columns of array");
    int m=obj.nextInt();
    
    int a[][]=new int[20][20]; 
    int b[][]=new int[20][20];  
    int c[][]=new int[20][20]; 

    System.out.println("Enter the elements of array");
      for(i=0;i<n;i++)
        for(j=0;j<m;j++)
          a[i][j]=obj.nextInt();
    
    System.out.println("Enter number of rows of array 2");
    int x=obj.nextInt();
    System.out.println("Enter number of columns of array 2");
    int y=obj.nextInt();
    
    System.out.println("Enter elements of array");
      for(i=0;i<x;i++)
        for(j=0;j<y;j++)
          b[i][j]=obj.nextInt();
   
    if(n==x)
       {
         for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              c[i][j]=a[i][j]*b[i][j];
              System.out.println("\t"+c[i][j]);
            }
        System.out.println("The above matrix is the resultant matrix");
       }
   else
   System.out.println("Multiplication not possible");
  }

}
