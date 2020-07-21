import java.util.Scanner;

public class CoffeeLoop {
    public static Scanner sc = new Scanner(System.in);
    public static int milk = 400;
    public static int water = 540;
    public static int coffee = 120;
    public static int cups = 9;
    public static int cash = 550;
    private static String input;//this was added here automatically

    public static void main(String[] args) {


        while (true) {
            System.out.print("Write action buy, fill, take, remaining, exit:\n" + "> ");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();

            if ("exit".equals(userInput)) {
                break;
            } else {
                checkInput(userInput);
            }
        }
    }

    public static void checkInput(String input) {
        CoffeeLoop.input = input;
        switch (input) {
            case "fill":
                fill();
                break;
            case "buy":
                buy();
                break;
            case "remaining":
                remain();
                break;
            case "take":
                take();
                break;
            default:
                break;
        }

    }


    //this method fills ingredients from input and gives the remaining amount
    public static void fill() {

        System.out.print("Fill water: \n" + "> ");
        int fillWater = sc.nextInt();
        water += fillWater;

        System.out.print("Fill milk: \n" + "> ");
        int fillMilk = sc.nextInt();
        milk += fillMilk;

        System.out.print("Fill coffee: \n" + "> ");
        int fillCoffee = sc.nextInt();
        coffee += fillCoffee;

        System.out.print("Add cups: \n" + "> ");
        int addCups = sc.nextInt();
        coffee += addCups;

        System.out.println("Machine has\n " +
                water + " ml water\n" +
                milk + " ml milk\n" +
                coffee + " g coffee\n" +
                cups + " cups\n" +
                cash + "$\n");
    }


    //this method shows the amount of remaining ingredients
    public static void remain() {
        System.out.println("Remaining:\n" +
                water + " ml water\n" +
                milk + " ml milk\n" +
                coffee + " gr coffee\n" +
                cups + " cups\n" +
                cash + "$");

    }

    //this method shows the amount of cash and asks how much to take from it
    public static void take() {
        System.out.print("Cash in machine: " + cash + "$   " + "How much money do you want to take?\n" + "> ");
        int takeCash = sc.nextInt();
        cash -= takeCash;
        System.out.println("Cash in machine " + cash);

    }


    // this method is for choosing among different varieties of coffee
    //and to show whether ingredients are enough
    public static void buy() {
        System.out.print("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino\n" + "> ");
        int variety = sc.nextInt();

        switch (variety) {
            case 1: {
                if (water >= 250 && milk >= 0 && coffee >= 16 && cups >= 1) {
                    water -= 250;
                    milk -= 0;
                    coffee -= 16;
                    cups -= 1;
                    cash += 4;
                    System.out.println("I can make you coffee.");
                    revertBuy();

                } else {
                    System.out.print("Coffee machine is out of ingredients.\n" +
                            water + " ml water\n" +
                            milk + " ml milk\n" +
                            coffee + " g coffee\n" +
                            cups + " cups\n" +
                            cash + " $\n");
                    fill();
                }
            }
            break;
            case 2: {
                if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
                    water -= 350;
                    milk -= 75;
                    coffee -= 20;
                    cups -= 1;
                    cash += 7;
                    System.out.println("I can make you coffee.");
                    revertBuy();

                } else {
                    System.out.print("Coffee machine is out of ingredients.\n" +
                            water + " ml water\n" +
                            milk + " ml milk\n" +
                            coffee + " g coffee\n" +
                            cups + " cups\n" +
                            cash + " $\n");
                    fill();
                }
            }
            break;

            case 3: {
                if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
                    water -= 200;
                    milk -= 100;
                    coffee -= 12;
                    cups -= 1;
                    cash += 6;
                    System.out.println("I can make you coffee.");
                    revertBuy();

                } else {
                    System.out.print("Coffee machine is out of ingredients.\n" +
                            water + " ml water\n" +
                            milk + " ml milk\n" +
                            coffee + " g coffee\n" +
                            cups + " cups\n" +
                            cash + " $\n");
                    fill();
                }
            }
            break;
        }
    }

    //this method gives option to revert back to menu
    public static void revertBuy() {
        Scanner input = new Scanner(System.in);
        System.out.println("If you want to cancel your order type back or type any key to continue.");
        String userInput = input.nextLine();

        if ("back".equals(userInput)) {
            System.out.println("You are in main menu.");
        }
    }
}
