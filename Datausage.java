import java.util.Scanner;

public class DataUsage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data used in GB: ");
        double gb = sc.nextDouble();

        if (gb <= 1) {
            System.out.println("Usage Level: Very Low");
        } 
        else if (gb <= 5) {
            System.out.println("Usage Level: Low");
        } 
        else if (gb <= 15) {
            System.out.println("Usage Level: Moderate");
        } 
        else if (gb <= 30) {
            System.out.println("Usage Level: High");
        } 
        else {
            System.out.println("Usage Level: Very High");
        }

        sc.close();
    }
}