import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        try {
            main.filContent();
        } catch (IOException e) {
            System.out.println("CHexav");
        }
    }
    public void filContent() throws IOException {
        String currentPath = new java.io.File(".").getCanonicalPath();
        System.out.println(currentPath);
    }
}