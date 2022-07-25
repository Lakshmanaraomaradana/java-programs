import java.util.Scanner;
class Frequencyarray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size ");
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      System.out.println("Enter elements to array :");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int c=0;
      for(int i=0;i<n;i++)
        {
          c=1;
          if(a[i]!=-1)
          {
            for(int j=i+1;j<n;j++)
              {
                if(a[i]==a[j])
                {
                  c=c+i;
                  a[j]=-1;
                }
              }
            b[i]=c;
          }
        }
      for(int i=0;i<n;i++)
        {
          if(a[i]!=-1)
          {
            System.out.println(a[i]+"=="+b[i]);
          }
        }
    }
  }