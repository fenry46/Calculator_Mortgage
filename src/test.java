import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Byte MONTHS_IN_YEAR = 12;
        Byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        Integer principal = scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        float rate = scanner.nextFloat();
        float monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years) ");
        byte year = scanner.nextByte();
        int numberOfPayments = year * MONTHS_IN_YEAR;

        double calculation = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String result = NumberFormat.getCurrencyInstance().format(calculation);
        System.out.println(result);

    }

}
