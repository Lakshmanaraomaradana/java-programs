class Decrement
  {
    public static void main(String args[])
      {
        int a=10,b;
        System.out.println("PREFIX DECREMENT");
        b=--a;
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("POSTFIX DECREMENT");
        b=a--;
        System.out.println("a="+a);
        System.out.println("b="+b);
      }
  }