/**
 * This program computes the area of a
 * circle and prints it to screen.
 * @author Tom Brereton
 * @version 2016-09-29
 */

public class ExerciseOne{

    // We create a method to calculate the area of a circle
    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){

        // We define the radius, ignoring units
        int radius = 5;

        // we call the calculateArea method and
        // assign it to a variable
        double circleArea = calculateArea(radius);

        // We print the computed area to screen
        System.out.println(circleArea);
    }
}
