import java.util.Scanner;
class Mlr
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a,b,add,sub,mul,div,rem;
      System.out.println("enter the value of a:");
      a=s.nextInt();
      System.out.println("enter the value of b:");
      b=s.nextInt();
      add=a+b;
      System.out.println("addition of a,b is:"+add);
      sub=a-b;
      System.out.println("sudghgfgjjgjggjhg:"+sub);
      mul=a*b;
      System.out.println("multiplication is :"+mul);
      div=a/b;
      System.out.println("division is :"+div);
      rem=a%b;
      System.out.println("remainder is :"+rem);
      
    }
  }