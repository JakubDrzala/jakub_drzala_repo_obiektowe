import java.util.Scanner;

public class Liczby {
    public double Kwadrat(double a){
        return a*a;
    }

    public double Trojkat(double a, double h){
        return (a*h)/2;

    }

    public void  Menu(){
        int wybor = 0;
        System.out.println("--------");
        System.out.println("  Menu  ");
        System.out.println("--------");
        System.out.println("1 - Oblicz pole kwadratu");
        System.out.println("2 - Oblicz pole trójkąta");
        System.out.println("3 - Historia działań");
        Scanner sc = new Scanner(System.in);
        wybor = sc.nextInt();
        switch(wybor){
            case '1' :

            break;

            case '2' :

            break;

            case '3' :

            break;
        }
    }
}
