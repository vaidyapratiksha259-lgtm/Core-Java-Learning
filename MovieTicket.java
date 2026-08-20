import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter show type (1-Morning, 2-Evening): ");
        int show = sc.nextInt();

        double price;

        if (age < 18) {
            if (show == 1) {
                price = 100;
            } else {
                price = 130;
            }
        } else {
            if (show == 1) {
                price = 150;
            } else {
                price = 200;
            }
        }

        System.out.println("Ticket Price = ₹" + price);
    }
}
