package autosaloon;

public class Car {
private int vyroba;
        private int kilometry;
        private String barva;
private Condition stav;
public Car(int vyroba, int kilometry, String barva, Condition stav) {
        this.vyroba = 1998;
        this.kilometry = 5000;
        this.barva = "Černá";
        this.stav = stav;
}

        public int getVyroba() {
                return vyroba;
        }

        public int getKilometry() {
                return kilometry;
        }

        public String getBarva() {
                return barva;
        }

        public Condition getStav() {
                return stav;
        }

        public void printInfo(){
        System.out.println("Vyroba: " + vyroba);
        System.out.println("Kilometry" + kilometry);
        System.out.println("Barva: " + barva);
        System.out.println("Stav: " + stav);
    }
}
