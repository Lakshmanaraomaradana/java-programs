import java.util.Scanner;
class Powerofnum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int num,expo;
      long power=1;
      System.out.println("Enter number and exponential :");
      num=sc.nextInt();
      expo=sc.nextInt();
      for(int i=1;i<=expo;i++)
        {
          power=power*num;
        }
      System.out.println("the power of the number is :"+power);
    }
  }