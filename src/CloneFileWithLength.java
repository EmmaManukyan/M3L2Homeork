import java.io.*;

public class CloneFileWithLength {
    public static void main(String[] args) {
        CloneFileWithLength task1 = new CloneFileWithLength();
        try {
            task1.cloneFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void cloneFile() throws IOException {
        FileReader in = new FileReader("a.txt");
        File file = new File("a.txt");
        String fileName = "bWithLength";
        fileName += String.valueOf(file.length())+".txt";
        FileWriter out = new FileWriter(fileName);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
    }
}
