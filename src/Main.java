import java.util.Scanner;
import autosaloon.CarDatabase;
import bookstore.BookStore;
import cinema.Film;
import elektroshop.Items;
import library.Book;
import library.Library;
import moviestore.MovieDatabase;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String vstup ="";

        while(!vstup.equals("0")) {
            System.out.println("Vitejde v obchode. Pro vstup do autosalonu stisknete 1, pro vstup do kina 1, pro vstup do elektro obchodu 3, pro vstup do knihovny 4 a pro vstup do video pujcovny 5.");
            System.out.println("Pro ukonceni programu stisknete 0.");
            vstup = sc.nextLine();

            switch(vstup) {
                case "1":
                    CarDatabase carDatabase = new CarDatabase();
                    System.out.println("Kolik si prejete pridat aut?");
                    int pocet = sc.nextInt();
                    sc.nextLine();
                    carDatabase.addCars(pocet);
                    carDatabase.printCarInGoodCondition();
                    break;
                case "2":
                    BookStore knihkupectvi = new BookStore();
                    knihkupectvi.addBoooks();
                    knihkupectvi.printInfo();
                    break;
                case "3":
                    Film film = new Film();
                    System.out.println("Kolik si prejete pridat hercu?");
                    pocet = sc.nextInt();
                    sc.nextLine();
                    film.addActors(pocet);
                    film.printInfo();
                    break;
                case "4":
                    Items items = new Items();
                    System.out.println("Kolik si prejete pridat položek?");
                    pocet = sc.nextInt();
                    sc.nextLine();
                    items.addItems(pocet);
                    items.printInfo();
                    break;
                case "5":
                    Library library = new Library();
                    System.out.println("Kolik si prejete pridat položek?");
                    pocet = sc.nextInt();
                    sc.nextLine();
                    library.addItems(pocet);
                    library.printInfo();
                    break;
                case "6":
                    MovieDatabase movieDatabase = new MovieDatabase();
                    System.out.println("Kolik si prejete pridat filmu?");
                    pocet = sc.nextInt();
                    sc.nextLine();
                    movieDatabase.addMovies(pocet);
                    movieDatabase.printInfo();
                    break;
                default:
                    System.out.println("Zadana neplatna volba. Oprav se: ");
            }

        }
        System.out.println("Konec programu.");
    }
}