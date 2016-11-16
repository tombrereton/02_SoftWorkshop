package Ex1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by TomBrereton on 3/11/2016.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> names;

        int n = 10;
        int i = n;

        Pattern p = Pattern.compile("[0-10]");


        Scanner s = new Scanner(System.in);
        String text = s.nextLine();

        Matcher matcher = p.matcher(text);
        boolean matches = matcher.matches();

        if(matches){
            System.out.println("horray");
        }

//        System.out.println(number);

        System.out.println(n);
        System.out.println(i);

        i--;

        System.out.println(n);
        System.out.println(i);

        int x = 0;
        if (x > 0) {
            System.out.println("1");
        } else if (x <= 0) {
            System.out.println("2");
        } else if (x == 0) {
            System.out.println("3");
        }
    }
}
