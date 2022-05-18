public class Kwadrat {
    private double a;
    private double b;

    public Kwadrat(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double polek(){
        return a * a;
    }
    public double polep(){
        return a * b;
    }

    public double obwodk(){
        return a * 4;
    }
    public double obwodp(){
        return (2 * a) + (2 * b);
    }
}
