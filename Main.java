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
                    
