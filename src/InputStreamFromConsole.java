import java.io.IOException;

public class InputStreamFromConsole {
    // number of bytes to read from console
    private int byteSize;

    // byte array to holding input bytes
    private byte[] byteArray;

    // constructor for class to initialize the array
    InputStreamFromConsole(int bytes){
        byteSize = bytes;
        byteArray = new byte[bytes];
    }

    public String readBytesAndConvertToString() {

        // reading an writing streams need to be surrounded with a try catch block
        // more information on java exceptions will discuss in class
        try {


            // reading bytes via java's input stream from console and streams in to byte array
            System.in.read(byteArray);


        } catch (IOException e) {
            e.printStackTrace();
        }

        // passing a byte array to The String class constructor
        // this constructor converts byte array to string
        String output = new String(byteArray);

        return output;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public static void main(String[] args) {

        // reading single byte from console
//        int b = 0;
//
//        // reading an writing streams need to be surrounded with a try catch block
//        // more information on java exceptions will discuss in class
//        try {
//
//            b = System.in.read();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println((char)b);


////
//
        InputStreamFromConsole input = new InputStreamFromConsole(256);
//
        String reads = input.readBytesAndConvertToString();
//
//
//        // reading streams in to byte array and convert it to string
//        System.out.println(reads);

        // writing to console by output streams
        try {
            System.out.write(input.getByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
