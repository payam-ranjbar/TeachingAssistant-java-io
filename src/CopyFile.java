import java.io.*;

public class CopyFile {

    private File dstFile;
    private File orgFile;

    public void readyFiles(String dst, String org) throws IOException {

        dstFile = new File(dst);
        orgFile = new File(org);

        if (!dstFile.exists()) {
            dstFile.createNewFile();
        }

    }

    public void Copy() throws IOException {
        FileInputStream fin = new FileInputStream(orgFile);

        FileOutputStream fout = new FileOutputStream(dstFile);

        int holder;

        while ((holder=fin.read() )!= -1) {
            fout.write(holder);
        }

        fin.close();
        fout.close();


    }

    public static void main(String[] args) throws IOException {
        CopyFile cp = new CopyFile();

        String orgPath = "org.mp3";
        String dstpath = "dst.mp3";
        cp.readyFiles(dstpath, orgPath);
        cp.Copy();

    }
}
