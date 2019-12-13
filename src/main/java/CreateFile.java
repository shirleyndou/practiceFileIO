import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try{

            //File obj = new File("/home/recruit/filename.txt"); //file is created in a specific path/directory
            File obj = new File("filename.txt"); //create an object for your file
            if(obj.createNewFile()) //checking if the file was created
            {
                System.out.println("File created: " + obj.getName()); //gets outputted if file wa successfully created
            }else
            {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
