import java.util.Scanner;
class Negitiveelements
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size :");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements to array :");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          if(arr[i]<0)
          {
            System.out.println(""+arr[i]);
          }
        }
    }
  }