import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {

        // initialize Scanner object
        Scanner input = new Scanner(System.in);

        // initialize variables
        double firstDouble = 0;
        double secondDouble = 0;
        double answer = 0;

        // retrieve first operator as double
        System.out.println("Please enter a number: ");
        firstDouble = input.nextDouble();

        // retrieve operator as String
        System.out.println("Please enter an operation (+ - * /): ");
        String operator = input.next();

        // retrieve second operator as double
        System.out.println("Please enter a second number: ");
        secondDouble = input.nextDouble();

        // compute answer
        if (operator.equals("+")) {
            answer = firstDouble + secondDouble;
        } else if (operator.equals("-")) {
            answer = firstDouble - secondDouble;
        } else if (operator.equals("*")) {
            answer = firstDouble * secondDouble;
        } else if (operator.equals("/")) {
            answer = firstDouble / secondDouble;
        } else {
            System.out.println("I'm sorry, that does not appear to be a valid operation.");
        }

        // display answer
        System.out.println("Your answer is: " + answer);
    }
}
