import java.util.*;
class Sumarray
  {
    public static void main(String args [])
    {
      Scanner sr=new Scanner(System.in);
      int i,n,sum=0;
      System.out.println("enter array size :");
      n=sr.nextInt();
      int a[]=new int[n];
      System.out.println("Enter array elements :");
      for(i=0;i<n;i++)
        {
          a[i]=sr.nextInt();
        }
      System.out.println("the elements in an array are:");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("the sum of array elements are :");
      for(i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      System.out.println(sum);
    }
  }