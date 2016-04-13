import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        // initialize Scanner object
        Scanner input = new Scanner(System.in);

        double firstDouble = 0;
        double secondDouble = 0;
        double answer = 0;
        String operator;
        boolean validFirstNum = false;
        boolean validOperator = false;
        boolean validSecondNum = false;

        // get first operator - will loop until a valid number was entered

        System.out.println("Please enter a number: ");

        while(!validFirstNum) {
            if (input.hasNextDouble()) {
                firstDouble = input.nextDouble();
                validFirstNum = true;
            }
        }


        // get operator
        do {
            System.out.print("Please enter an operation (+ - * / ");
            operator = input.nextLine();
        } while(!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")));



        // make sure user entered a valid operation

        // get second operand
        System.out.print("Please enter a second number: ");
        String secondNumber = input.nextLine();

        try {
            secondDouble = Double.parseDouble(secondNumber);
        } catch (NumberFormatException e){
            System.out.println("Please provide a valid number: ");
        }

        // if so, compute answer

        if(operator.equals("+")){
            answer = firstDouble + secondDouble;
        } else if(operator.equals("-")){
            answer = firstDouble - secondDouble;
        } else if(operator.equals("*")){
            answer = firstDouble * secondDouble;
        } else if(operator.equals("/")){
            answer = firstDouble / secondDouble;
        } else{
            System.out.println("I'm sorry, that does not appear to be a valid operation.");
        }










        System.out.println("Your answer is: " + answer);


    }
}
