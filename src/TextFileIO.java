import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileIO  {
    private File file;
    private FileWriter fileWriter;
    private FileReader fileReader;

    public void readyFile(String path) throws IOException {
        file = new File(path);


        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public void writeString(String s) throws IOException {
        fileWriter = new FileWriter(file);

        fileWriter.write(s);

        fileWriter.close();
    }

    public char[] read() throws IOException {
        fileReader = new FileReader(file);

        int c;
        char [] output = new char[(int) file.length()];
        for(int i = 0;(c=fileReader.read())!=-1; i++)
            output[i] = (char)c;

        fileReader.close();

        return output;
    }

    public static void main(String[] args) {

    }


}
