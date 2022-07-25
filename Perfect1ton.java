import java.util.Scanner;
class Perfect1ton
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int sum=0;
      for(int i=0;i<n;i++)
        {
          for(int j=1;j<i;j++)
            {
              if(i%j==0)
              {
                sum=sum+i;
              }
            }
          if(sum==i&&sum!=0)
            System.out.println(i);
        }
    }
  }