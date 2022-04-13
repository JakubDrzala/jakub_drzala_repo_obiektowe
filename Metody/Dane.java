public class Dane {
    String imie;
    String nazwisko;
    int zarobki;

    public Dane(){
    }

    public Dane(String imie, String nazwisko, int zarobki){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zarobki = zarobki;
    }


    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getZarobki() {
        return zarobki;
    }
    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }
}
