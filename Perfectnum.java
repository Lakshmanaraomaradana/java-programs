import java.util.Scanner;
class Perfectnum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
            sum=sum+i;
          }
        }
      if(sum==n)
      {
        System.out.println("it is perfect number");
      }
      else
      {
        System.out.println("it is not perfect number");
      }
    }
  }