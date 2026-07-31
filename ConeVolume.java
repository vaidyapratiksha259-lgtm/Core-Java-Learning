import java.io.*;
import java.util.*;
class Volume
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Radius : ");
      int r=sc.nextInt();
      System.out.print("Enter Height : ");
      int h=sc.nextInt();
      double vol=(3.142*r*r*h)/3;
      System.out.println("Volume Of Cone is = "+vol);
    }
  }
      
