import java.io.FileInputStream;
import java.io.IOException;

public class Tp5_ex1 {
    public static void main(String[] args) { String fileName = "todo.txt"; String nString = "10jk"; FileInputStream fis;

        try {
            System.out.println("#1");
            fis = new FileInputStream(fileName); System.out.println("#2");

            Integer n = new Integer(nString); System.out.println("#3");
        }
        catch (IOException ioe) {
            System.out.println(" E/S problem :" + ioe);
        }

        catch (NumberFormatException nfe) { System.out.println(" NumberFormat problem " + nfe);
        }
        finally {
            System.out.println("#4");

        }
    }

}
