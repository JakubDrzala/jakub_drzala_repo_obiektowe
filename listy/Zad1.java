import java.util.Random;
import java.util.ArrayList;
import java.utli.Arrays;
import java.util.Collections;
public class Zad1{
    public static void main(String[]args){
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList();
        for(int i=0;i<100;i++){
            lista.add(r.nextInt(100)+1);
        }
        Collections.sort(lista);
        System.out.println("Najmniejsza liczba: "+lista.get(0));
        System.out.println("Największa liczba: "+lista.get(99));
    }
}