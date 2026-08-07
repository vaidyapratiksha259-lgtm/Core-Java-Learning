import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = sc.nextInt();

        if (temp >= 0 && temp <= 10) {
            System.out.println("Very Cool");
        } else if (temp > 10 && temp <= 20) {
            System.out.println("Cold but Pleasant");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Normal Temperature");
        } else if (temp > 30 && temp <= 40) {
            System.out.println("Warm");
        } else {
            System.out.println("Very Hot");
        }
    }
}
