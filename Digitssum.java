import java.util.Scanner;
class Digitssum
  {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int rem,sum=0;
      while(n>0)
        {
          rem=n%10;
          sum=sum+rem;
          n/=10;
        }
      System.out.println("The sum of digits are :"+sum);
    }
  }