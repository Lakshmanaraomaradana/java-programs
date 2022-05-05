import java.util.Scanner;
class Swap
  {
    public static void main (String args[])
    {
      Scanner sw=new Scanner(System.in);
      int a,b,e;
      System.out.println("enter the value of a :");
      a=sw.nextInt();
      System.out.println("enter the value of b :");
      b=sw.nextInt();
      e=a;
      a=b;
      b=e;
      System.out.println(" a value is="+a);
      System.out.println(" b value is="+b);
    }
  }