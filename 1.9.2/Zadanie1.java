import java.util.Random;
class Zadanie1 {
    public static void main(String[]args){
        Random r = new Random();
        int tab[] = new int[2000];
        for(int i=0;i<2000;i++){
            int a = r.nextInt(10000)+1;
            tab[i]=a;
            System.out.println(tab[i]+" ");
        }
        
    }
}