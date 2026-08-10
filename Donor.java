import java.io.*;
import java.lang.*;
import java.util.*;

class Donor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Weight:");
        double weight = sc.nextDouble();

        if(age >= 18)
        {
            if(weight >= 45)
            {
                System.out.println("Eligible to Donate Blood");
            }
            else
            {
                System.out.println("Not Eligible to Donate Blood");
                System.out.println("Because Weight is below 45");
            }
        }
        else
        {
            System.out.println("Not Eligible to Donate Blood");
            System.out.println("Because Age is below 18");
        }
    }
}
