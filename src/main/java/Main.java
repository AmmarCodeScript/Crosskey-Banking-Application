import java.util.Scanner;

public class Main {

    private static final double APP_VERSION = 1.0;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Loan app version " + APP_VERSION);
        new Main().start();
    }

    public void start() {
        System.out.println("****************************************************************************************************");

        String name = getInputString("Name: ");
        double borrow = getInputDouble("Loan amount: ");
        double years = getInputDouble("Amount of years: ");
        double rate = getInputDouble("Amount of rate: ");

        System.out.println("****************************************************************************************************");
        System.out.printf("Prospect 1: %s wants to borrow %.2f EUR for a period of %.1f years and pay %.2f EUR each month.%n", name, borrow, years, Mortgage.getMonthlyPayment(borrow, rate, years));
        System.out.printf("****************************************************************************************************");
    }

    public String getInputString(String question) {
        String input;
        while (true) {
            System.out.print(question);
            input = scan.nextLine();
            if (input.length() > 0) {
                break;
            }
        }
        return input;
    }

    public double getInputDouble(String question) {
        String input;
        while (true) {
            System.out.print(question);
            input = scan.nextLine();
            if (Utils.isDouble(input)) {
                break;
            }
            System.out.println("Please enter a number as an integer!");
        }
        return Double.parseDouble(input);
    }
}
