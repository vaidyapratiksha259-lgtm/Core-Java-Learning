import java.util.Scanner;

public class Marks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        float m = sc.nextFloat();

        if (m >= 80 && m <= 100) {
            System.out.println("Grade is A");
        } else if (m >= 60 && m <= 79) {
            System.out.println("Grade is B");
        } else if (m >= 40 && m <= 59) {
            System.out.println("Grade is C");
        } else {
            System.out.println("Student is Fail");
        }
    }
}
