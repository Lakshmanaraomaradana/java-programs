import java.util.Scanner;
class Palindromefor
  {
    public static void main(String args[])
    {
      Scanner p=new Scanner(System.in);
      int rem,rev=0,temp,n;
      System.out.println("Enter the number:");
      n=p.nextInt();
      temp=n;
      for(rev=0;n>0;n/=10)
        {

          rem=n%10;
          
          rev=rev*10+rem;
         
          
         
         
        }
      System.out.println(rev);
      System.out.println(temp);
      
      if(temp==rev)
      {
        System.out.println("it is palindrome");
      }
      else
      {
        System.out.println("it is not palindrrome");
    
        }
        } 
  }