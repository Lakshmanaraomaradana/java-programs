import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      int fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
      System.out.println("the factorial of number is :"+fact);
    }
  }