public class Except {
        public static void main(String args[]) {
            new Test1().test1();
            try {new Test1().test1();} catch(Exception e)
            {System.out.println("first exception b");}
        }

}
