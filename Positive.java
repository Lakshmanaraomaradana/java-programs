import java.util.Scanner;
class Positive
  {
    public static void main(String args[])
    {
      Scanner p=new Scanner(System.in);
      int a;
      System.out.println("enter the number:");
      a=p.nextInt();
      if(a<=0)
      {
        System.out.println("entered number is negitive");
      }else{
        System.out.println("entered number is positive");
      }
    }
  }