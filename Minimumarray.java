import java.util.Scanner;
class Minimumarray
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i;
      System.out.println("enter ary size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          
        }
      System.out.println("enter elements in an ary:");
      for(i=0;i<n;i++)
        {
          System.out.println (" "+a[i]);
        }
      {
      int min=a[0];
        for(i=0;i<n;i++)
          {
           if(a[i]<min)
             min=a[i];
          }
        System.out.println("enter min value in an ary:"+min);
        }
      
    }
  }