import java.util.*;
class Searchingarray
  {
    public static void main (String args[])
    {
      Scanner sa=new Scanner(System.in);
      int i,j,n,ser;
        System.out.println("enter array size");
      n=sa.nextInt();
      int a[]=new int[n];
      System.out.println("Enter array elements");
      for(i=0;i<n;i++)
        {
          a[i]=sa.nextInt();
        }
      System.out.println("The elements in an array is:");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("Enter values for search");
      ser=sa.nextInt();
      for(i=0;i<n;i++)
        {
          if(ser==a[i])
          {
            System.out.println(ser+" is found");
            break;
          }
          if(i==n-1)
          {
            System.out.println(ser+" not found in the array");
          }
        
        }
    }
  }