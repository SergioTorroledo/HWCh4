package HWCh4;
/**
 * Class:Triangle
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.12.3
 * @written on:10/18/2024
 * Course:ITEC-2150-01
 * This a class  makes an exception for a triangle when this one doesn't meet the criteria the exception would let the user know that the triangle is invalid .
 * */
//  Create custom exception
class IllegalTriangleSideException extends Exception {
    public IllegalTriangleSideException(String message) {
        super(message);  // Pass message to the Exception class
    }
}

//  Create Triangle class
class Triangle {
    private double side1, side2, side3;

    // Constructor to initialize the three sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //  Method to check if the sides meet the triangle inequality rules
    public boolean checkSides() throws IllegalTriangleSideException {
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            return true;  // All conditions satisfied
        } else {
            // Throw exception if any condition is violated
            throw new IllegalTriangleSideException("Invalid triangle sides: The sum of two sides must be greater than the third side.");
        }
    }
}




