import java.io.*;
import java.lang.*;
import java.util.*;
class Divisiblenum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Number : ");
      int num=sc.nextInt();

      if(num%7==0 && num%3==0)
      {
        System.out.println("Number is Divisible by both the 2 and 3");
      }
      else
      {
        System.out.println("Number is not Divisible by both the 2 and 3");

      }
    }
  }
      
