public class Ex2 {
    public static void main(String args[]){

        int a;
        try
        {a=1; a= 1/0;}
        catch(Exception e)
        {System.out.println("Number Exception");}
        finally
        {a= -1;}
        System.out.println(a);
//Résultat
        /*
        * Number Exception
        * -1
        */
    }
}
