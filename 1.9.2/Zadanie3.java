import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
class Zadanie3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen: ");
        int ile = sc.nextInt();
        for(int e=0;e<ile;e++){
            Random r = new Random();
            int tab[] = new int[2000];
            for(int i=0;i<tab.length;i++){
                int a = r.nextInt(9999)+1;
                tab[i]=a;
            }
            Arrays.sort(tab);
            int p = tab.length / 2;
            System.out.println("Mediana: " + tab[p]);
            int sum = 0;
            for(int i = 0; i < tab.length; i++){
                sum+=tab[i];
            }
            System.out.println("Średnia: " + (sum / tab.length));

            int tab1[] = new int[r.nextInt(900) + 100];
            System.out.println("\n");
            for(int i=0;i<tab1.length;i++){
                int a = r.nextInt(10000)-5000;
                tab1[i]=a;
            }
            Arrays.sort(tab1);
            p = tab1.length / 2;
            System.out.println("Mediana: " + tab1[p]);
            sum = 0;
            for(int i = 0; i < tab1.length; i++){
                sum+=tab1[i];
            }
            System.out.println("Średnia: " + (sum / tab1.length));
            System.out.println("----------------------------");
        }
    }
}