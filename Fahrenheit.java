import java.util.Scanner;
class Fahrenheit
  {
    public static void main(String args[])
    {
      Scanner f=new Scanner(System.in);
      int a;
      float c;
      System.out.println("enter fahrenheit");
      a=f.nextInt();
      c=(32-a)*0.5f;
      System.out.println("celcius="+c);
      
      
    }
  }
  