import java.util.Scanner;
class Phonechar
  {
    public static void main(String args[])
    {
      Scanner pc=new Scanner(System.in);
      String n;
      System.out.println("Enter phone number:");
      n=pc.next();
     char c=n.charAt(0);
      
      
      if(c=='8'||c=='9'||c=='7')
      {
        System.out.println("phone number is correct");
      }
      else
      {
        System.out.println("phone number is invalid");
      }
    }
  }