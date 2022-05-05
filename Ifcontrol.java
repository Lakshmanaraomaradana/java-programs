import java.util.Scanner;
class Ifcontrol
  {
    public static void main (String args[])
    {
      Scanner s=new Scanner(System.in);
      int a,b;
      System.out.println("enter a value=");
      a=s.nextInt();
      System.out.println("enter b value=");
      b=s.nextInt();
      if(a>b)
      {
        System.out.println("a is big");
      }
      System.out.println("thank u");
    }
  }