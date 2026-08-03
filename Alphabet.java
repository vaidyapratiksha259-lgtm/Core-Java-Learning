import java.io.*;
import java.lang.*;
import java.util.*;
class Alphabet
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Character : ");
      char ch=sc.next().charAt(0);
      if(ch>='A' && ch<='Z')
      {
        System.out.println("Enter Character is Uppercase");
      }
      else
      {
        System.out.println("Enter Character is Lowercase");
      }
    }
  }
      
