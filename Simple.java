import java.util.Scanner;
class Simple
  {
    public static void main (String args[])
    {
      Scanner si=new Scanner(System.in);
      int p,t,r,s;
      System.out.println("enter principle :");
      p=si.nextInt();
      System.out.println("enter time in years:");
      t=si.nextInt();
      System.out.println("enter rate of interest");
      r=si.nextInt();
      s=p*t*r/100;
      System.out.println("simple interest is ="+s);
      
      
    } 
  }