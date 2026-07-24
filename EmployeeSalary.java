import java.io.*;
import java.lang.*;

class EmpSalary
{
    public static void main(String args[])
    {
        float salary, bonus, finalsalary;

        salary = 50000f;
        bonus = salary * 0.20f;
        finalsalary = salary + bonus;

        System.out.println("The final salary is : " + finalsalary);
    }
}
