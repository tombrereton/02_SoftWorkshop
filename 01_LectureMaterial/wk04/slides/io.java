import java.io.*;

public static void main(String[] args) {   
    try {
        String readString,writeString;
        BufferedReader in =  
            new BufferedReader(new FileReader("test1.in"));
        BufferedWriter out = 
            new BufferedWriter(new FileWriter("test1.out"));
        int counter = 0;
        while ((readString = in.readLine()) != null) {
            System.out.println(readString);
            counter++;
            out.write(counter + " " + readString + "\n");
        }
        in.close();
        out.close();
    } 
    catch (IOException e) {
        System.out.println("File not found.");
    }
}
