import java.util.Scanner;

public class EnergyAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter daily electricity usage (units): ");
        int units = sc.nextInt();

        if (units <= 5) {
            System.out.println("Usage Status: Excellent");
            System.out.println("You are using electricity efficiently.");
        } else if (units <= 10) {
            System.out.println("Usage Status: Normal");
            System.out.println("Try to reduce unnecessary usage.");
        } else if (units <= 20) {
            System.out.println("Usage Status: High");
            System.out.println("Consider saving electricity.");
        } else {
            System.out.println("Usage Status: Critical");
            System.out.println("Reduce electricity consumption immediately.");
        }

        sc.close();
    }
}