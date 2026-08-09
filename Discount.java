import java.io.*;
import java.lang.*;
import java.util.*;
class Discount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Bill Amount : ");
      int bill=sc.nextInt();


      if(bill>=8000 && bill<=1000)
      {
         double discount=bill*0.50;
         System.out.print("Discount : "+discount);
      }
      else if(bill>=6000 && bill<=7900)
      {
        double discount=bill*0.30;
        System.out.print("Discount : "+discount);
      }
      else if(bill>=4000 && bill<=5900)
      {
        double discount=bill*0.20;
        System.out.print("Discount : "+discount);
      }
      else
       {
        double discount=bill*0.10;
        System.out.print("Discount : "+discount);

      }
    }
    }
    
      
