
import java.util.Scanner;

public class WaterUsageAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter daily water usage in liters: ");
        int liters = sc.nextInt();

        if (liters < 0) {
            System.out.println("Invalid water usage!");
        } else if (liters <= 100) {
            System.out.println("Water Usage: Low");
            System.out.println("Status: Excellent conservation!");
        } else if (liters <= 250) {
            System.out.println("Water Usage: Moderate");
            System.out.println("Status: Use water carefully.");
        } else {
            System.out.println("Water Usage: High");
            System.out.println("Status: Reduce water consumption!");
        }

        sc.close();
    }
}
