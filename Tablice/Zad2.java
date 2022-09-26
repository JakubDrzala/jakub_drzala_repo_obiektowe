import java.util.Random;
public class Zad2 {
    public static void main (String[] args){
        Random r = new Random();
        int l1 = 0;
        int l2 = 0;
        int tab1[][] = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int y = 0; y < 10; y++){
                tab1[i][y]=0;
            }
        }

        for(int i = 0; i < 10; i++){
            for(int y = 0; y < 10; y++){
                int a = r.nextInt(5)+1;
                int b = r.nextInt(10);
                tab1[i][b] = a;
            }    
        }

        for(int i = 0; i < 10; i++){
            for(int y = 0; y < 10; y++){
                System.out.print(tab1[i][y]+"  ");
            }
            System.out.print("\n");
        }
    }
}
