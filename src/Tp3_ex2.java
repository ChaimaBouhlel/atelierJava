public class Tp3_ex2 {
    private int compte;
    Tp3_ex2(int montant) {
        this.compte = montant;
    }
    void retireArgeant(int montant) throws CompteException {
        if (montant > compte) {
            throw new CompteException("Possibilités de retrait épuise");
        }
        else {compte = compte - montant;}
    }
    public static void main(String[] args) {
        Tp3_ex2 compte1 = new Tp3_ex2(1000);

        try {compte1.retireArgeant(2000);}
        catch (CompteException ce)
        {ce.printStackTrace();}
    }
}
