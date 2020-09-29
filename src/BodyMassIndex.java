import java.util.Scanner;

// Student: Dominick Hemphill
// Class: 2467
// Date: 02/01/2020
// Instructor: Barry Mesa

public class BodyMassIndex {

    // import scanner to accept user input
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // variables used to store user weight and height
        double lbs;
        double inches;

        // grab weight from user
        System.out.println("Input your weight in pounds.");
            lbs = input.nextDouble();
        // grab height from user
        System.out.println("Input your height in inches.");
            inches = input.nextDouble();

        // work our magic and return results
        System.out.println("Your BMI is " + calcBMI(lbs,inches));
        // return classification based on black magic worked
        System.out.println("Your BMI classifiaton is " + classification(calcBMI(lbs,inches)));
    }

    // method that calculates BMI using convertToKilograms() and convertToMeters() methods
    public static double calcBMI(double lbs, double inches){
        double bmi = convertToKilograms(lbs) / convertToMeters(inches)*2;
        return bmi;
    }

    // method used to convert user weight from pounds to kilograms #1st input from user
    public static double convertToKilograms(double lbs){
        double kilograms = lbs / 2.2046;
        return kilograms;
    }

    // method used to convert user weight from inches to meters #2nd input from user
    public static double convertToMeters(double inches){
        double meters = inches / 39.37;
        return meters;
    }

    // method used after calculation to return a user classification based on the results
    public static String classification(double bmi){
        if(bmi >= 30.0){
            return "Obese";
        } else if (bmi <= 29.99 && bmi >= 25.0){
            return "Overweight";
        } else if (bmi <= 24.99 && bmi >= 18.5){
            return "Normal";
        } else if (bmi <= 18.4 ){
            return "Underweight";
        } else {
            return "incorrect input";
        }
    }

}
