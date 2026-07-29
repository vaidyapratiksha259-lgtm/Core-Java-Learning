import java.io.*;
import java.lang.*;
class Promotion
  {
    public static void main(String args[])
    {
      float salary,bonus,experience;
      String z;
      salary=50000f;
      experience=5f;
      bonus=salary*0.30f;
      z=experience>5?"Employee is Eligible for promotion ":"Employee is not Eligible for promotion ";
      System.out.println("***Employee Details***");
      System.out.println("Salary = "+salary);
      System.out.println("Experience = "+experience);
      System.out.println(z);


    }
  }
