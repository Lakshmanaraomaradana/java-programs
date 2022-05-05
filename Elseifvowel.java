import java.util.Scanner;
class Elseifvowel
  {
    public static void main(String args[])
    {
      Scanner v=new Scanner(System.in);
      System.out.println("enter the charecter:");
      char si;
      si=v.next().charAt(0);
      if(si=='a')
        System.out.println("the entered charecter is vowel");
      else if(si=='e')
        System.out.println("the entered charecter is vowel");
      else if(si=='i')
        System.out.println("the entered charecter is vowel");
      else if(si=='o')
        System.out.println("the entered charecter is vowel");
      else if(si=='u')
        System.out.println("the entered charecter is vowel");
      else
      {
        System.out.println("the entered charecter is cosonant");
      }
      
    }
  }