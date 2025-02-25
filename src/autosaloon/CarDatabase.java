package autosaloon;
import autosaloon.Car;
import autosaloon.Condition;
import java.util.Scanner;

public class CarDatabase {
static Scanner sc = new Scanner(System.in);
    String owner;
    Car[] cars;

    public CarDatabase(String owner){
        this.owner = owner;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
        cars = new Car[count];
        for (int i=0; i<count; i++){
            System.out.println("Zadej údaje o autě"+(i+1));
            System.out.println("Napiš rok výroby auta.");
int vyroba = sc.nextInt();
            System.out.println("Napiš počet najetých kilometrů auta.");
int kilometry = sc.nextInt();
sc.nextLine();
            System.out.println("Napiš barvu auta.");
String barva = sc.nextLine();
            System.out.println("Napiš stav auta.(BAD,GOOD,EXCELLENT,DAMAGED)");
            for(Condition c : Condition.values()){
                System.out.print(c+" ");
                String conditionString = sc.nextLine().toLowerCase();
                Condition condition = Condition.valueOf(conditionString);
                cars[i] = new Car(vyroba, kilometry, barva, condition);
            }
            //nacti od uzivatele rok vyroby, pocet najetych km, barvu a stav auta
            //vytvor instanci auta - nutno upravit i tridu Car, chceme instanci nastavit atributy na nactene hodnoty od uzivatele
            //pridej auto do pole aut
        }

    }

    public static Scanner getSc() {
        return sc;
    }

    public String getOwner() {
        return owner;
    }

    public Car[] getCars() {
        return cars;
    }

    /*
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij mezodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){
System.out.println("Dobrá auta jsou:");
for(Car car : cars){
    if (car.getStav()==Condition.good){
        System.out.println(car.getBarva()+"-"+car.getKilometry());
    }
}
    }
}
