import java.util.Scanner;

public class GuitarPostalCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 6-digit postal code: ");
        int pin = sc.nextInt();

        if (pin >= 100000 && pin <= 999999) {
            int lastDigit = pin % 10;

            if (lastDigit % 2 == 0) {
                System.out.println("🎸 Guitar String: Even Tune");
            } else {
                System.out.println("🎸 Guitar String: Odd Tune");
            }
        } else {
            System.out.println("Invalid Postal Code!");
        }

        sc.close();
    }
}