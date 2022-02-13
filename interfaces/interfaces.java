package interfaces;

import java.util.Scanner;

public class interfaces {
    interface vending {
        void input(int i);

        int total();
    }

    static class Chocolate implements vending {
        int number;

        public void input(int i) {
            number = i;
        }

        public int total() {
            return number * 20;
        }
    }

    static class ColdDrink implements vending {
        int number;

        public void input(int i) {
            number = i;
        }

        public int total() {
            return number * 30;
        }
    }

    static class Chips implements vending {
        int number;

        public void input(int i) {
            number = i;
        }

        public int total() {
            return number * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                "WELCOME TO VENDING MACHINE\n\n CHOCOLATE IS OF Rs.20 EACH\n COLD DRINK IS OF Rs.30 EACH\n CHIPS IS OF Rs.10 EACH");
        Scanner sc = new Scanner(System.in);
        int number;
        Chocolate chocobar = new Chocolate();
        ColdDrink drink = new ColdDrink();
        Chips chips = new Chips();

        System.out.println("\nEnter the number of chocolates:- ");
        number = sc.nextInt();
        chocobar.input(number);

        System.out.println("\nEnter the number of Cold drinks:- ");
        number = sc.nextInt();
        drink.input(number);

        System.out.println("\nEnter the number of Chips:- ");
        number = sc.nextInt();
        chips.input(number);

        int Total = chocobar.total() + drink.total() + chips.total();
        System.out.println("\n\nTOTAL AMOUNT TO BE PAID = Rs. " + Total);

        sc.close();
    }
}
