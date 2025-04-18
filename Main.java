/*
Name: Aastha Chordia
PRN: 23070126003
Batch: Aiml A1
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOperations calculator = new CalculatorOperations();
        
        System.out.println("Java Calculator");
         
        while (true) {
            
            // Display menu
            System.out.println("\nAvailable Operations:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
             try {
                System.out.print("\nEnter your choice (1-8): ");
                int choice = scanner.nextInt();
                 if (choice == 8) {
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    break;
                }
                double result = 0;
                double num1, num2;
                switch (choice) {
                 
                   case 1:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.addition(num1, num2);
                        break;
                   case 2:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.subtraction(num1, num2);
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.multiplication(num1, num2);
                        break;
                    case 4:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.division(num1, num2);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        result = calculator.square(num1);
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        result = calculator.cube(num1);
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        result = calculator.squareRoot(num1);
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 8.");
                        continue;
                    }
                
                System.out.println("Result: " + result);
                     
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.next(); // Clear the invalid input
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } 
