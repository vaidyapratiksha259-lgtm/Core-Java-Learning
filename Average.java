import java.io.*;
import java.lang.*;
import java.util.*;
class Average
  {
    public static void main(String args[])
    {
      float biology,english,mathematics,science,computerorganization,average;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Biology Marks : ");
      biology=sc.nextFloat();
      System.out.print("Enter English Marks : ");
      english=sc.nextFloat();
      System.out.print("Enter Mathematics Marks : ");
      mathematics=sc.nextFloat();
      System.out.print("Enter Science Marks : ");
      science=sc.nextFloat();
      System.out.print("Enter ComputerOrganization Marks : ");
      computerorganization=sc.nextFloat();
      average=(biology+english+mathematics+science+computerorganization)/5;
      System.out.println("Average = " +average );
    }
  }
