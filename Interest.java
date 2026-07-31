import java.io.*;
import java.lang.*;
import java.util.*;
class SimpleInterst
  {
    public static void main(String args[])
    {
      float principalamount,rateofinterest,noofyear,simpleinterest;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Principal Amount : ");
      principalamount=sc.nextFloat();
      System.out.print("Enter Rate of Interest : ");
      rateofinterest=sc.nextFloat();
      System.out.print("Enter No. Of Year : ");
      noofyear=sc.nextFloat();
      simpleinterest=principalamount*rateofinterest*noofyear;
      System.out.println("Simple Interest = " +simpleinterest );
    }
  }
