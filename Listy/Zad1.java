import java.util.ArrayList;
import java.util.Random;

public class Zad1 {
    public static void main (String[]args){
        Random r = new Random();
        int a = 0;
        String liczby;
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        for(int i = 0;  i < 100; i++){
            a = r.nextInt(10)+1;
            lista1.add(a);
        }

        for (int i = 0; i < lista1.size(); i++) {
            if(lista1.get(i)>8){
                lista2.add(lista1.get(i));
            }
        }

        for (int i = 0; i < lista2.size(); i++) {
            System.out.print(lista2.get(i)+" ");
        }
    }
}
