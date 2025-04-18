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
               
