import java.util.Scanner;
class Reversento1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      for(int i=n;i>0;i--)
        {
          System.out.println(i);
        }
    }
  }