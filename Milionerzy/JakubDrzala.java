import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JakubDrzala {
    public static void main (String[]args) throws FileNotFoundException{
 
        File ad = new File("wyniki.txt");


        String[][] Pytania = new String[10][10];
        Pytania[0][0] = "Gdy Neil Armstron stanął na Księżycu, wypowiedział słynne zdanie. Co na Srebrnym Globie zrobił Alan Shepard? \n A) Zagrał w golfa \n B) Biegał z siatką na motyle \n C) Zatańczył rock and rolla \n D) Godzinę leżał krzyżem";
        Pytania[1][0] = "Co mieści Wielki Łuk Braterstwa w paryskiej dzielnicy La Defense, zwany dwudziestowieczną wersją Łuku Triumfalnego? \n A) Szczątki Napoleona I \n B) Nic \n C) Ziemię z pól bitewnych \n D) Biura ministerstwa ekologii";
        Pytania[2][0] = "Kto jest twórcą logo zespołu Perfect \n A) Andrzej Mleczko \n B) Henryk Sawka \n C) Marek Raczkowski \n D) Edward Lutczyn";
        Pytania[3][0] = "Na co reaguje nocyceptor? \n A) Na mroki nocy \n B) Na słodki smak \n C) Na podczerwień małej mocy \n D) Na bodźce uszkadzające tkanki";
        Pytania[4][0] = "Z czego odlane są złote medale olimpijskie? \n A) Ze złota \n B) Z brązu \n C) Z żeliwa \n D) Ze srebra";
        Pytania[5][0] = "Który ssak się nie spoci? \n A) Owca \n B) Koń \n C) Człowiek \n D) Królik";
        Pytania[6][0] = "W 1971 r. psycholog Philip Zimbardo przeprowadził eksperyment symulujący: \n A) życie rozbitków na wyspie \n B) przebywanie w kosmosie \n C) życie w więzieniu \n D) odbijanie zakładników";
        Pytania[7][0] = "Starte ziemniaki i mąka to w zasadzie wszystko, czego potrzebujemy na tak zwane kluski:\n A) szklane \n B) plastikowe \n C) papierowe \n D) żelazne";
        Pytania[8][0] = "Z czego w głównej mierze zrobione są tak zwane monety bulionowe? \n A) z pasty rosołowej \n B) ze zrolowanego mięsa \n C) z miedzi \n D) ze złota";
        Pytania[9][0] = "Pod jaki zabór trafił Białystok w 1795 r., jeśli trafił? \n A) nie trafił pod żaden \n B) pod austriackI  \n C) pod rosyjski \n D) pod pruski";

        Pytania[0][1] = "Co miał wspólnego Jan Marcin Szancer z Krasickim, Mickiewiczem i Sienkiewiczem? \n A) był ich ulubieńcem \n B) to ich wydawca  \n C) to ilustrator ich dzieł \n D) nic";
        Pytania[1][1] = "Jednostka miary reaktywności reaktora jądrowego to: \n A) euro \n B) złoty  \n C) rubel \n D) dolar";
        Pytania[2][1] = "Kto składa zeznanie podatkowe na druku PIT-19A? \n A) nauczyciele \n B) duchowni \n C) rolnicy \n D) więźniowie";
        Pytania[3][1] = "W mózgu istota szara, tworząc korę mózgu, otacza istotę białą. W rdzeniu kręgowym jest... \n A) tak samo \n B) odwrotnie \n C) tylko istota szara \n D) tylko istota biała";
        Pytania[4][1] = "Najwyższy budynek świata Burdż Chalifa zwieńczony jest tym samym elementem architektonicznym, co... \n A) Krzywa Wieża w Pizie \n B) PKiN \n C) Opera w Sydney \n D) Statua Wolności";
        Pytania[5][1] = "Krzysztof Komeda skomponował muzykę do wszystkich tych filmów, ale jeden z nich wyreżyserował kto inny niż pozostałe. Który? \n A) \"Nóż w wodzie\" \n B) \"Matnia\" \n C) \"Niewinni czarodzieje\" \n D) \"Dziecko Rosemary\"";
        Pytania[6][1] = "Muzykę skomponowaną przez Krzysztofa Pendereckiego usłyszymy we wszystkich tych filmach. Ale specjalnie stworzył ją do: \n A) \"Egzorcysty\" Friedkina \n B) \"Lśnienia\" Kubricka \n C) \"Wyspy tajemnic\" Scorsesego \n D) \"Rękopisu znalezionego\" Hasa";
        Pytania[7][1] = "Za 30 Judaszowych srebrników arcykapłani kupili kawałek ziemi nazywany Polem Garncarza, który przeznaczyli na: \n A) plantację oliwek \n B) wybieg dla lwów \n C) cmentarz dla cudzoziemców \n D) targowisko";
        Pytania[8][1] = "W oryginalnej trylogii \"Gwiezdne Wojny\" 3-CPO ma srebrną: \n A) szczękę \n B) klatkę piersiowa \n C) lewą dłoń \n D) prawą nogę";
        Pytania[9][1] = "Kto jest autorem słów: \"Jeśli kto przychodzi do mnie, a nie ma w nienawiści swego ojca i matki, żony i dzieci, braci i sióstr, nadto i siebie samego, nie może być moim uczniem\" \n A) Jezus Chrystus \n B) Allah \n C) Mojżesz \n D) Budda";
        
        Pytania[0][2] ="Pierwszym królem Polski był? \n A) Siemomysł \n B) Lestek \n C) Mieszko I \n D) Bolesław Chrobry";
        Pytania[1][2] = "Którego biskupa zabił król Bolesław II Śmiały? \n A) Wincentego Kadłubka \n B) Stanisława ze Szczepanowa \n C) Jana Muskata \n D) Zbigniewa Oleśnickiego";
        Pytania[2][2] = "Który król \"zastał Polskę drewnianą, a zostawił murowaną\"? \n A) Bolesław Kędzierzawy \n B) Kazimierz Wielki \n C) Zygmunt Stary \n D) Bolesław Krzywousty";
        Pytania[3][2] = "Terminem Polskie Termopile określa się: \n A) Bitwę nad Bzurą \n B) Walki na Westerplatte \n C) Bitwę pod Mławą \n D) Obronę Wizny";
        Pytania[4][2] = "Gdzie zginął gen. Władysław Sikorski? \n A) Na Gibraltarze \n B) W okupowanej Francji \n C) W Szkocji \n D) We Włoszech";
        Pytania[5][2] = "Mistrzami jakiej broni są Atos, Portos i Aramis z książki Aleksandra Dumasa? \n A) szabli \n B) szpady \n C) włóczni \n D) miecza";
        Pytania[6][2] ="Jakie elementy garderoby powstają najczęściej z materiału typu softshell? \n A) rajstopy \n B) kurtki \n C) krawaty \n D) gorsety";
        Pytania[7][2] ="Krupy to zjawisko meteorologiczne, które najbardziej przypomina: \n A) grad \n B) mżawkę \n C) mgłę\n D) rosę";
        Pytania[8][2] =" Sztruks można najprościej opisać jako: \n A) kombinację rombów \n B) sekwencję prążków \n C) układ kół \n D) zestaw kwiatków";
        Pytania[9][2] ="Groomer zadba o wygląd twojego: \n A) auta \n B) psa \n C) basenu \n D) chodnika";

        Pytania[0][3] ="Która liczba przypomina symbol zodiakalnego Raka? \n A) 7 \n B) 13 \n C) 21 \n D) 69";
        Pytania[1][3] ="Czego najwięcej jest w składzie chemicznym bursztynu? \n A) tlenu \n B) wodoru \n C) siarki \n D) węgla";
        Pytania[2][3] ="Wśród kości czaszki nie ma kości: \n A) promieniowej \n B) jarzmowej \n C) skroniowej \n D) potylicznej";
        Pytania[3][3] =" Mieć się z pyszna to: \n A) być w tarapatach \n B) czuć niebo w gębie \n C) szczycić się czymś \n D) być obrzydliwie bogatym";
        Pytania[4][3] ="Co jest atrybutem Herkulesa Poirot ze stronic powieści Agaty Christie? \n A) niechlujny strój \n B) kędzierzawa broda \n C) potężna muskulatura \n D) długie wąsy";
        Pytania[5][3] ="Przesłodka pavlova nie obejdzie się bez...? \n A) bez \n B) bzów \n C) Pavla \n D) kompotierki";
        Pytania[6][3] =" Która z biblijnych postaci nosi przydomek Iskariota? \n A) Mojżesz \n B) Judasz \n C) Abel\n D) Noe";
        Pytania[7][3] ="Gdy stoisz w pozycji wyprostowanej z opuszczonymi wzdłuż boków rękami, środek ciężkości ciała znajduje się na wysokości... \n A) Głowy \n B) Ramion \n C) Miednicy \n D) Kolan";
        Pytania[8][3] ="Niektóre z owoców dojrzewają jeszcze po zbiorach. Który zerwany niedojrzały taki pozostanie? \n A) wiśnia\n B) banan\n C) gruszka\n D) awokado";
        Pytania[9][3] ="Która miejscowość słynie z produkcji koronkowych stringów? \n A) Koniaków\n B) Konin\n C) Kurozwęki\n D) Chudolipie";

        Pytania[0][4] ="Który kraj jest ojczyzną k-popu? \n A) Kanada\n B) Kuwejt\n C) Kongo\n D) Korea Południowa";
        Pytania[1][4] ="Ziarna cieciorki - skąd się biorą? \n A) obrywa się z grona\n B) wyjmuje się ze strąka\n C) wybija się z kłosa\n D) odłupuje się z kolby";
        Pytania[2][4] ="Który z instrumentów strunowych użyczył nazwy gwiazdozbiorowi? \n A) skrzypce\n B) cymbały\n C) banjo\n D) lutnia";
        Pytania[3][4] ="Kobiety zwykle nie mają...? \n A) istoty szarej\n B) narządu Cortiego\n C) chromosomu Y\n D) ścięgna Achillesa";
        Pytania[4][4] ="Jajko z zerem na początku kodu pochodzi od kury z chowu? \n A) klatkowego\n B) ściółkowego\n C) ekologicznego\n D) na wolnym wybiegu";
        Pytania[5][4] ="Który z wymienionych to nie odcień czerwonego? \n A) karmazynowy\n B) cynamonowy\n C) szkarłatny\n D) karminowy";
        Pytania[6][4] ="Który z wymienionych to pożądany specjalista marketingu internetowego? \n A) social media ninja\n B) network muszkieter\n C) superweb komandos\n D) cybernetyczny gladiator";
        Pytania[7][4] ="Eurydyka to żona: \n A) Eurysteusza\n B) Orfeusza\n C) Morfeusza\n D) Perseusza";
        Pytania[8][4] ="Borowina to: \n A) wodny roztwór botoksu\n B) lecznicze błoto\n C) woda mineralna\n D) żeńskie imię";
        Pytania[9][4] ="Co stanęło na drodze miłości stokrotki i harcerza tam, \"Gdzie strumyk płynie z wolna, rozsiewa zioła maj\"? \n A) pokrzywy\n B) drut kolczasty\n C) zazdrosna matka\n D) srogi ojciec";

        Pytania[0][5] ="W systemie binarnym do zapisu liczb potrzebne są tylko: \n A) cyfry 0 i 1\n B)litery X i Y\n C) kropki i kreski\n D) kwadraty i kółka";
        Pytania[1][5] ="Mianownik w mianowniku liczby pojedynczej brzmi \"mianownik\". A w bierniku? \n A) też mianownik\n B) biernik\n C) biernika\n D) mianownika";
        Pytania[2][5] ="Leje jak z cebra – mówimy: \n A) O kimś stosującym przemoc\n B) O notorycznym kłamcy\n C) O sypiącym dowcipami\n D) o ulewnym deszczu";
        Pytania[3][5] ="Które psy mają tak płytkie oczodoły, że są narażone na wypadanie gałek ocznych, co wymaga natychmiastowej interwencji lekarza? \n A) Pudle\n B) Mopsy\n C) Owczarki niemieckie\n D) Dogi niemieckie";
        Pytania[4][5] ="Poważnie włochata roślina to: \n A) Konwalia\n B) Sasanka\n C) Żonkil\n D) Narcyz";
        Pytania[5][5] ="Humbak żywi się krylem i na tej diecie osiąga do 45 ton masy. Humbug zaś... \n A) pływa krylem\n B) pływa kraulem\n C) to synonim ściemy \n D) to ojconim ściemy";
        Pytania[6][5] ="Na której półkuli Ziemi nie leży Ocean Arktyczny? \n A) północnej\n B) południowej\n C) wschodniej \n D) zachodniej";
        Pytania[7][5] ="Komu według protokołu audiencji papieskich podczas oficjalnych wizyt wolno wystąpić przed obliczem papieża w bieli? \n A) gwiazdom filmowym\n B) katolickim królowym\n C) polskim prezydentowym \n D) chińskim cesarzowym";
        Pytania[8][5] ="Co w slangu czy mowie potocznej zastępuje zwykłe „w porządku”? \n A) cymbały \n B) gitara \n C) kontrabas \n D) trąba";
        Pytania[9][5] ="Które stany dokonały secesji z Unii i w 1861 r. współtworzyły państwo o nazwie Skonfederowane Stany Ameryki? \n A) Alabama i Luizjana \n B) Indiana i Iowa \n C) Nowy Jork i Ohio \n D) Kansas i Maine";
       
        Pytania[0][6] ="Co jest czwartym wymiarem czasoprzestrzeni opisanym przez Einsteina? \n A) czas \n B) przestrzeń \n C) prędkość \n D) ciężar";
        Pytania[1][6] ="Kto i gdzie zobaczy: Kominy Amoku, Warszawskie Kaskady, Błotne Łaźnie, Syfon Dziadka oraz Galerię Krokodyla? \n A) paralotniarz nad Mazurami \n B) leśnik w Borach Tucholskich \n C) grotołaz w Jaskini Śnieżnej \n D) nurek na dnie Bałtyku";
        Pytania[2][6] ="Co zdążył pożreć Saturn na jednym z 14 czarnych obrazów Francisca Goi? \n A) czarną kurę \n B) Jowisza \n C) głowę i ramię syna \n D) wszystkie pierścienie";
        Pytania[3][6] ="Kolargol: \n A) odkaża rany \n B) to sympatyczny miś \n C) to zol złota \n D) oplata szyję";
        Pytania[4][6] ="Waterpoliści używają: \n A) kijów \n B) krążka \n C) koni \n D) piłki";
        Pytania[5][6] ="Gospodynie wiejskie często zrzeszają się w \n A) trójkątach \n B) kwadratach \n C) kołach \n D) rombach";
        Pytania[6][6] ="Jeśli singiel, debel i mikst, to w... \n A) kajakarstwie \n B) szermierce \n C) tenisie ziemnym \n D) łucznictwie";
        Pytania[7][6] ="Co podano potraktowanemu gazem rozweselającym? \n A) hel \n B) podtlenek azotu \n C) azot \n D) dwutlenek węgla";
        Pytania[8][6] ="Co z definicji nie miało charakteru obronnego? \n A) pałac \n B) gród \n C) twierdza \n D) fort";
        Pytania[9][6] ="Czym bijemy się w piesi, kiedy powtarzamy: \"moja wina, moja wina, moja bardzo wielka wina\"? \n A) biczem \n B) otwartą dłonią \n C) zaciśniętą dłonią \n D) kolanem";
        
        Pytania[0][7] ="Który podobnie jak kwadrat ma wzór na obwód 4a? \n A) trójkąt \n B) deltoid \n C) romb \n D) trapez";
        Pytania[1][7] ="Jakie stanowisko zajmował Józef Piłsudski w 1918 r.? \n A) Prezydenta \n B) Premiera \n C) Marszałka Sejmu \n D) Tymczasowego Naczelnika Państwa";
        Pytania[2][7] ="Wekuje się zaprawy: \n A) murarskie \n B) sportowe \n C) do nasion \n D) na zimę";
        Pytania[3][7] ="Nazwa gatunkowa żyrafy sugeruje, że to krzyżówka: \n A) wielbłąda z lampartem \n B) hieny z surykatką \n C) pantery z wężem \n D) konia z kotem";
        Pytania[4][7] ="Co od wieków znane jest jako Zakazane Miasto? \n A) ateński Akropol \n B) angielski Stonehenge \n C) piramidy w Gizie \n D) pałac cesarski w Pekinie";
        Pytania[5][7] ="Świerzop z „Pana Tadeusza”: \n A) oblewa się rumieńcem \n B) jest bursztynowy \n C) to chleb prosto z pieca \n D) to pierwszy śnieg";
        Pytania[6][7] ="Laser to generator promieniowania elektromagnetycznego. A laserunek? \n A) wiązka przezeń wytwarzana \n B) leczniczy filtr na siatkówce \n C) przezroczysta warstwa farby \n D) fotokoagulacja naskórka";
        Pytania[7][7] ="Książkowy Plastuś z piórnika Tosi jest ubrany jedynie w \n A) czerwone skarpetki \n B) żółty szalik \n C) zielone majteczki \n D) marynarską bluzę";
        Pytania[8][7] ="Która to para miast leżących na różnych kontynentach, w różnych państwach, ale nad jednym morzem? \n A) Trypolis i Trypolis \n B) Sydney i Sydney \n C) Toronto i Toronto \n D) Amsterdam i Amsterdam";
        Pytania[9][7] ="Eskalopka... \n A) zapętla przeboje \n B) tańczy się z partnerem \n C) tańczy się z partnerem \n D) to kotlet";

        Pytania[0][8] ="W koszykówce 3x3 na jeden kosz grają... \n A) 3 piłki na 3 kosze \n B) 3 drużyny na 3-metrowym boisku \n C) 3 reprezentacje po 3 minuty \n D) 2 drużyny po 3 zawodników";
        Pytania[1][8] ="Podczas ceremonii otwarcia igrzysk Tokio 2020 reprezentanci Panamy paradowali w kapeluszach panama, a reprezentanci Bermudów w... \n A) spodenkach do kolan \n B) 3 baranich kożuchach \n C) 3 kiltach \n D) 2 kitlach";
        Pytania[2][8] ="„W północno-wschodnim kącie Afryki leży Egipt, ojczyzna najstarszej cywilizacji w świecie” to pierwsze zdanie powieści... \n A) Bolesława Prusa \n B) Adama Mickiewicza \n C) Stefana Żeromskiego \n D) Henryka Sienkiewicza";
        Pytania[3][8] ="Zdobywca głównej nagrody w \"Milionerach\" już nigdy nie będzie musiał kupować na... \n A) linijkę \n B) cyrkiel \n C) ekierkę \n D) zeszyt";
        Pytania[4][8] ="Jak się „skończyły przechwałki zarozumiałej zapałki” z wiersza Brzechwy? \n A) \"skoczyła i znikła w Wiśle\" \n B) \"nie wiem, ale pomyślę\" \n C) \"poszła po kilo sera\" \n D) \"dostała alzheimera\"";
        Pytania[5][8] ="Co w myśl znanego powiedzenia wieńczy dzieło? \n A) wieniec \n B) koronka \n C) początek \n D) koniec";
        Pytania[6][8] ="Która to dynastia książąt i królów węgierskich? \n A) Arpadowie \n B) Piastowie \n C) Przemyślidzi \n D) Rurykowicze";
        Pytania[7][8] ="Który z poniższych to czasownik niedokonany? \n A) oprać \n B) uprać \n C) prać \n D) przeprać";
        Pytania[8][8] ="Skąd pochodzi Conan Barbarzyńca? \n A) z Rivii \n B) z Oz \n C) z Mordoru \n D) z Cimmerii";
        Pytania[9][8] ="Komiksowym \"dzieckiem\" rysownika Boba Kane'a jest: \n A) Superman \n B) Batman \n C) Spider-Man \n D) Captain America";
        
        Pytania[0][9] ="Rybą nie jest: \n A) Świnka \n B) Rozpiór \n C) Krasnopiórka \n D) Kraska";
        Pytania[1][9] ="Kto jest mistrzem tego samego oręża, w jakim specjalizowała się mitologiczna Artemida? \n A) Zorro \n B) Legolas \n C) Don Kichot \n D) Longinus Podbipięta";
        Pytania[2][9] ="Który aktor urodził się w roku opatentowania kinematografu braci Lumière? \n A) Rudolph Valentino \n B) Humphrey Bogart \n C) Charlie Chaplin \n D) Fred Astaire";
        Pytania[3][9] ="Mowa w obronie poety Archiasza przeszła do historii jako jeden z najświetniejszych popisów retorycznych: \n A) Izokratesa \n B) Cycerona \n C) Demostenesa \n D) Kwintyliana";
        Pytania[4][9] ="Likier maraskino produkuje się z maraski, czyli odmiany: \n A) Wiśni \n B) Jabłoni \n C) Figi \n D) Gruszy";
        Pytania[5][9] ="Z gry na jakim instrumencie słynie Czesław Mozil? \n A) Na kornecie \n B) Na akordeonie \n C) Na djembe \n D) Na ksylofonie";
        Pytania[6][9] ="Który utwór Juliusza Słowackiego napisany jest prozą? \n A) \"Godzina myśli\" \n B) \"W Szwajcarii\" \n C) \"Anhelli\" \n D) \"Arab\"";
        Pytania[7][9] ="Co według Leszka Kołakowskiego jest sklepieniem domu, w którym duch ludzki mieszka? \n A) Rozum \n B) Bóg \n C) Miłość \n D) Czas";
        Pytania[8][9] ="Ile to jest 1111 razy 1111, jeśli 1 razy 1 to 1, a 11 razy 11 to 121? \n A) 12 321 \n B) 1 234 321 \n C) 111 111 111 \n D) 123 454 321";
        Pytania[9][9] ="Który instrument stroi muzyk? \n A) Tamburyn \n B) Kocioł \n C) Okarynę \n D) Czynele";


        String[][] Odpowiedzi = new String[10][10];
        Odpowiedzi[0][0] = "A";
        Odpowiedzi[1][0] = "D";
        Odpowiedzi[2][0] = "D";
        Odpowiedzi[3][0] = "D";
        Odpowiedzi[4][0] = "D";
        Odpowiedzi[5][0] = "D";
        Odpowiedzi[6][0] = "C";
        Odpowiedzi[7][0] = "D";
        Odpowiedzi[8][0] = "D";
        Odpowiedzi[9][0] = "D";

        Odpowiedzi[0][1] = "C";
        Odpowiedzi[1][1] = "D";
        Odpowiedzi[2][1] = "B";
        Odpowiedzi[3][1] = "B";
        Odpowiedzi[4][1] = "B";
        Odpowiedzi[5][1] = "C";
        Odpowiedzi[6][1] = "D";
        Odpowiedzi[7][1] = "C";
        Odpowiedzi[8][1] = "D";
        Odpowiedzi[9][1] = "A";

        Odpowiedzi[0][2] = "D";
        Odpowiedzi[1][2] = "B";
        Odpowiedzi[2][2] = "B";
        Odpowiedzi[3][2] = "D";
        Odpowiedzi[4][2] = "D";
        Odpowiedzi[5][2] = "B";
        Odpowiedzi[6][2] = "B";
        Odpowiedzi[7][2] = "A";
        Odpowiedzi[8][2] = "B";
        Odpowiedzi[9][2] = "B";

        Odpowiedzi[0][3] = "D";
        Odpowiedzi[1][3] = "D";
        Odpowiedzi[2][3] = "A";
        Odpowiedzi[3][3] = "A";
        Odpowiedzi[4][3] = "D";
        Odpowiedzi[5][3] = "A";
        Odpowiedzi[6][3] = "B";
        Odpowiedzi[7][3] = "C";
        Odpowiedzi[8][3] = "A";
        Odpowiedzi[9][3] = "A";

        Odpowiedzi[0][4] = "D";
        Odpowiedzi[1][4] = "B";
        Odpowiedzi[2][4] = "D";
        Odpowiedzi[3][4] = "D";
        Odpowiedzi[4][4] = "C";
        Odpowiedzi[5][4] = "B";
        Odpowiedzi[6][4] = "A";
        Odpowiedzi[7][4] = "B";
        Odpowiedzi[8][4] = "B";
        Odpowiedzi[9][4] = "A";

        Odpowiedzi[0][5] = "A";
        Odpowiedzi[1][5] = "A";
        Odpowiedzi[2][5] = "D";
        Odpowiedzi[3][5] = "B";
        Odpowiedzi[4][5] = "B";
        Odpowiedzi[5][5] = "C";
        Odpowiedzi[6][5] = "B";
        Odpowiedzi[7][5] = "B";
        Odpowiedzi[8][5] = "B";
        Odpowiedzi[9][5] = "A";

        Odpowiedzi[0][6] = "A";
        Odpowiedzi[1][6] = "C";
        Odpowiedzi[2][6] = "C";
        Odpowiedzi[3][6] = "A";
        Odpowiedzi[4][6] = "D";
        Odpowiedzi[5][6] = "C";
        Odpowiedzi[6][6] = "C";
        Odpowiedzi[7][6] = "B";
        Odpowiedzi[8][6] = "A";
        Odpowiedzi[9][6] = "C";

        Odpowiedzi[0][7] = "C";
        Odpowiedzi[1][7] = "D";
        Odpowiedzi[2][7] = "D";
        Odpowiedzi[3][7] = "A";
        Odpowiedzi[4][7] = "D";
        Odpowiedzi[5][7] = "D";
        Odpowiedzi[6][7] = "C";
        Odpowiedzi[7][7] = "C";
        Odpowiedzi[8][7] = "A";
        Odpowiedzi[9][7] = "D";

        Odpowiedzi[0][8] = "D";
        Odpowiedzi[1][8] = "A";
        Odpowiedzi[2][8] = "A";
        Odpowiedzi[3][8] = "D";
        Odpowiedzi[4][8] = "A";
        Odpowiedzi[5][8] = "D";
        Odpowiedzi[6][8] = "A";
        Odpowiedzi[7][8] = "C";
        Odpowiedzi[8][8] = "D";
        Odpowiedzi[9][8] = "B";

        Odpowiedzi[0][9] = "D";
        Odpowiedzi[1][9] = "B";
        Odpowiedzi[2][9] = "A";
        Odpowiedzi[3][9] = "B";
        Odpowiedzi[4][9] = "A";
        Odpowiedzi[5][9] = "B";
        Odpowiedzi[6][9] = "C";
        Odpowiedzi[7][9] = "D";
        Odpowiedzi[8][9] = "B";
        Odpowiedzi[9][9] = "B";

        int p = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = sc.nextLine();
        int b = 0;

        for(int i = 1; i<11;i++){
            Random r = new Random();
            int a = r.nextInt(10);
            System.out.println(Pytania[a][b]);
            String answer = sc.nextLine();
            answer = answer.toUpperCase();
            if(answer.equals(Odpowiedzi[a][b])){
                System.out.println("\nDobra odpowiedź!\n");
                p += i ;
            }
            b++;
        }

        System.out.println("Zdobyłeś :"+p+" punktów");

        try {
            FileWriter fw = new FileWriter(ad, true);
            fw.write("Imię: "+imie+" ,Punkty: "+p+"\n");
            fw.close();
        }
        catch (IOException ex){
            Logger.getLogger(JakubDrzala.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}