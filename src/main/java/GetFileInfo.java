import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {
        File file = new File("filename.txt");
        if(file.exists()) //checking if the file exists
        {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path name: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length() + "bytes");
        }
        else{
            System.out.println("File does not exists");
        }
    }
}

