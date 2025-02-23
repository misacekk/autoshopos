package cinema;

public class Film {

    private String name;
    private int year;
    private People[] actors;

    private People director;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu hercu. A ty prida do pole actors.
     * @param count - pozadovany pocet hercu
     */
    public void addActors(int count) {
        //actors = new ....
        for (int i=0; i<count; count++){
            //nacti od uzivatele jmeno, rodne mesto a pohlavi herce
            //pridej herce do pole hercu
        }

    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O FILMU----- ", na druhem bude nazev, rok vydani filmu.
     * Na tretim radku bude text "herci" a následne budou vypsani vsichni herci oddeleni od sebe carkou a to ve formatu "jmeno - pohlavi" (Vyuzijte metodu printInfo() tridy People.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O FILMU-----");
        //sem dopln kod
        System.out.println("-----");
    }
}
