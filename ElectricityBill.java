import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        if (units <= 50) {
            System.out.println("Bill Category: Low Consumption");
            System.out.println("Amount: ₹" + (units * 3));

        } else if (units <= 150) {
            System.out.println("Bill Category: Moderate Consumption");
            System.out.println("Amount: ₹" + (units * 5));

        } else if (units <= 300) {
            System.out.println("Bill Category: High Consumption");
            System.out.println("Amount: ₹" + (units * 7));

        } else if (units <= 500) {
            System.out.println("Bill Category: Very High Consumption");
            System.out.println("Amount: ₹" + (units * 9));

        } else {
            System.out.println("Bill Category: Extremely High Consumption");
            System.out.println("Amount: ₹" + (units * 12));
        }

        sc.close();
    }
}
