import java.util.Scanner;

public class StudyPerformance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your study hours per day: ");
        double hours = sc.nextDouble();

        if (hours < 0) {
            System.out.println("Invalid study hours.");
        } 
        else if (hours == 0) {
            System.out.println("No study today.");
        } 
        else if (hours < 2) {
            System.out.println("Needs improvement: Try studying at least 2 hours.");
        } 
        else if (hours < 4) {
            System.out.println("Good effort: You are maintaining a decent routine.");
        } 
        else if (hours < 6) {
            System.out.println("Excellent: You have a strong study routine!");
        } 
        else {
            System.out.println("Very high study hours: Remember to take regular breaks.");
        }

        sc.close();
    }
}
