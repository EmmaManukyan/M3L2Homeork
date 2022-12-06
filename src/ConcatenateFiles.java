import java.io.*;
import java.util.Scanner;

public class ConcatenateFiles {
    public static void main(String[] args) {
        ConcatenateFiles concatenateFiles = new ConcatenateFiles();
        /*try {
            concatenateFiles.concatenate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        try {
            concatenateFiles.concatenateSecondWay();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void concatenate() throws IOException {
        File fileC = new File("c.txt");
        File fileD = new File("d.txt");
        File fileCD = new File("cd.txt");
        if (fileCD.exists()){
            fileCD.delete();
            fileCD = new File("cd.txt");
        }
        copyTo(fileC,fileCD);
        copyTo(fileD,fileCD);
    }


    public void concatenateSecondWay() throws IOException {
        PrintWriter pw = new PrintWriter("cd2.txt");
        BufferedReader bw = new BufferedReader(new FileReader("c.txt"));
        String myLine = bw.readLine();
        while (myLine!=null){
            pw.println(myLine);
            myLine = bw.readLine();
        }
        bw = new BufferedReader(new FileReader("d.txt"));
        myLine = bw.readLine();
        while (myLine!=null){
            pw.println(myLine);
            myLine = bw.readLine();
        }
        pw.flush();
        bw.close();
        pw.close();

    }

    public static void copyTo(File file1, File file2) throws IOException {
        Scanner sc = new Scanner(file1);
        FileWriter fw = new FileWriter(file2,true);
        while (sc.hasNext()){
            fw.write(sc.nextLine());
        }
        sc.close();
        fw.close();
    }
}
