import java.util.Random;
import java.util.Arrays;
class Zadanie2 {
    public static void main(String[]args){
        Random r = new Random();
        int tab[] = new int[r.nextInt(900) + 100];
        for(int i=0;i<tab.length;i++){
            int a = r.nextInt(10000)-5000;
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
    }
}