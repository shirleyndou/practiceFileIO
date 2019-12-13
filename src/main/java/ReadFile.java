import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {
            File read = new File("filename.txt");
            Scanner reader = new Scanner(read); //put the file in the scanner
            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}