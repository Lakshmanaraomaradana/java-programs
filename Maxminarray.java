import java.util.Scanner;
class Maxminarray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size :");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements to the array :");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          
        }
      int max=arr[0];
      for(int i=0;i<n;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }
        }
      System.out.println("the maximum element is "+max);
      int min=arr[0];
      for(int i=0;i<n;i++)
        {
          if(arr[i]<min)
          {
            min=arr[i];
          }
        }
      System.out.println("the minimum element is "+min);
    }
  }