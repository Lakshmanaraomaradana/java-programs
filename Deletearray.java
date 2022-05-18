import java.util.*;
class Deletearray
  {
    public static void main (String args[])
    {
      Scanner da=new Scanner(System.in);
      int i,j,n,k;
        System.out.println("Enter array size:");
      n=da.nextInt();
      int a[]=new int[n];
      System.out.println("Enter array elements:");
      for(i=0;i<n;i++)
        {
          a[i]=da.nextInt();
        }
      
      System.out.println("The elements before delete:");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("enter number to delete element:");
      k=da.nextInt();
      System.out.println("deleted number "+k);
      for(i=0;i<n;i++)
        {
          if(a[i]!=k)
          {
            System.out.println(a[i]);
          }
         
        }
      
     
    }
  }