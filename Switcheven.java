import java.util.Scanner;
class Switcheven
  {
    public static void main (String args[])
    {
      Scanner s=new Scanner(System.in);
      int a;
      System.out.println("enter number=");
      a=s.nextInt();
      switch(a%2)
        {
          case 0:
            System.out.println("it is even number");
            break;
          case 1:
            System.out.println("it is odd number");
        }
    }
  }