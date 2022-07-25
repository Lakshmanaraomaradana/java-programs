import java.util.Scanner;
class Digitproduct
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int rem,product=1;
      while(n>0)
        {
          rem=n%10;
          product=product*rem;
          n/=10;
        }
      System.out.println("the product of digits in a number is "+product);
    }
  }