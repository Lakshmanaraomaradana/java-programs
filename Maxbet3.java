import java.util.Scanner;
class Maxbet3
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner m=new Scanner(System.in);
      System.out.println("enter values of a,b,c");
      a=m.nextInt();
      b=m.nextInt();
      c=m.nextInt();
      if(a>b&&a>c)
      
        System.out.println("a is maximum");
      
      if(b>a&&b>c)
      
        System.out.println("b is maximum");
      
      if(c>a&&c>b)
      
        System.out.println("c is maximum");
      
    }
  }