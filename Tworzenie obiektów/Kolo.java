public class Kolo {
    private double pi=3.1415;
    private double p;

    public Kolo(double p){
        this.p = p;
    }

    public double polekola(){
        return pi * Math.pow(p,2);
    }

    public double obwodkola(){
        return 2 * pi * p;
    }
}
