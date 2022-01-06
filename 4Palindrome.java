class Palindrome
  {
   public static void main (String args[])
       {
          int n=121,r,s=0;
          int t=n;
          while(n>0)
            {
              r=n%10;
              s=(s*10)+r;
              n=n/10;
            }
           if(t==s)
             System.out.println(" Number is palindrome");
           else
             System.out.println(" Number is not palindrome");
       }
}
    
