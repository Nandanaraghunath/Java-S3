class Amstrong
{
  public static void main (String args[])
    {
     int n=153;
     int temp=n;
     int r,sum=0;
     while(n>0)
        {
          r=n%10;
          sum=sum+r*r*r;
          n=n/10;
        }
      if(temp==sum)
      System.out.println("it is an amstrong number");
      else
      System.out.println("Not amstrong number");
    }
}
