import java.util.Scanner;
class Rangepalindrome
  {
    public static void main (String args[])
    {
      Scanner rp=new Scanner(System.in);
      int r1,j,rev=0,rem,temp2,r2;
      System.out.println("enter range number");
      r1=rp.nextInt();
      r2=rp.nextInt();
      for(j=r1;j<r2;j++)
        {
       
        temp2=j;
          
      for(rev=0;temp2>0;temp2/=10)
        {
          rem=temp2%10;  
          rev=rev*10+rem;
        
          }
      
      if(j==rev)
      {
        System.out.println(rev);
      }
 
        }
          
        
      }
  }