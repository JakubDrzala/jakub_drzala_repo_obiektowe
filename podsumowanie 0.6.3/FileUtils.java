import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileUtils {
    File Plik = new File("plik.csv");

    public void Zapis(){
        try {
            FileWriter fw = new FileWriter(Plik, true);
            fw.write("");
            fw.close();
        }
        catch (IOException ex){
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    public void Odczyt(){
        try {
            Scanner sc = new Scanner(Plik);
            String dane = "";
            while(sc.hasNext()){
                dane+=sc.nextLine()+"\n";     
            }       
        } 
        catch (IOException ex){
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
