import java.util.*;
class Multiarray
  {
    public static void main(String args[])
    {
      Scanner ma=new Scanner(System.in);
      int i,c,r,j;
      System.out.println("Enter row size:");
      r=ma.nextInt();
      System.out.println("Enter column size:");
      c=ma.nextInt();
      int a[][]=new int[r][c];
      System.out.println("Enter elements to array:");
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              a[i][j]=ma.nextInt();
            }
        }
      System.out.println("Elements in an array is :");
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              System.out.print(" "+a[i][j]);
            }
          System.out.println();
        }
    }
  }