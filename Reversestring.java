import java.util.Scanner;
class Reversestring
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string :");
      String str=sc.next();
      String str1="";
      for(int i=str.length()-1;i>=0;i--)
        {
          str1=str1+str.charAt(i);
        }
      System.out.println("The reverse of string is "+str1);
    }
  }