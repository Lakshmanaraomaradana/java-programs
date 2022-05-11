import java.util.Scanner;
class Prime
  {
    public static void main(String args[])
    {
      Scanner pn=new Scanner(System.in);
      int n,c=0,i=1;
      System.out.println("enter n value:");
      n=pn.nextInt();
      while(i<=n)
        {
          if(n%i==0)
          {
            c++;
          }
          i++;
          }
          if(c==2)
            System.out.println("given number is prime number");
          else
            System.out.println("given number is not prime number");
        }
    }