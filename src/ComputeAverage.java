import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user to enter a radius
        System.out.println("Enter three numbers");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // compute average
        double average = (number1 + number2 + number3);
        // Display results
        System.out.println("The average for the circle of  "
                + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
