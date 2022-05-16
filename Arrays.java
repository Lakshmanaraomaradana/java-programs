import java.util.*;
class Arrays
  {
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements to arrays:");
        for(i=0;i<n;i++)
          {
            a[i]=sc.nextInt();
          }
        System.out.println("The elements in an array is:");
        for(i=0;i<n;i++)
          {
            System.out.println(a[i]);
          }
        for(i=0;i<n;i++)
          {
            sum=sum+a[i];
          }
        System.out.println("The sum of array elements are :"+sum);
      }
  }