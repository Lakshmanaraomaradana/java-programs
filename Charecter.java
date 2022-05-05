import java.util.Scanner;
class Charecter
  {
    public static void main(String args[])
    {
      Scanner c=new Scanner(System.in);
        char st;
      System.out.println("enter charecter:");
      st=c.next().charAt(0);
      if(st=='a' || st=='e' || st=='i'|| st=='o' || st=='u')
      {
        System.out.println("entered charecter is owel");
      }
      else
      {
        System.out.println("entered charecter is consonant");
      }
      
      
    }
  }