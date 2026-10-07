package exception;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        String data = "Hello\nWorld";

        // Resource automatically closed at the end of parentheses
        try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
