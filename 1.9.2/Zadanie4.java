import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
class Zadanie4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen: ");
        int ile = sc.nextInt();
        System.out.println("\n\nfor\n");
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
            int s = 0;
            for(int i = 0; i < tab.length; i++){
                s+=tab[i];
            }
            System.out.println("Średnia: " + (s / tab.length));

            int tab1[] = new int[r.nextInt(900) + 100];
            System.out.println("\n");
            for(int i=0;i<tab1.length;i++){
                int a = r.nextInt(10000)-5000;
                tab1[i]=a;
            }
            Arrays.sort(tab1);
            p = tab1.length / 2;
            System.out.println("Mediana: " + tab1[p]);
            s = 0;
            for(int i = 0; i < tab1.length; i++){
                s+=tab1[i];
            }
            System.out.println("Średnia: " + (s / tab1.length));
            System.out.println("----------------------------");
        }
        int f=0;
        
        System.out.println("\n\nwhile\n");
        int i = 0;
        while(f<ile){
            Random r = new Random();
            int tab[] = new int[2000];
            while(i<tab.length){
                int a = r.nextInt(9999)+1;
                tab[i]=a;
                i++;
            }
            Arrays.sort(tab);
            int p = tab.length / 2;
            System.out.println("Mediana: " + tab[p]);
            int s = 0;
            i = 0;
            while(i < tab.length){
                s+=tab[i];
                i++;
            }
            System.out.println("Średnia: " + (s / tab.length));

            int tab1[] = new int[r.nextInt(900) + 100];
            System.out.println("\n");
            i = 0;
            while(i<tab1.length){
                int a = r.nextInt(10000)-5000;
                tab1[i]=a;
                i++;
            }
            Arrays.sort(tab1);
            p = tab1.length / 2;
            System.out.println("Mediana: " + tab1[p]);
            s = 0;
            i = 0;
            while(i < tab1.length){
                s+=tab1[i];
                i++;
            }
            System.out.println("Średnia: " + (s / tab1.length));
            System.out.println("----------------------------");
            f++;
        }
    }
}