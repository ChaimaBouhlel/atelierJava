import java.io.File;
public class Tp5_File {

    public static void main(String[] args) {
        String name = "todo.txt";
        File f = new File(name);
        System.out.println("f.exists()" + f.exists());
        System.out.println("f.isDirectory()" + f.isDirectory());

        if (f.isDirectory()) {
            String[] list = f.list();
            for (int i = 0; i < list.length; i++) { System.out.println(" " + list[i]);
            }
        }
    }
}
