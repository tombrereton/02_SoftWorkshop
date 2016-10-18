/**
 * Created by TomBrereton on 14/10/2016.
 */
public class SumOdd {

    public static int sumOdd(int n) {
        int sumOdd = 0;

        for(int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
//                sumOdd += 2 * i + 1;
            }
        }

        return sumOdd;
    }
}
