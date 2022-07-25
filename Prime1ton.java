import java.util.Scanner;
class Prime1ton
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
      int n=sc.nextInt();
      for(int i=0;i<=n;i++)
        {
          int count=0;
          for(int j=2;j<=i/2;j++)
            {
              if(i%j==0)
              {
                count++;
                break;
              }
            }
          if(count==0&&i!=1)
            System.out.println(i);
        }
    }
  }