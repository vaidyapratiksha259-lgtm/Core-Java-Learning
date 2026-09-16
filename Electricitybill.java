public class ElectricityBill {
    public static void main(String[] args) {

        int units = 245;

        double bill = (units <= 100) ? units * 3.50 :
                      (units <= 200) ? units * 5.00 :
                      units * 7.50;

        System.out.println("Electricity Units: " + units);
        System.out.println("Total Electricity Bill: ₹" + bill);
    }
}
