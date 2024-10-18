package HWCh4;
/**
 * Class:Array
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.12.2
 * @written on:10/17/2024
 * Course:ITEC-2150-01
 * This a class Prompt the user to enter an index and prints the corresponding array value .
 * */
import java.util.Scanner;//Import Scanner for user input

import java.util.Random;// Import Random class for generating random numbers
public class Array {
    public static void main(String[] args) {
        // Create an array of 50 double values
        double[] array = new double[50];
        Random random = new Random();

        // Fill the array with random double values between 0 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 * random.nextDouble();  // Generate random doubles between 0 and 100
        }

        // Prompt the user to enter an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-49): ");

        //  Handle the exception when accessing the array
        try {
            int index = Integer.parseInt(scanner.nextLine());  // Convert input to an integer
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Print an error message if the index is out of bounds
            System.out.println("Error: Index is out of range. Please enter a number between 0 and 49.");
        } catch (NumberFormatException e) {
            // Handle case where input is not an integer
            System.out.println("Error: Please enter a valid integer.");
        }
    }

}
