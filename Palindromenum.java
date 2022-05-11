import java.util.Scanner;
class Palindromenum
  {
    public static void main (String args[])
    {
      Scanner pn=new Scanner(System.in);
      int r,temp,n,sum=0;
      System.out.println("enter number:");
      n=pn.nextInt();
      temp=n;
      while(n>0)
        {
          r=n%10;
          sum=(sum*10)+r;
          n=n/10;
        }
      if(temp==sum)
        System.out.println("entered number is palindrome");
      else
        System.out.println("it is not palindrome");
      
    }
  }