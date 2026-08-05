import java.util.*;
class Bonus
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double salary;
      int workexp;
      System.out.print("Enter Salary of employee: ");
      salary=sc.nextDouble();
      System.out.print("Enter Work Experience of employee : ");
      workexp=sc.nextInt();
      



    if(workexp>3)
    {
      double bonus=salary*0.20;
      System.out.println("The Employee get a bouns is = " + bonus);
    }
      else
    {
      double bonus=salary*0.10;
      System.out.println("The Employee get a bouns is = " + bonus);

    }
    }
  }







      
