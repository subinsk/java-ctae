import java.io.*;

public class exceptionhandling {
    static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
            int divideByZero = 5 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        catch (IOException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("This is the finally block");
        }
    }
}
