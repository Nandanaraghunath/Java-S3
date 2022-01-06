class Sum
{
public static void main (String args[])
  {
    int n,d,sum=0;
    n=198;
    while(n>0)
       {
         d=n%10;
         sum=sum+d;
         n=n/10;
       }
    System.out.println("Result = "+sum);
  }
}
