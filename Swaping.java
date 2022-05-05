import java.util.Scanner;
class Swaping
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("enter a value:");
      a=sc.nextInt();
      System.out.println("enter b value:");
      b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("a="+a);
      System.out.println("b="+b);
      
    }
  }