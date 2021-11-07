package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter operand1 operand2 and operator one by one");

        long operand1 = scanner.nextLong();
       // String z = scanner.nextLine();//TODO ???
        long operand2 = scanner.nextLong();
        char operator = scanner.next().charAt(0);

        long result = 0;



        switch (operator) {
            case '-' :
                subtractTwoNumbers(operand1, operand2);
                break;
            case '+':
                sumTwoNumbers(operand1, operand2);
                break;
            case '/':
                divideTwoNumbers(operand1, operand2);
                break;
            case '*':
                multiplyTwoNumbers(operand1, operand2);
                break;
            default:
                System.out.println("illegal operand !");
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
