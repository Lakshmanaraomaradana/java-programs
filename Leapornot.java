import java.util.Scanner;
class Leapornot
  {
    public static void main(String args[])
    {
      Scanner l=new Scanner(System.in);
      int a;
      System.out.println("enter year:");
      a=l.nextInt();
      if(a%4==0)
      {
        System.out.println("entered year is leap year");
      }
      else{
        System.out.println("entered year is not a leap year");
      }
    }
  }