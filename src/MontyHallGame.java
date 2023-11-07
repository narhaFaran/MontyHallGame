import java.util.Scanner;
public class MontyHallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MontyHallBot m = new MontyHallBot(1,2,3);
        System.out.println(m.goat1);
        System.out.println(m.goat2);
        System.out.println(m.car);
        int num = scanner.nextInt();
        System.out.println(m.revealGoat(num));

    }

    public static class MontyHallBot {
        int goat1, goat2, car;
        public MontyHallBot(){}

        public MontyHallBot(int a, int b, int c) {
            this.goat1 = a;
            this.goat2 = b;
            this.car = c;
        }


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
            int num;
            if (c == 1) {
                if (c == car) {
                    num = (int)(Math.random()*2);
                    if (num == 0) {
                        return "There is a goat behind door " + goat1;
                    } else {
                        return "There is a goat behind door " + goat2;
                    }
                } else {
                    if(car == 2) {
                        return "There is a goat behind door " + goat2;
                    } else {
                        return "there is a goat behind door " + goat2;
                    }
                }
            } else if (c == 2) {
                if (c == car) {
                    num = (int)(Math.random()*2);
                    if (num == 1) {
                        return "There is a goat behind door " + goat1;
                    } else {
                        return "There is a goat behind door " + goat2;
                    }
                } else {
                    if(car == 1) {
                        return "There is a goat behind door " + goat2;
                    } else {
                        return "There is a goat behind door " + goat1;
                    }
                }
            } else  {
                if (c == car) {
                    num = (int)(Math.random()*2);
                    if (num == 1) {
                        return "There is a goat behind door " + goat1;
                    } else {
                        return "There is a goat behind door " + goat2;
                    }
                } else {
                    return "There is a goat behind door " + goat1;
                }
            }
        }

    }
}
