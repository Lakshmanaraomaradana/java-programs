import java.util.Scanner;
class Sumnnatural
  {
    public static void main(String args[])
    {
      Scanner sn=new Scanner(System.in);
      int i=1,n,sum=0;
      System.out.println("enter n value:");
      n=sn.nextInt();
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.println("the sum of n natural numbers :"+sum);
      
    }
  }