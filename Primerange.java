import java.util.Scanner;
class Primerange
  {
    public static void main (String args[])
    {
      Scanner pr=new Scanner(System.in);
      int i,j,r1,r2,count=0;
      System.out.println("Eneter range one:");
      r1=pr.nextInt();
      System.out.println("Enter range 2:");
      r2=pr.nextInt();
      for(i=r1;i<=r2;i++)
        {
          for(j=2;j<i;j++)
            {
              if(i%j==0)
              {
                count=0;
                break;
              }
              else
              {
                count=1;
              }
            }
            
          if(count==1)
          {
            System.out.println(i);
              }
              
        }
    }
  }