package HWCh4;
/*
 * Class:AdditionCalculator
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.12.1
 * @written on:10/17/2024
 * Course:ITEC-2150-01
 * This a class program a prompt the user to enter 2 integers, then adds the numbers and prints the results .
 * */
import java.util.Scanner;  // Import the Scanner class for user input

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        int num1 = 0, num2 = 0;

        // Try to get the first number from the user
        try {
            System.out.print("Enter the first integer: ");
            num1 = Integer.parseInt(scanner.nextLine());  // Read input and convert to integer
        } catch (NumberFormatException e) {
            System.out.println("Error: You did not enter a valid integer.");
            return;  // Exit if the input is invalid
        }

        // Try to get the second number from the user
        try {
            System.out.print("Enter the second integer: ");
            num2 = Integer.parseInt(scanner.nextLine());  // Read input and convert to integer
        } catch (NumberFormatException e) {
            System.out.println("Error: You did not enter a valid integer.");
            return;  // Exit if the input is invalid
        }

        // Perform the addition and display the result
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);  // Output the result
    }
}
