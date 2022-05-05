import java.util.Scanner;
class Currentbill
  {
    public static void main (String args[])
    {
      Scanner cb=new Scanner(System.in);
      int cno,pmr,lmr,tu;
      float cbill;
      String cname;
      System.out.println("enter customer number=");
      cno=cb.nextInt();
      System.out.println("enter customer name=");
      cname=cb.next();
      System.out.println("enter present month reading=");
      pmr=cb.nextInt();
      System.out.println("enter last month reading=");
      lmr=cb.nextInt();
      tu=pmr-lmr;
      if(tu<=50)
        cbill=tu*1.45f;
      else if(tu<=100)
        cbill=((50*1.45f)+((tu-50)*2.30f));
      else if(tu<=200)
        cbill=((50*1.45f)+50*2.30f+(tu-100)*3.56f);
      else if(tu<=300)
        cbill=((50*1.45f)+50*2.30f+100*3.56f+tu-200*4.87f);
      else if(tu<=400)
        cbill=((50*1.45f)+50*2.30f+100*3.56f+100*4.87f+tu-300*5.76f);
      else
        cbill=((50*1.45f)+50*2.30f+100*3.56f+100*4.87f+100*5.76f+tu-400*6.56f);
          
      System.out.println("customer number is:"+cno);
      System.out.println("customer name is:"+cname);
      System.out.println("present month reading is :"+pmr);
      System.out.println("last month reading"+lmr);
      System.out.println("total units ="+tu);
      System.out.println("current bill="+cbill);
        
    }
  }