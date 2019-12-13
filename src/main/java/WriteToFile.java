import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try{

            FileWriter writer = new FileWriter("filename.txt");
            writer.write("File in java"); //this is how you write to a file
            writer.close(); //After writing to the file, you close it
            System.out.println("File successfully writen");

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
