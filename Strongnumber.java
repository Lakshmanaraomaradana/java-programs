import java.util.Scanner;
class Strongnumber
  {
    public static void main(String args[])
    {
      Scanner sn=new Scanner(System.in);
      int n,temp,sum=0,r,i=1;
      System.out.println("enter number");
      n=sn.nextInt();
      temp=n;
      while(n>0)
        {
          r=n%10;
          while(r>0)
            {
              i=i*r;
              r=r-1;
              }
          sum=sum+i;
          n=n/10;
            }
      if(temp==sum)
        System.out.println("it is strong number");
      else
        System.out.println("it is not strong number");
        }
    }