public class CwiczenieObiektowe_1{
    public static void main(String[]args){ 
        MojeDane zad1 = new MojeDane("Jan", "Bronikowski", "1p");

        Logowanie zad2 = new Logowanie("Jakub","haslo");
        
        Kolo k1 = new Kolo(4);
        Kolo k2 = new Kolo(20);

        Kwadrat a = new Kwadrat(4, 20);

        System.out.println(zad1.imie+" "+zad1.nazwisko+" "+zad1.klasa);

        System.out.println(zad2.toString());

        System.out.println("pole koła: "+k1.polekola());
        System.out.println("obwód koła: "+k1.obwodkola());
        System.out.println("pole koła: "+k2.polekola());
        System.out.println("obwód koła: "+k2.obwodkola());

        System.out.println("pole kwadratu: "+a.polek());
        System.out.println("obwód kwadratu: "+a.obwodk());
        System.out.println("pole prostokąta: "+a.polep());
        System.out.println("obwód prostokąta: "+a.obwodp());

    }
}