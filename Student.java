import java.util.Scanner;
class Student
  {
    public static void main (String args[])
    {
      Scanner su=new Scanner(System.in);
      int n,s1,s2,s3,avg,total;
      String name;
      System.out.println("enter student number:");
      n=su.nextInt();
      System.out.println("enter student name:");
      name=su.next();
      System.out.println("enter subect 1 marks :");
      s1=su.nextInt();
      System.out.println("enter subject 2 marks");
      s2=su.nextInt();
      System.out.println("enter subject 3 marks");
      s3=su.nextInt();
      total=s1+s2+s3;
      avg=total/3;
       System.out.println("the student name is "+name);
       System.out.println("the total marks is:"+total);
       System.out.println("the average marks is="+avg);
      
      
    }
  }