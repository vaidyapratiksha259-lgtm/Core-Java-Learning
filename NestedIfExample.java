import java.util.Scanner;

class NestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();

            if (marks >= 50) {
                System.out.println("Eligible for admission.");
            } else {
                System.out.println("Not eligible due to low marks.");
            }
        } else {
            System.out.println("Not eligible due to age.");
        }

        sc.close();
  }
}