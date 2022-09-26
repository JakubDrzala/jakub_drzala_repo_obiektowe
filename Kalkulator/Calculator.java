import java.util.Scanner;
class Calculator {
    static Scanner sc;
    static double l1, l2;
    static String d;
    public static void main (String[] args){
        sc = new Scanner(System.in);
        System.out.println("---------- KALKULATOR ----------");
        System.out.print("Podaj pierwszą liczbę: ");
        l1 = sc.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        l2 = sc.nextDouble();
        System.out.print("Wybierz działanie [+, -, *, /]: ");
        d = sc.next();    
        switch (d){
            case "+" :
                System.out.println("" + l1 + d + l2 + "=" + sum(l1,l2));
                break;
            case "-" :
                System.out.println("" + l1 + d + l2 + "=" + roz(l1,l2));
                break;
            case "*" :
                System.out.println("" + l1 + d + l2 + "=" + iloc(l1,l2));
                break;
            case "/" :
                System.out.println("" + l1 + d + l2 + "=" + ilor(l1,l2));
                break;
        }
    }

    private static double sum(double n1, double n2){
        return n1+n2;
    }

    private static double roz(double n1, double n2){
        return n1-n2;
    }

    private static double iloc(double n1, double n2){
        return n1*n2;
    }

    private static double ilor(double n1, double n2){
        return n1/n2;
    }
}
