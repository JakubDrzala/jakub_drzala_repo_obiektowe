import java.util.Scanner;
class Zad1 {
    public static void main (String[]args){
        String haslo = "haslo123";
        System.out.println("Podaj haslo");
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        System.out.println(a);
        
        if(haslo.equals(a)){
            System.out.println("Podałeś prawidłowe hasło!");
        }
        else{
            System.out.println("Podałeś nieprawidłowe hasło!");
        }
    }
}