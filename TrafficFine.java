import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();

        int fine;

        if (speed <= 40) {
            fine = 0;
        } 
        else if (speed <= 60) {
            fine = 500;
        } 
        else if (speed <= 80) {
            fine = 1000;
        } 
        else if (speed <= 100) {
            fine = 2000;
        } 
        else {
            fine = 5000;
        }

        System.out.println("Traffic Fine = ₹" + fine);

        sc.close();
    }
}
