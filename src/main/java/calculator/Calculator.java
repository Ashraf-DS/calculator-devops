package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\nPress 5 to find max of two numbers\nPress 6 to find min of two numbers\nPress 7 to find sin of  numbers\nPress 8 to find cosine of  numbers\nPress 9 to find ceil of  numbers\nPress 10 to find floor of  numbers\n" +
                    "Press 11 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factoral(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.sqroot(number1));
                    System.out.println("\n");


                    break;
                case 3:
                    // find power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
              
                case 4:
                    // find natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    System.out.println("\n");

                    break;
                case 5:
                    // add the numbers
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Maximum of "+number1+ " and  "+number2+" is : " + calculator.maximum(number1, number2));
                    System.out.println("\n");
                    break;
                 
                case 6:
                    //min of numbers
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Minimum of "+number1+ " and  "+number2+" is : " + calculator.minimum(number1, number2));
                    System.out.println("\n");
                    break;

                case 7:
                    //sine of numbers
                    System.out.print("Enter the  number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("sine of "+number1+ " is : " + calculator.sine(number1));
                    System.out.println("\n");
                    break;


                case 8:
                    //cosine of numbers
                    System.out.print("Enter the  number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("cosine of "+number1+ " is : " + calculator.cosine(number1));
                    System.out.println("\n");
                    break;

                case 9:
                    //ceil of numbers
                    System.out.print("Enter the  number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("ceil of "+number1+ " is : " + calculator.ceilvalue(number1));
                    System.out.println("\n");
                    break;

                case 10:
                    //floor of numbers
                    System.out.print("Enter the  number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("floor of "+number1+ " is : " + calculator.floorvalue(number1));
                    System.out.println("\n");
                    break;



                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double factoral(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }



    public double sqroot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public double maximum(double number1, double number2) {
        logger.info("[MAXIMUM of - " + number1 + "and ] " + number2);
        double result = Math.max(number1,number2);
        logger.info("[RESULT - MAX] - " + result);
        return result;
    }
    
    public double minimum(double number1, double number2) {
        logger.info("[SUM of - " + number1 + "and ] " + number2);
        double result = Math.min(number1,number2);
        logger.info("[RESULT - MIN] - " + result);
        return result;
    }

    public double sine(double number1) {
        logger.info("[SINE of - " + number1 + "is ] " );
        double result = Math.sin(number1);
        logger.info("[RESULT - SINE] - " + result);
        return result;
    }

    public double cosine(double number1) {
        logger.info("[COSINE of - " + number1 + "is ] " );
        double result = Math.cos(number1);
        logger.info("[RESULT - COSINE] - " + result);
        return result;
    }

    public double ceilvalue(double number1) {
        logger.info("[CEIL of - " + number1 + "is ] " );
        double result = Math.ceil(number1);
        logger.info("[RESULT - CEIL] - " + result);
        return result;
    }

    public double floorvalue(double number1) {
        logger.info("[FLOOR of - " + number1 + "is ] " );
        double result = Math.floor(number1);
        logger.info("[RESULT - FLOOR] - " + result);
        return result;
    }



    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Throwing exception>>Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("Exception Catch - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}
