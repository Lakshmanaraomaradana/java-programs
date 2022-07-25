import java.util.Scanner;
class Deleteposition
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int arr[]=new int [n];
      
      System.out.println("Enter elements to array :");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter position to delete :");
      int a=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          if(arr[i]!=arr[a])
          {
            System.out.println(" "+arr[i]);
          }
        }
        
      
    }
  }