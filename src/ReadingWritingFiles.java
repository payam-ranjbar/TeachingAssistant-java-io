import java.io.*;
import java.util.ArrayList;

public class ReadingWritingFiles {

    private FileInputStream fileIn;
    private FileOutputStream fileOut;

    private File file;

    public ReadingWritingFiles(){

    }



    public void readyFile(String path) throws IOException {
        file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }
    }


    public void writeBytesDirectly() throws IOException {

        // writing bytes directly
        fileOut = new FileOutputStream(file);
        fileOut.write(32);
        fileOut.close();

    }

    public void writeString(String toWrite) throws IOException {

        fileOut = new FileOutputStream(file);

        // for append to file use this instead
//        fileOut = new FileOutputStream(file, true);


        // converting string to byte array
        byte [] bytesOfString = toWrite.getBytes();

        fileOut.write(bytesOfString);
        fileOut.close();
    }

    public byte[] readBytes() throws IOException{
        fileIn = new FileInputStream(file);
        int holder;
        byte [] bytes = new byte[(int) file.length()];

        for(int i = 0;(holder = fileIn.read()) != -1; i++) {
           bytes[i] = (byte) holder;
        }
        fileIn.close();
        return bytes;
    }
    public String  readBytesToString() throws IOException {
        fileIn = new FileInputStream(file);
        int holder;
        ArrayList<Character> result = new ArrayList<>();
        while ((holder = fileIn.read()) != -1) {
                result.add((char) holder);
        }

        String output = "";

        for (Character c: result ) {
            output += (char)c;
        }

        fileIn.close();
        return output;

    }

    public static void main(String[] args) throws IOException {
        ReadingWritingFiles IOManager = new ReadingWritingFiles();
        IOManager.readyFile("hello.txt");
        IOManager.writeString("lorem ipsum");

        String s = IOManager.readBytesToString();
        System.out.println(s);

    }



}
