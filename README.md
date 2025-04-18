Aastha Chordia
23070126003
Aiml A1

Java Calculator Application 

A calculator application written in Java with each operation in its own file.

File Structure

- Main.java : Main class to run the calculator
- CalculatorOperation.java : Interface for all operations
- Addition.java : Addition operation
- Subtraction.java : Subtraction operation
- Multiplication.java : Multiplication operation
- Division.java : Division operation
- Square.java : Square operation
- Cube.java : Cube operation
- SquareRoot.java : Square root operation

Features

Each operation is implemented as a separate class implementing the CalculatorOperation interface:

1. Addition : Adds two numbers
2. Subtraction : Subtracts second number from first
3. Multiplication : Multiplies two numbers
4. Division : Divides first number by second (with zero division check)
5. Square : Calculates square of a number
6. Cube : Calculates cube of a number
7. Square Root : Calculates square root of a number (with negative input check)

Exception Handling

The application handles several exceptions:
- InputMismatchException : When user enters non-numeric input
- ArithmeticException : For division by zero
- IllegalArgumentException : For square root of negative numbers
- Exception : handling for unexpected errors
