import java.util.ArrayList;
import java.util.Scanner;
public class MyStartClass{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a;
        ArrayList<Person> lista = new ArrayList();
            lista.add(new Person("Anna", "Mucha"));
            lista.add(new Person("Robert", "Lewandowski"));

        
        while(i == 1){
            System.out.println(new Menu());
            a = sc.nextInt();
            new PersonTools(a);
        }
    }
}