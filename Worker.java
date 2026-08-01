import java.io.*;
import java.lang.*;
import java.util.*;
class Worker
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Working Day's : ");
int wd=sc.nextInt();
System.out.print("Enter Wadges : ");
int w=sc.nextInt();
float salary=wd*w;
System.out.println("Total Salary is =  "+salary);
}
}

