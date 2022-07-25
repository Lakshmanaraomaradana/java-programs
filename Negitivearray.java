import java.util.Scanner;
class Negitivearray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size :");
      int n=sc.nextInt();
      int arr[]=new int[n];
      
      System.out.println("Enter array elements :");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          
        }
      int count=0;
      for(int i=0;i<n;i++)
        {
          if(arr[i]<0)
          {
           count++; 
          }
        }
      System.out.println("the count of negitive elements in the array is "+count);
    }
  }