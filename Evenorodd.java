import java.util.Scanner;
class Evenorodd
  {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      if(n%2==0)
        System.out.println("it is even number number");
      else
        System.out.println("it is odd number");
    }
  }