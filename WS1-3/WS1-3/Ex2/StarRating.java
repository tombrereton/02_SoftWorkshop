package Ex2;

/**
 * A class which interprets a 'star' rating
 * The interpretation are take from the xkcd comic
 * found at xkcd.com/1098/
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class StarRating {

    /**
     * Method to check if the rating is between, and including, 1 and 5
     *
     * @param number (type double) number to check if it is within specified range
     * @param lower  (type double) lower bound of range
     * @param upper  (type double) upper bound of range
     * @return Boolean, return true if number is between 1 and 5
     */
    public static boolean isInRange(double number, double lower, double upper) {
        return lower <= number && number < upper;
    }

    /**
     * This method takes a rating (type double) as input and returns
     * the interpretations of it according to the comic found at
     * xkcd.com/1098/
     * <p>
     * The ratings are:
     * 1 = crap,
     * 4 = ok,
     * 4.5 = excellent,
     * 5 = has only one review
     *
     * @param rating a double which is a rating out of 5
     * @return String, the interpretation of the rating (i.e. 4 = "OK")
     */
    public static String interpret(double rating) {
        if (isInRange(rating, 0, 4.0)) {
            return "CRAP";
        } else if (isInRange(rating, 4.0, 4.5)) {
            return "OK";
        } else if (isInRange(rating, 4.5, 5.0)) {
            return "EXCELLENT";
        } else if (rating >= 5.0) {
            return "[HAS ONLY ONE REVIEW]";
        } else {
            return "not rated";
        }
    }
}
