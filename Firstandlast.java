import java.util.Scanner;
class Firstandlast
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int rem,rev=0,ld,fd;
      ld=n%10;
      
      while(n>0)
        {
          rem=n%10;
          rev=rev*10+rem;
          n/=10;
        }
      fd=rev%10;
      System.out.println("the first digit is "+fd);
      System.out.println("the last digit is "+ld);
    }
  }