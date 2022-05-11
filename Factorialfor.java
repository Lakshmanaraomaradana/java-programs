import java.util.Scanner;
class Factorialfor
  {
    public static void main (String args[])
    {
      Scanner ff=new Scanner(System.in);
      int i,n,f=1;
      System.out.println("enter n value:");
      n=ff.nextInt();
      for(i=1;i<=n;i++)
        {
          f=f*i;
         
        }
      System.out.println(f);
    }
  }