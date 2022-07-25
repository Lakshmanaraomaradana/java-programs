import java.util.Scanner;
class Positiveornegitive
  {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      if(n>0)
        System.out.println("it is positive number");
      else
        System.out.println("it is negitive number");
    }
  }