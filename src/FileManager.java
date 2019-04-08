import java.io.File;
import java.io.IOException;

public class FileManager {


    public static void main(String[] args) throws IOException {

        // file takes a string input as an existing path
        File existingFile = new File("here");

        // if there is no file named that you can create the file
        existingFile.createNewFile();

        // if the input argument path string doesn't exists you can create it like below
        File notExistingFile = new File("my-directory");
        notExistingFile.mkdir();

        // you can create  not existing multiple directories like:
        File notExistingFiles = new File("D:/hello/im/good/guy");
        notExistingFiles.mkdirs();

        // accessing directories tree
        String [] list = notExistingFiles.list();

        for (String item: list) {

            System.out.println(item);
        }




    }
}
