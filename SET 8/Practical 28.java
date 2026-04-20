**AIM**
  /*Write a Java program that reads a text file named data.txt. The program should count and display: 
The total number of lines, The total number of words, The total number of characters (excluding 
spaces and newline characters), Use FileReader / BufferedReader for reading the file.  Handle 
exceptions like FileNotFoundException and IOException. */

  import java.io.*;

public class DataFileCount {
    public static void main(String[] args) {

        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lines++;

               
                String w[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    words += w.length;

               
                chars += line.replaceAll(" ", "").length();
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (without spaces): " + chars);

            br.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
