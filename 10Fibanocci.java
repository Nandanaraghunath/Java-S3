class Fibanacci
{
 public static void main(String args[])
 {
  int num,f=0,s=1,sum,i,n=5;
  for(i=3;i<=n;i++)
   {
     sum=f+s;
     System.out.println(+sum);
     f=s;
     s=sum;
   }
 }
}
