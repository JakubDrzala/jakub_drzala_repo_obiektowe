import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
class Zad1{
    public static void main(String[]args){
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList();
        for(int i=0;i<2000;i++){
            lista.add(r.nextInt(10000)+1);
        }
        Collections.sort(lista);
        int p = lista.size() / 2;
        System.out.println("Mediana: " + lista.get(p));
        int s=0;
        for(int i = 0; i < lista.size(); i++){
            s += lista.get(i);
        }
        System.out.println("Średnia: " + (s / lista.size()));
    }
}