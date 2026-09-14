import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Ticket: Free");
        } 
        else if (age <= 12) {
            System.out.println("Ticket Price: ₹80");
        } 
        else if (age <= 18) {
            System.out.println("Ticket Price: ₹120");
        } 
        else if (age <= 59) {
            System.out.println("Ticket Price: ₹180");
        } 
        else if (age <= 100) {
            System.out.println("Ticket Price: ₹100");
        } 
        else {
            System.out.println("Invalid age entered!");
        }

        sc.close();
    }
}