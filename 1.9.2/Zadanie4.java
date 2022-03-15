import java.util.Random;
import java.util.Scanner;
class Zadanie4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen: ");
        int ile = sc.nextInt();
        System.out.println("\n\nfor\n");
        for(int e=0;e<ile;e++){
            Random r = new Random();
            int tab[] = new int[200];
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
        int e=0;
        System.out.println("\n\nwhile\n");
        while(e<ile){
            Random r = new Random();
            int i=0;
            int tab[] = new int[200];
            while(i<200){
                int a = r.nextInt(10001);
                tab[i]=a;
                System.out.println(tab[i]+" ");
                i++;
            }
            i=0;
            int b = r.nextInt(1001)+100;
            int tab1[] = new int[b];
            System.out.println("\n\n\n");
            while(i<200){
                int a = r.nextInt(10001)-5000;
                tab[i]=a;
                System.out.println(tab[i]+" ");
                i++;
            }
            e++;
        }
    }
}
