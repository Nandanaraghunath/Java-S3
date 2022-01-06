class Factor
{
 public static void main(String args[])
 {
  int num=10,i,Fac;
  System.out.println("Factor=");
  for(i=1;i<=num;i++)
   {
     Fac=num%i;
     if(Fac==0)
       {
          System.out.println(+i);
       }
   }
  }
}
