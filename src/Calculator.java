import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        // initialize Scanner object
        Scanner input = new Scanner(System.in);

        double firstDouble = 0;
        double secondDouble = 0;
        double answer = 0;
        String operator = "";
        boolean validFirstNum = false;
        boolean validOperator = false;
        boolean validSecondNum = false;

        // get first operator - will loop until a valid number was entered


        System.out.println("Please enter a number: ");

        while (!validFirstNum) {
            if (input.hasNextDouble()) {
                firstDouble = input.nextDouble();
                validFirstNum = true;
            } else {
                input.nextLine();
                System.out.println("Please enter a valid number: ");
            }
        }


        // get operator

        while (!validOperator) {
            System.out.println("Please enter an operation (+ - * /): ");
            operator = input.next();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                validOperator = true;
            }
        }


        // get second operand, will loop until number is valid

        System.out.println("Please enter a second number: ");

        while (!validSecondNum) {
            if (input.hasNextDouble()) {
                secondDouble = input.nextDouble();
                validSecondNum = true;
            } else {
                input.nextLine();
                System.out.println("Please enter a valid number: ");
            }
        }


        // compute answer and display

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


        System.out.println("Your answer is: " + answer);

    }
}
