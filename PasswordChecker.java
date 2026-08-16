import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        if (password.matches(".*[0-9].*")) {
            score++;
        }

        if (password.matches(".*[@#$%!].*")) {
            score++;
        }

        System.out.println("Password Score: " + score + "/4");

        if (score == 4) {
            System.out.println("Strong Password");
        }

        if (score == 3) {
            System.out.println("Good Password");
        }

        if (score <= 2) {
            System.out.println("Password needs improvement");
        }

        sc.close();
    }
}
