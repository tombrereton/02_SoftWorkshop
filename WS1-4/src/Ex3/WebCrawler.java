package Ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * This is a class called WebCrawler.
 * It contains methods to extract hyperlinks
 * from URLs
 *
 * @author Thomas Brereton
 * @version 2016.11.15
 */
public class WebCrawler {


    /**
     * We use a method to extract all href links from
     * a line of text. Note, a line of text can contain more than 1
     * href link.
     *
     * @param lineOfText a line of text of type string which we extract hrefs from
     * @return a String array containing href links
     */
    public static String[] extractURL(String lineOfText) {

        // We split the line of text where "<a href" occurs
        String[] tempTextArray = lineOfText.split("<a href");

        // We create an array which stores all the href links.
        // We know that the number of links is half of the number of
        // array split by "<a href"
        String[] tempURLs = new String[tempTextArray.length / 2];
        int i = 0;

        // We loop over the length of tempURLs and store the href link(s)
        // into tempURLs.
        // Loop invariant: for i, tempURLs[i] will contain half of the elements
        // tempTextArray[i], or 0
        while (i < tempURLs.length) {

            // We take every second element of tempTextArray,
            // take the substring of that element starting at index 2 (3rd element),
            // and split that element where the quotation (") exists.
            // We can take the first element as we truncated the first quotation
            // with substring(2). We then assign this to the ith element of
            // tempURLs.
            tempURLs[i] = tempTextArray[2 * i + 1].substring(2).split("\"")[0];
            i++;
        }

        return tempURLs;
    }

    /**
     * We use a method to parse a url and return an
     * ArrayList of url strings
     *
     * @param urlString a url, or web address, of type string
     * @return An ArrayList of url gathered from web crawling
     */
    public static ArrayList<String> collectUrls(String urlString) {
        String readString = null;
        ArrayList<String> tempURLs = new ArrayList<String>();

        // We use try/catch to account for input/output exceptions
        try {

            // We create a URL object with the urlString
            URL url = new URL(urlString);

            // We create a BufferedReader to read the text at
            // the location of the url
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            // We loop over each line at the location of the url
            // and extract any links in the line of text
            // Loop invariant: for each loop, readString equals
            // the line of text at the location of the url
            while ((readString = in.readLine()) != null) {

                // We loop over each url in the line of text and
                // add it the the tempURLs arrayList, which we return
                // Loop invariant: tempURLs has length equal to the number
                // of links in the url text up to that point
                for (String s : extractURL(readString)) {
                    tempURLs.add(s);
                }
            }
            in.close();

        // We catch and handle any input/output exceptions
        } catch (IOException e) {
            System.out.println(String.format("No access to URL: %s", urlString));
        }

        return tempURLs;
    }

}
