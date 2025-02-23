package bookstore;


public class BookStore {
    private String name;
    private Book[] books;

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu knih. A ty prida do pole knih.
     */
    public void addBoooks() {
        int count = 0; //spravne cislo nacti od uzivatele, použij scanner
        //books = new ....
        for (int i=0; i<count; count++){
            //nacti od uzivatele nazev, rok vydani, pocet stranek a zanr
            //pridej knihu do pole knih
        }

    }

    /**
     * Tato metoda vypise informace o knihach. Na prvnim rádku bude text "-----INFO O KNIHKUPECTVI----- ", na druhem bude název KNIHKUPECTVI a tecka.
     * Na tretim radku bude text "na sklade mame tyto knihy:" a následne budou vypsany vsichny knihy oddelene od sebe stredniken a to ve formátu "nazev : zanr : rok vydani" (Vyuzijte metodu printInfo() tridy Book.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O KNIHKUPECTVI-----");
        //sem dopln kod
        System.out.println("-----");
    }
}
