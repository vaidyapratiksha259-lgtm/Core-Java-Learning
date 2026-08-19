import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (1-Car, 2-Bike): ");
        int type = sc.nextInt();

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        double fee;

        if (type == 1) {                 // Car
            if (hours <= 2) {
                fee = 30;
            } else {
                if (hours <= 5) {
                    fee = 60;
                } else {
                    fee = 100;
                }
            }
        } 
        else if (type == 2) {            // Bike
            if (hours <= 2) {
                fee = 10;
            } else {
                if (hours <= 5) {
                    fee = 25;
                } else {
                    fee = 40;
                }
            }
        } 
        else {
            System.out.println("Invalid vehicle type!");
            return;
        }

        System.out.println("Parking Fee = ₹" + fee);
    }
}
