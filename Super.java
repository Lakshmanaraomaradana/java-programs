import java.util.Scanner;
class Super
  {
    public static void main (String args[])
    {
      Scanner bi=new Scanner(System.in);
      int n,c,q,bill;
      String pn;
      System.out.println("enter product number:");
      n=bi.nextInt();
      System.out.println("enter product name:");
      pn=bi.next();
      System.out.println("enter product cost");
      c=bi.nextInt();
      System.out.println("enter product quantity");
      q=bi.nextInt();
      bill=c*q;
      System.out.println("product number is="+n);
      System.out.println("product name is ="+pn);
      System.out.println("product cost is="+c);
      System.out.println("product quantity is"+q);
      System.out.println("your bill amount is="+bill);
      
      
    }
  }