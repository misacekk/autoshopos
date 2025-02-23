package moviestore;

public class MovieDatabase {
    private String name;
    private Movie[] movies;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu filmu. A ty prida do pole movies.
     * @param count - pozadovany pocet hercu
     */
    public void addMovies(int count) {
        //movies = new ....
        for (int i=0; i<count; count++){
            //nacti od uzivatele nazev, rok natoceni, delku filmu a zanr
            //pridej film do pole filmu
        }

    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O MOVIE----- ", na druhem bude název filmove databaze a dvojtecka.
     * Na tretim radku bude text "filmy:" a následne budou vypsany vsichny filmy oddelene od sebe carkou a to ve formátu "nazev - zanr - rok natoceni" (Vyuzijte metodu printInfo() tridy Movie.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O MOVIE-----");
        //sem dopln kod
        System.out.println("-----");
    }
}
