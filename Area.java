import java.util.Scanner;
  class Area
    {
      public static void main (String args[])
      {
        Scanner re=new Scanner(System.in);
        int l,b,area,perimeter;
        System.out.println("enter value of l:");
        l=re.nextInt();
        System.out.println("enter value of b");
        b=re.nextInt();
        area=l*b;
        System.out.println("area ia="+area);
        perimeter=2*(l+b);
        System.out.println("perimeter is ="+perimeter);
        
      }
    }