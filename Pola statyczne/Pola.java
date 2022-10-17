import java.util.ArrayList;

public class Pola {
    public static void main (String[]args){
        ArrayList<Numbers> lista = new ArrayList();
        for(int i = 1; i<=10; i++){
            lista.add(new Numbers(i));
        }    
        System.out.println(lista);

        System.out.println("=======================================");
        Numbers.setL1(3);
        System.out.println(lista);

        System.out.println("=======================================");
        Numbers.setL1(7);
        System.out.println(lista);
    }
}