
import java.io.FileInputStream;
import java.io.IOException;

public class Tp3_ex3 {
    public static void main(String args[]) {
        int x = 1;//-1
        int y = 1;//0
        int z[] = new int[3];
        try {
            System.out.println(" x/y="+(x/y));
            System.out.println(" z[x]="+z[x]);
        }catch (RuntimeException re){
            System.out.println("Runtime Exception");
        }
// Runtime Exceptions
// Checked Exception
        try {
            FileInputStream f = new
                    FileInputStream("todo.txt");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        try {
            int M = 1000000000;
            Double[] d = new Double[M];

        } catch (Error e) {
            e.printStackTrace();
            System.out.println("Erreur: Pas d'espace");
        }
    }}