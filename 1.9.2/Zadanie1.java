import java.util.Random;
import java.util.Arrays;
class Zadanie1 {
    public static void main(String[]args){
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
    }
}