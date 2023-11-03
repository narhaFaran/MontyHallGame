import java.util.Scanner;
public class MontyHallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MontyHallBott m = new MontyHallBott();
        m.assignCards();
        System.out.println(m.goat1);
        System.out.println(m.goat2);
        System.out.println(m.car);
        System.out.println(m.revealGoat(1));
    }

    public static class MontyHallBott {
        int goat1, goat2, car;
        public MontyHallBott(){}

        public void assignCards() {
            int num = (int)(Math.random()*3+1);
            this.car = num;
            if (num == 1) {
                this.goat1 = 2;
                this.goat2 = 3;
            } else if (num == 2) {
                this.goat1 = 1;
                this.goat2 = 3;
            } else {
                this.goat1 = 1;
                this.goat2 = 2;
            }
        }

        public String revealGoat(int c) {
            return "string";
        }

    }
}
