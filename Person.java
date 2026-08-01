import java.io.*;
import java.lang.*;
import java.util.*;
class Person
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter Name : ");
String name=sc.nextLine();
System.out.print("Enter Blood Group : ");
String age=sc.next();
System.out.print("Enter Age : ");
int bloodgroup=sc.nextInt();
System.out.print("Enter Mobile No. : ");
long mobile=sc.nextLong();

System.out.println("Name =  "+name);
System.out.println("Age =  "+age);
System.out.println("Blood Group =  "+bloodgroup);
System.out.println("Mobile No. =  "+mobile);
}
}

