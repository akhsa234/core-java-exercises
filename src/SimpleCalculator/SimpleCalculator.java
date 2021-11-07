package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        String z = scanner.nextLine();//TODO ???
        long y = scanner.nextLong();
        System.out.println(f(x, y));
    }

    public static double f(long x, long y) {
        switch (z) {
            case "subtract":
                subtractTwoNumbers(x, y);
                break;
            case "sum":
                sumTwoNumbers(x, y);
                break;
            case "divide":
                divideTwoNumbers(x, y);
                break;
            case "divide":
                multiplyTwoNumbers(x, y);
                break;
            default:
                System.out.println("Invalid !");
        }
    }

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
        }

    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Division by 0!");
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }

}
