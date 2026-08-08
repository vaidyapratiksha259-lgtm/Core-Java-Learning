import java.io.*;
import java.lang.*;
import java.util.*;
class Keyword
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Character : ");
      char ch=sc.next().charAt(0);
      if(ch>='A' && ch<='Z')
      {
              System.out.println("Enter Key is Uppercase");
      }
      else if(ch>='a' && ch<='z')
      {
              System.out.println("Enter Key is Lowercase");
      }
      else if(ch>='0' && ch<='9')
      {
              System.out.println("Enter Key is Digit");
      }
      else 
      {
              System.out.println("Enter Key is Symbol");
      }
    }
    }

      
        
