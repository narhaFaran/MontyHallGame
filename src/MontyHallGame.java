import java.util.Scanner;
public class MontyHallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MontyHallBot m = new MontyHallBot();
        m.assignDoors();

        System.out.println("Welcome to the Monty Hall Game!\n");
        System.out.println("There are two goats and a car each behind doors 1, 2, and 3.");
        System.out.println("Guess which door the car is in. 1, 2, or 3: ");
        int guess = scanner.nextInt();
        int oneGoat = m.revealGoat(guess);
        System.out.println("There is a goat behind door " + oneGoat);
        int hidden = 0;
        if (guess == 1) {
            if(oneGoat == 2) {
                hidden = 3;
            } else if (oneGoat == 3) {
                hidden = 2;
            }
        } else if (guess == 2) {
            if (oneGoat == 1) {
                hidden = 3;
            } else if (oneGoat == 3){
                hidden = 1;
            }
        } else {
            if (oneGoat == 1) {
                hidden = 2;
            } else {
                hidden = 1;
            }
        }

        System.out.println("Switch your guess? 0 for no, 1 for yes: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Guess switched from " + guess + " to " + hidden);
            guess = hidden;
        }
        System.out.println("The car is behind door " + m.car + ". ");
        if (guess == m.car) {
            System.out.print("You won a car!");
        } else {
            System.out.print("You won a goat!");
        }

    }

    public static class MontyHallBot {
        int goat1, goat2, car;
        public MontyHallBot(){}

        public MontyHallBot(int a, int b, int c) {
            this.goat1 = a;
            this.goat2 = b;
            this.car = c;
        }


        public void assignDoors() {
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

        public int revealGoat(int c) {
            int num;
            if (c == 1) {
                if (c == car) {
                    num = (int)(Math.random()*2);
                    if (num == 0) {
                        return goat1;
                    } else {
                        return goat2;
                    }
                } else {
                    return goat2;
                }
            } else if (c == 2) {
                if (c == car) {
                    num = (int)(Math.random()*2);
                    if (num == 1) {
                        return goat1;
                    } else {
                        return goat2;
                    }
                } else {
                    if(car == 1) {
                        return goat2;
                    } else {
                        return goat1;
                    }
                }
            } else  {
                if (c == car) {
                    num = (int)(Math.random()*2);
                    if (num == 1) {
                        return goat1;
                    } else {
                        return goat2;
                    }
                } else {
                    return goat1;
                }
            }
        }
    }
}
