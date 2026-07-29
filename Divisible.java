import java.io.*;
import java.lang.*;
class Divisible
  {
    public static void main(String args[])
    {
      int n=9;
      String z=n%3==0 && n%7==0?"The Given Number is Divisible by Both the 3 and 9 ":"The Given Number is Not Divisible by Both the 3 and 9 ";
      System.out.println(z);
    }
  }
