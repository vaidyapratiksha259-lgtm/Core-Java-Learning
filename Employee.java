import java.io.*;
import java.lang.*;
import java.util.*;
class Employee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Salary of Employee : ");
      float salary=sc.nextFloat();
     System.out.print("Enter Experience of Employee : ");
      int exp=sc.nextInt();

      if(salary>=20000 && exp>=5)
      {
        System.out.println("Employee is Eligible for Promotion");
      }
      else
      {
        System.out.println("Employee is not Eligible for Promotion");
      }
    }
  }
      
