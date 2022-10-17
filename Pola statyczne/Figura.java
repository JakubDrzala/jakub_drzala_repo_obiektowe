public class Figura {
    private static double pi =3.14;
    private int r;

    public Figura(int r){
        this.r = r;
    }

    public static double getPi() {
        return pi;
    }
    public static void setPi(double pi) {
        Figura.pi = pi;
    }

    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
}
