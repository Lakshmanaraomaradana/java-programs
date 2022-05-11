import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      Scanner sn=new Scanner(System.in);
      int i=1,n,sum=1;
      System.out.println("enter n value:");
      n=sn.nextInt();
      while(i<=n)
        {
          sum=sum*i;
          i++;
        }
      System.out.println("the factorial of n natural numbers :"+sum);
      
    }
  }