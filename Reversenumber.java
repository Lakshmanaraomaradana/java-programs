import java.util.Scanner;
class Reversenumber
  {
    public static void main(String args[])
    {
      Scanner rn=new Scanner(System.in);
      int n,r,sum=0;
      System.out.println("enter number:");
      n=rn.nextInt();
      while(n>0)
        {
          r=n%10;
          sum=sum*10+r;
          n=n/10;
        }
      System.out.println("the reverse number is :"+sum);
      
    }
  }