package FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name to create: ");
        String filename = scanner.nextLine();
        System.out.println("Enter data to write into file: ");
        String data = scanner.nextLine();
        createFile(filename, data);
        System.out.println("Enter line number to search (starting from 1): ");
        int lineNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.println("Enter character position to search (starting from 0): ");
        int charPosition = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.println("Enter character to search: ");
        char searchChar = scanner.nextLine().charAt(0);
        
        // Count the occurrences of the search character in the file
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == searchChar) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Occurrences of " + searchChar + " in the file: " + count);
        
        // Prompt the user for which occurrence they want to retrieve
        int occurrence = 2; // replace with the occurrence number the user wants
        System.out.println("Retrieving occurrence " + occurrence + " of " + searchChar + "...");
        
        // Read the data from the file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int currentLine = 1;
            int currentChar = 0;
            boolean found = false;
            StringBuilder output = new StringBuilder();
            while ((line = br.readLine()) != null && !found) {
                if (currentLine == lineNumber) {
                    for (int i = 0; i < line.length(); i++) {
                        if (currentChar == charPosition && line.charAt(i) == searchChar) {
                            occurrence--;
                            if (occurrence == 0) {
                                found = true;
                                break;
                            }
                        }
                        currentChar++;
                    }
                    output.append(line.substring(charPosition));
                    while ((line = br.readLine()) != null) {
                        output.append(line);
                    }
                    break;
                }
                currentLine++;
                currentChar = 0;
            }
            System.out.println("Data found: " + output.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void createFile(String filename, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
