import java.util.Scanner;
class Digitcount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int count=0,rem;
      while(n>0)
        {
          rem=n%10;
          count++;
          n/=10;
        }
      System.out.println("the digit count in the number is :"+count);
    }
  }