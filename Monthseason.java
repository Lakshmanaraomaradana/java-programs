import java.util.Scanner;
class Monthseason
  {
    public static void main(String args[])
    {
      Scanner ms=new Scanner(System.in);
      int m;
      System.out.println("enter month nuber:");
      m=ms.nextInt();
      switch(m)
        {
          case 3:
          case 4:
          case 5:
          case 6:
            System.out.println("Summer season");
            break;
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Rainy season");
            break;
          case 11:
          case 12:
          case 1:
          case 2:
            System.out.println("Winter season");
            break;
          default:
            System.out.println("entered month number is not in exist");
        }
    }
  }