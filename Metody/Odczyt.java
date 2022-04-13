import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Odczyt {
    String separator = ",";
    String[] tab;
    public void zapis(File file, String separator) throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            tab = sc.nextLine().split(separator);
            tabela(tab);
        }
    }

    public void tabela(String[] tab){
        for(String a: tab){
            System.out.println(a+" ");
        }
        System.out.println();
    }
}
