package HWCh4;
/**
 * Class:TriangleTest
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.12.3
 * @written on:10/18/2024
 * Course:ITEC-2150-01
 * This a class checks that the triangle exception works .
 * */

public class TriangleTest {
    public static void main(String[] args) {
        // A valid triangle
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            if (triangle1.checkSides()) {
                System.out.println("Triangle 1 is valid.");
            }
        } catch (IllegalTriangleSideException e) {
            System.out.println(e.getMessage());
        }

        // An invalid triangle
        try {
            Triangle triangle2 = new Triangle(1, 2, 10);  // This should fail the triangle inequality rule
            if (triangle2.checkSides()) {
                System.out.println("Triangle 2 is valid.");
            }
        } catch (IllegalTriangleSideException e) {
            System.out.println(e.getMessage());  // This should print an error message
        }

        //  Another invalid triangle
        try {
            Triangle triangle3 = new Triangle(5, 1, 1);  // This should also fail the triangle inequality rule
            if (triangle3.checkSides()) {
                System.out.println("Triangle 3 is valid.");
            }
        } catch (IllegalTriangleSideException e) {
            System.out.println(e.getMessage());  // This should print an error message
        }
    }

}
