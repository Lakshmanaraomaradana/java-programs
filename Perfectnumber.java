import java.util.Scanner;
class Perfectnumber
  {
    public static void main(String args[])
    {
      Scanner pn=new Scanner(System.in);
      int n,i=1,sum=0;
      System.out.println("enter number:");
      n=pn.nextInt();
      while(i<n)
        {
          if(n%i==0)
            sum=sum+i;
          i=i+1;
          }
      if(n==sum)
        System.out.println("it is perfect number");
      else
        System.out.println("it is not perfect number");
        }
    }