import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Byte MONTHS_IN_YEAR = 12;
        Byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate : ");
            float rate = scanner.nextFloat();
            if (rate > 0 && rate <= 30) {
                monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than 30");
        }

        while (true) {
            System.out.print("Period (Years) ");
            byte year = scanner.nextByte();
            if (year > 0 && year <= 30) {
                numberOfPayments = year * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than 30");

        }

        double calculation = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String result = NumberFormat.getCurrencyInstance().format(calculation);
        System.out.println(result);

    }

}
