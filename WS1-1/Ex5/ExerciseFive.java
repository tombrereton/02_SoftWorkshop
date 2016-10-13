/**
 * This program takes user input in time format hh:mm.
 * Then, imagining an analogue clock, it calculates the
 * angle from the hour to minute hand, in an anti-clockwise
 * direction. This is done by calculating the difference 
 * of the angles for each of the clock hands.
 * @version 2016-09-30
 * @author Thomas Brereton
 */


public class ExerciseFive{

    // We make the class return an integer to truncate the decimal values
    public static int angleBetweenHands(int hourhand, int minutehand){

        // We find the angles of the clock hands 
        int hoursToDegrees = (hourhand * 30);
        int minutesToDegrees = (minutehand * 6);

        // We find how much the hour hand moves for each minute
        int hoursPlusMinutes = minutehand / 2 + hoursToDegrees;

        System.out.println("hours:minutes" + hoursPlusMinutes + ":" + minutesToDegrees);

        // We calculate the angle between the clock hands
        if (minutesToDegrees > hoursPlusMinutes){
            return 360 - (minutesToDegrees - hoursPlusMinutes);
        } else {
            return  hoursPlusMinutes - minutesToDegrees;
        }
    }

    public static void main(String[] args){
        // We split the input into separate variables
        // to perform calculations later
        String[] totalTimeParts = args[0].split(":");

        // We keep the hours and minutes within their max value
        // (12 and 60 respectively)
        // @param hours is hour hand
        // @param minutes is minute hand
        int hours = Integer.parseInt(totalTimeParts[0]) % 12;
        int minutes = Integer.parseInt(totalTimeParts[1]) % 60;

        // We print the input to check it
        System.out.println("Time is: " + hours + ":" + minutes);

        int clockHandAngle = angleBetweenHands(hours, minutes);

        // We print the angle to the terminal
        System.out.println("Difference between hours and mintutes: " + clockHandAngle);
    }
}
