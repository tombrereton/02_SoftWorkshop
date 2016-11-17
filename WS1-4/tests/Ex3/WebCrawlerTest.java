package Ex3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * This is a class called WebCrawlerTest which
 * test the WebCrawler class
 *
 * @author Thomas Brereton
 * @version 2016.11.15
 */
public class WebCrawlerTest {

    // SET UP

    private String url;
    WebCrawler w = new WebCrawler();
    String testURL1 = "http://www.cs.bham.ac.uk/~mmk/teaching/java/test.html";
    String testURL2 = "http://www.cs.bham.ac.uk/people/";

    String url1 = "<a href=\"http://www.cs.bham.ac.uk\">Computer Science</a>";
    String url2 = "<a href=\"http://www.cs.bham.ac.uk\">Computer Science</a> hello asdsad <a href=\"http://www.cs.pulteney.ac.uk\">Computer Engineering</a>";

    // TESTS

    @Test
    public void webCrawlerTest1() {
        String[] expected = {"http://www.cs.bham.ac.uk"};

        assertArrayEquals("String should be parsed to url", expected, w.extractURL(url1));
    }

    @Test
    public void webCrawlerTest2() {
        String[] expected = {"http://www.cs.bham.ac.uk/", "http://www.eps.bham.ac.uk/",
                "http://www.bham.ac.uk", "https://canvas.bham.ac.uk/courses/21955"};

        assertArrayEquals("HTML should be parsed to get hrefs", expected, w.collectUrls(testURL1).toArray());
    }

    @Test
    public void webCrawlerTest3() {
        String[] expected = {"http://www.cs.bham.ac.uk", "http://www.cs.pulteney.ac.uk"};

        assertArrayEquals("String should be parsed to url", expected, w.extractURL(url2));
    }

    @Test
    public void webCrawlerTest4() {
        String[] expected = {"http://en.wikipedia.org/wiki/Levenshtein_distance",
                "https://ews.cs.bham.ac.uk/directory/",
                "/people/category/hos",
                "/people/category/admissions",
                "/people/category/business",
                "/people/category/academic",
                "/people/category/research",
                "/people/category/honorary",
                "/people/category/researchstudent",
                "/people/category/aor",
                "/people/category/clerical",
                "/people/category/computing",
                "tel:441214143344",
                "tel:441214143744"};

        assertArrayEquals("String should be parsed to url", expected, w.collectUrls(testURL2).toArray());
    }

}