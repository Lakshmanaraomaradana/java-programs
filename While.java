import java.util.Scanner;
class While
  {
    public static void main(String args[])
    {
      Scanner w=new Scanner(System.in);
      int pin=8297,n;
      boolean e=true;
      while(e)
        {
      System.out.println("enter pin no:");
      n=w.nextInt();
      if(pin==n)
      {
        System.out.println("u entered correct pin");
        e=false;
        }
      else
      {
        System.out.println("ur pin number is wrong");
        }
          }
      
      
    
    }
  }