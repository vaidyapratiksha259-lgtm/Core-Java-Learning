import java.util.*;
class Number
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number : ");
      int num=sc.nextInt();
      if(num>0)
      {
        System.out.print("Number is Positive");
      }
      else
      {
        System.out.print("Number is Negative");
      }

    }
}
