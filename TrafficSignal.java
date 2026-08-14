import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic signal color: ");
        String signal = sc.nextLine().toLowerCase();

        if (signal.equals("red")) {
            System.out.println("STOP - Wait for the signal to change.");
        }
        else if (signal.equals("yellow")) {
            System.out.println("READY - Slow down and prepare to stop.");
        }
        else if (signal.equals("green")) {
            System.out.println("GO - You may proceed safely.");
        }
        else if (signal.equals("flashing red")) {
            System.out.println("STOP and proceed only when it is safe.");
        }
        else {
            System.out.println("Invalid signal color entered.");
        }

        sc.close();
    }
}
