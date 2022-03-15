import java.util.Random;
class Zadanie2 {
    public static void main(String[]args){
        Random r = new Random();
        int b = r.nextInt(1001)+100;
        int tab[] = new int[b];
        for(int i=0;i<200;i++){
            int a = r.nextInt(10001)-5000;
            tab[i]=a;
            System.out.println(tab[i]+" ");
        }
        
    }
}