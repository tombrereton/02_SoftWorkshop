import java.io.*;
import java.net.URL;
String s = "https://canvas.bham.ac.uk/courses/21955";
try {
    URL url = new URL(s);       
    BufferedReader in = 
        new BufferedReader(new 
            InputStreamReader(url.openStream()));
    BufferedWriter out = 
        new BufferedWriter(new FileWriter("test1.html"));
...
    in.close();
    out.close();
}
catch (IOException e) {
    System.out.println("no access to URL: " + s);
}
