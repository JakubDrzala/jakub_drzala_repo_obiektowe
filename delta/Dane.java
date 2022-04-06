public class Dane {
    private double a;
    private double b;
    private double c;

    public Dane(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return b*b-4*a*c;
    }

    double delta = delta();

    public void zero(){
        if(delta==0){
            System.out.println(-b/(2*a));
        }
        else if(delta>0){
            System.out.println((-b-delta)/(2*a));
            System.out.println((-b+delta)/(2*a));
        }
        else{
            System.out.println("delta < 0");
        }
    }
    
}
