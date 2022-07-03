import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number : ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0) {
            System.out.println("buzz");
        } else if (number % 5 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println(number);
        }
    }
}
