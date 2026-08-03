import java.io.*;
import java.lang.*;
import java.util.*;
class Blood
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Age of Person : ");
      int age=sc.nextInt();
      System.out.print("Enter Weight Person : ");
      float weight=sc.nextFloat();

      if(age>=18 && weight>=45)
      {
        System.out.println("Person is Eligible for Blood Donation ");
      }
      else
      {
        System.out.println("Person is Not Eligible for Blood Donation ");
      }
    }
  }
      
