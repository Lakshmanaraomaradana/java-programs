import java.util.Scanner;
class Armstrongfor
  {
    public static void main (String args[])
    {
      Scanner as=new Scanner(System.in);
        int n,rev,rem,temp;
      System.out.println("Enter n value:");
      n=as.nextInt();
      temp=n;
      for(rev=0;n>0;n/=10)
        {
          rem=n%10;
          rev=rev+rem*rem*rem;
          
        }
      if(rev==temp)
      {
        System.out.println("it is armstrong number");
      }
      else
        System.out.println("it is not armstrong number ");
    }
  }