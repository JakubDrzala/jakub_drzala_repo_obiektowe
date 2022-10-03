import java.util.ArrayList;
import java.util.Scanner;
public class MyStartClass{
    public static void main (String[] args){
        ArrayList<Person> lista = new ArrayList();
            lista.add(new Person("Anna", "Mucha"));
            lista.add(new Person("Robert", "Lewandowski"));
            lista.add(new Person("Damian", "Nowak"));
            lista.add(new Person("Marcin", "Stopa"));
            lista.add(new Person("Krzysztof", "Jarzyna"));
            lista.add(new Person("Wojciech", "Drozd"));
            lista.add(new Person("Ryszard", "Drzewo"));
            lista.add(new Person("Monika", "Jarząbkowska"));
            lista.add(new Person("Joanna", "Wójcik"));
            lista.add(new Person("Adam", "Kowalski"));

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a;
        new FileUtils().Zapis();
        lista.get(0);
        while(i == 1){
            System.out.println(new Menu());
            a = sc.nextInt();
            if(a == 1){
                new PersonTools().Inicialy();
            }
            else if(a == 2){
                new PersonTools().Wyswietlanie();
            }
            else if(a == 3){
                new PersonTools().Losowanie();
            }
            else if(a == 4){
                System.exit(0);
            }
            else{
            }
        }
    }
}