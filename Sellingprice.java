import java.io.*;
import java.lang.*;
import java.util.*;
class Sellingprice
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Selling price : ");
      int sp=sc.nextInt();
      System.out.print("Enter Cost price : ");
      int cp=sc.nextInt();

      if(sp>cp)
      {
         System.out.print("ShopKeeper is in profit");
      }
      else if(sp<cp)
      {
         System.out.print("ShopKeeper is in lose");
      }
      else
      {
         System.out.print("ShopKeeper is in no profit no lose");
      }
    }
    }
    
      
