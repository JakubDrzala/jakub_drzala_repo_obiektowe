import java.util.Random;
public class Zad1 {
    public static void main (String[] args){
        int parzyste=0;
        int nparzyste=0;
        int[] tab1 = new int[1000];
        Random r = new Random();
        for(int i = 0;i<tab1.length;i++){
            tab1[i] = r.nextInt(1001);
        }
        for(int i = 0;i<tab1.length;i++){
            if(tab1[i]%2==0){
                parzyste++;
            }
            else{
                nparzyste++;
            }
        }
        System.out.println("Liczby parzyste: "+parzyste);
        System.out.println("Liczby nieparzyste: "+nparzyste);
    }
}
