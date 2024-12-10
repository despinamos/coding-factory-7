package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Reads from a file data like:
 * 'όνομα, επώνυμο, πόλη'
 * separated by comma and space
 * and formats the data in json format.
 */
public class NameScanning {
    public static void main(String[] args) {
        String inFilePath = "C:/Users/Despoina/Downloads/names.txt";
        String outFilePath = "C:/Users/Despoina/Downloads/names-formatted.txt";
        String line;
        String[] tokens;

        try(BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\", \n }", tokens[0], tokens[1], tokens[2]);
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);
            }

        } catch (IOException e) {
            System.err.println("Error." + e.getMessage());
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\", \n }", tokens[0], tokens[1], tokens[2]);
    }
}
