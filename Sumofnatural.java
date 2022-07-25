import java.util.Scanner;
class Sumofnatural
  {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number :");
      int a=sc.nextInt();
      int sum=0;
      for(int i=0;i<=a;i++)
        {
          sum=sum+i;
        }
      System.out.println("the sum of natural numbers is"+sum);
    }
  }