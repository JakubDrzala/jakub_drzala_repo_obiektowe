class Main{
    public static void main(String[]args){
        Dane Dane = new Dane("Michał", "A", 100);
        Odczyt Odczyt = new Odczyt();
        System.out.println(Dane.imie+" "+Dane.nazwisko+" "+Dane.zarobki);
    }
}