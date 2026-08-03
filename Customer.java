import java.io.*;
import java.lang.*;
import java.util.*;
class Customer
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Bill Amount : ");
      float bill=sc.nextFloat();
      System.out.print("Enter No. of visit : ");
      int visit=sc.nextInt();

      if(bill>=1000 && visit==1)
      {
        System.out.println("Customer is Eligible for Discount");
      }
      else
      {
        System.out.println("Customer is not Eligible for Discount");
      }
    }
  }
      
