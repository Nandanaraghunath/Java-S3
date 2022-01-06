import java.util.*;
class Transpose
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

     System.out.println("Enter the elements of array");
      for(i=0;i<n;i++)
       {
        for(j=0;j<m;j++)
          a[i][j]=obj.nextInt();
       }

      System.out.println("The transpose of the matrix is");
      for(i=0;i<n;i++)
       {
         for(j=0;j<m;j++)
            b[j][i]=a[i][j];
       }

    for(i=0;i<n;i++)
     {
       for(j=0;j<m;j++)
        System.out.println("\t"+b[i][j]);
     }
   }
}
