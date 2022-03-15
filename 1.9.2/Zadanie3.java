import java.util.Random;
import java.util.Scanner;
class Zadanie3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen: ");
        int ile = sc.nextInt();
        for(int e=0;e<ile;e++){
            Random r = new Random();
            int tab[] = new int[200];
            System.out.println("\n\n\n");
            for(int i=0;i<200;i++){
                int a = r.nextInt(10001);
                tab[i]=a;
                System.out.println(tab[i]+" ");
            }

            int b = r.nextInt(1001)+100;
            int tab1[] = new int[b];
            System.out.println("\n\n\n");
            for(int i=0;i<200;i++){
                int a = r.nextInt(10001)-5000;
                tab[i]=a;
                System.out.println(tab[i]+" ");
            }
        }
    }
}