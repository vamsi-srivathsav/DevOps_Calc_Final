

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {


    public Calculator() {

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double num, num1, num2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose an option to perform an operation");
            System.out.print("1. Find factorial\n2. Square root\n3. Find power\n4. Find Natural Logarithm\n" +
                    "5. Exit\nEnter your option: ");
            int ch;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (ch) {
                case 1:
                    // factorial
                    System.out.print("Enter a number : ");
                    num = scanner.nextDouble();
                    System.out.println("Factorial of "+num+" is : " + calculator.findFactorial(num));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter a number : ");
                    num  = scanner.nextDouble();
                    System.out.println("Square root of "+num+" is : " + calculator.findSquareRoot(num));
                    System.out.println("\n");


                    break;
                case 3:
                    // power
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " raised to power "+num2+" is : " + calculator.findPower(num1, num2));
                    System.out.println("\n");
                    break;
                case 4:
                    // find natural log
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural log of "+num1+" is : " + calculator.findNaturalLog(num1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    System.out.println("\n");
                    return;
            }
        } while (true);
    }

    public double findFactorial(double num) {

        double result = fact(num);

        return result;
    }



    public double findSquareRoot(double num) {

        double result = Math.sqrt(num);

        return result;
    }


    public double findPower(double num1, double num2) {
        double result = Math.pow(num1,num2);
        return result;
    }

    public double findNaturalLog(double num) {
        double result = 0;
        try {

            if (num <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        return result;
    }
    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }


}