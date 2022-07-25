import java.util.Scanner;
class Frequencydigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int rem,count,temp;
      temp=n;
      for(int i=0;i<=9;i++)
        {
          count=0;
          while(n>0)
            {
              rem=n%10;
              if(rem==i)
              {
                count++;
              }
              n/=10;
            }
         
          {
            System.out.println(i+"-->"+count);
          }
        }
    }
  }