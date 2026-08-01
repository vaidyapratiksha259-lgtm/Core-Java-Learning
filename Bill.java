import java.io.*;
import java.lang.*;
import java.util.*;
class Bill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of Product Purchase : ");
int np=sc.nextInt();
System.out.print("Enter Product price: ");
float pp=sc.nextInt();
float bill=np*pp;
System.out.println("Total Bill is =  "+bill);
}
}

