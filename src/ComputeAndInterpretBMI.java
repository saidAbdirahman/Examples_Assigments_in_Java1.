import java.util.*;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter weight in pounds
        System.out.println("Enter weight in pounds");
        double weight = input.nextDouble();

        // prompt the user to enter weight in inches
        System.out.println("Enter height in inches");
        double height = input.nextDouble();

        final double KILOGRAM_PER_POUND = 0.45359237; // constant
        final double METER_PER_INCH = 0.0254; // constant

        // Compute bmi
        double weightInKilogram = weight * KILOGRAM_PER_POUND;
        double heightInMeters = height * METER_PER_INCH;

        double bmi = weightInKilogram /( heightInMeters * heightInMeters );

        //Display result
        System.out.println("Bmi is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Over weight");
        else
            System.out.println("obase");

    }
}
