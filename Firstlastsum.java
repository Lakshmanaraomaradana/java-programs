import java.util.Scanner;
class Firstlastsum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int sum,fd,ld,rem,rev=0;
      ld=n%10;
      while(n>0)
        {
          rem=n%10;
          rev=rev*10+rem;
          n/=10;
          
        }
      fd=rev%10;
      sum=fd+ld;
      System.out.println("the sum of first and last digits are :"+sum);
    }
  }
  