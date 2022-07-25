import java.util.Scanner;
class Fibanacci
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int fn=0,sn=1,sum;
      for(int i=0;i<=n;i++)
        {
          System.out.println(fn);
          sum=fn+sn;
          fn=sn;
          sn=sum;
        }
    }
  }