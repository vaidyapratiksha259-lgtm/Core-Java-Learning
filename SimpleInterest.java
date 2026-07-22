import java.io.*;
import java.lang.*;
class SimpleInterest
  {
    public static void main(String args[])
    {
      float principalam,rateofinterest,year,simpleinterest;
      principalam=5000.0f;
      rateofinterest=24f;
      year=3.5f;
      simpleinterest=(principalam*rateofinterest*year);
      System.out.println("SimpleInterest : "+simpleinterest);
    }
  }
