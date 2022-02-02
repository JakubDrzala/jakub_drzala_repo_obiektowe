import java.util.Random;
import java.util.Arrays;

class Zad1{
    public static void main(String[]args){
        Random r = new Random();
        int[] tabBubble = new int[10000];

        for (int i=0; i<100; i++){
            tabBubble[i] = r.nextInt(1000000)+1;
        }
        int[] tabQuick = Arrays.copyOf(tabBubble,tabBubble.length);

        long millisActualTime = System.currentTimeMillis();
        for(int i=0; i<tabBubble.length; i++){
            for(int j=1; j<tabBubble.length; j++){
                if(tabBubble[j]<tabBubble[j-1]){
                    int wieksza = tabBubble[j-1];
                    tabBubble[j-1] = tabBubble[j];
                    tabBubble[j] = wieksza;
                }
            }
        }
        long executionTime = System.currentTimeMillis() - millisActualTime; 
        System.out.println("Czas wykonania sortowania bąbelkowego: "+executionTime);

        millisActualTime = System.currentTimeMillis();
        Arrays.sort(tabQuick);
        executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Czas wykonania quicksort: "+executionTime);
    }
}