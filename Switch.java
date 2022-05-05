import java.util.Scanner;
class Switch
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a;
      System.out.println("enter a value");
      a=s.nextInt();
      switch(a)
        {
          case 1:
            System.out.println("Sunday");
            break;
          case 2:
            System.out.println("monday");
            break;
          case 3:
            System.out.println("tuesday");
            break;
          case 4:
            System.out.println("wednesday");
            break;
          case 5:
            System.out.println("thursday");
            break;
          case 6:
            System.out.println("friday");
            break;
          case 7:
            System.out.println("saturday");
            break;
          default:
              {
                System.out.println("invalid");
              }
            
        }
    }
  }