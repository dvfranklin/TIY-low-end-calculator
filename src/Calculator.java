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

        // infinite while loop, requires user to ctrl+c to break
        while(true) {

            // get first operator - will loop until a valid number was entered

            System.out.println("Please enter a number: ");

            while (!validFirstNum) {
                if (input.hasNextDouble()) {
                    firstDouble = input.nextDouble();
                    validFirstNum = true;
                } else {
                    System.out.println("Please enter a valid number: ");
                    input.nextLine();

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
                    System.out.println("Please enter a valid number: ");
                    input.nextLine();
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
            }


            System.out.println("Your answer is: " + answer);
            System.out.println();

            validFirstNum = false;
            validSecondNum = false;
            validOperator = false;
        }
    }
}
