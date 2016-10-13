/**
 * This program converts imperial weight
 * to metric measurements.
 */

public class ExerciseTwo{

    public static void main(String[] args){

        // We define the imperial to metric conversions
        double TonToPounds = 2240;    
        double HundredweightToPounds = 112;    
        double QuarterToPounds = 28;    
        double StoneToPounds = 14;    
        double OunceToPounds = 1/16;    
        double DrachmToPounds = 1/256;    
        double GrainToPounds = 1/7000;    
        double PoundTokg = 0.45359237;    

        // We define the imperial measurements
        int stones = 11;
        int pounds = 6;

        // We sum the total amount of pounds
        double PoundWeight = (TonToPounds * tons + HundredweightToPounds * hundredweight + 
                QuarterToPounds * quarters + StoneToPounds * stones + OunceToPounds * ounce + 
                DrachmToPounds * drachm + GrainToPounds * grains + pounds);

        // We convert pounds into kilograms
        double kgWeight = PoundWeight * PoundTokg;

        // We print computed kilograms to screen
        System.out.println(kgWeight);
    }
}
