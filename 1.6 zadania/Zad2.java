import java.util.Scanner;
class Zad2 {
    public static void main (String[]args){
        System.out.println("Podaj słowo");
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        int liczba = a.length();
        System.out.println("ilość znaków to: "+liczba);

    }
}