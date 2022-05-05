import java.util.Scanner;
class Switchvowel
  {
    public static void main(String args[])
    {
      Scanner vi=new Scanner(System.in);
      char si;
      System.out.println("enter a charecter:");
      si=vi.next().charAt(0);
      switch(si)
        {
          case 'a':
          case 'A':  
            System.out.println("enterd charecter is vowel");
            break;
          case 'e':
          case 'E':  
            System.out.println("enterd charecter is vowel");
            break;
          case 'i':
          case 'I':
            System.out.println("enterd charecter is vowel");
            break;
          case 'o':
          case 'O':
            System.out.println("enterd charecter is vowel");
            break;
          case 'u':
          case 'U':
            System.out.println("enterd charecter is vowel");
            break;
          default:
              {
                System.out.println("enterd charecter is consonant");
              }
            
        }
    }
  }