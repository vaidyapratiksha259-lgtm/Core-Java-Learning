import java.io.*;
import java.lang.*;
import java.util.*;
class Admission
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter SSC Score : ");
double ssc=sc.nextDouble();
System.out.print("Enter HSC Score : ");
double hsc=sc.nextDouble();

if(ssc>=60)
{
if(hsc>=60)
{
System.out.print("Student is Eligible For Admission");
}
else
{
System.out.print("Student is Not Eligible For Admission Because HSC Score is below than 60%");
}
}
else
{
System.out.print("Student is Not Eligible For Admission Because SSC Score is below than 60%");
}
}
}




