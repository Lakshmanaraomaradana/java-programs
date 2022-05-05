import java.util.Scanner;
class Bigvalue
  {
    public static void main(String args[])
    {
      Scanner v=new Scanner(System.in);
      int a,b,c;
      System.out.println("enter the a value=");
      a=v.nextInt();
      System.out.println("enter the b value=");
      b=v.nextInt();
      System.out.println("enter the c value=");
      c=v.nextInt();
      if(a>b&&a>c)
      {
        System.out.println("a is big");
      }
      if(b>a&&b>c)
      {
        System.out.println("b is big");
      }
      if(c>a&&c>b)
      {
        System.out.println("c is big");
      }
    }
  }