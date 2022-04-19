import java.io.*;
public class Test1 {
    void test1() {
        try {throw new Exception();} catch(Exception e)
        {System.out.println("first exception a");}
    }

    void test2() throws Exception{ throw new Exception();
    }
}

