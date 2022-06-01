import java.util.ArrayList;
import java.utli.Arrays;
public class Zad2 {
    public static void main(String[]args){
        ArrayList<String> tory = new ArrayList("tor1", "tor2","'tor3","tor4");
        ArrayList<String> rok = new ArrayList("zwyciezca1","zwyciezca2","zwyciezca3","zwyciezca4","zwyciezca1");
        System.out.println(tory.get(0));
        System.out.println(rok.get(0));
    }

    public class Tor{
        String tor;
        String zwyciezca;
    }
}
