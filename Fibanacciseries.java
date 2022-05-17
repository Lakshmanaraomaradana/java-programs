import java.util.Scanner;
class Fibanacciseries
  {
    public static void main (String args[])
    {
      Scanner fb=new Scanner(System.in);
      int first=0,sec=1,n,sum=0,i;
      System.out.println("Enter number :");
      n=fb.nextInt();
      for(i=1;i<=n;i++)
        {
          System.out.println(first);
          sum=first+sec;
          first=sec;
          sec=sum;
        }
    }
  }