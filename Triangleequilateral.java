import java.io.*;
import java.lang.*;
import java.util.*;
class Triangle.java
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Side 1 of Triangle : ");
int s1=sc.nextInt();
System.out.print("Enter Angle 1 of Triangle : ");
int ag1=sc.nextInt();
System.out.print("Enter Side 2 of Triangle : ");
int s2=sc.nextInt();
System.out.print("Enter Angle 2 of Triangle : ");
int ag2=sc.nextInt();
System.out.print("Enter Side 3 of Triangle : ");
int s3=sc.nextInt();
System.out.print("Enter Angle 3 of Triangle : ");
int ag3=sc.nextInt();


if(s1==s2 && s1==s3 && s2==s3)
{
if(ag1==ag2 && ag1==ag3 && ag2==ag3)
{
System.out.print("The Triangle is Equilateral");
}
else
{
System.out.print("The Triangle is not Equilateral Because the angle is not equal");
}
}
else
{
System.out.print("The Triangle is not Equilateral Because the side is not equal");
}
}
}




