import java.util.Scanner;

public class Features {

    public static Scanner sc = new Scanner(System.in);
    public static int milk = 400;
    public static int water = 540;
    public static int coffee = 120;
    public static int cups = 9;
    public static int cash = 550;


    public static void checkInput(String enter) {
        switch (enter) {
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

    //this method fills ingredients with input and gives the remaining amount of them
    public static void fill() {

        System.out.println("Fill water:");
        int fillWater = sc.nextInt();
        water += fillWater;

        System.out.println("Fill milk:");
        int fillMilk = sc.nextInt();
        milk += fillMilk;

        System.out.println("Fill coffee:");
        int fillCoffee = sc.nextInt();
        coffee += fillCoffee;

        System.out.println("Add cups:");
        int addCups = sc.nextInt();
        cups += addCups;

        System.out.println("Machine has:");
        System.out.println(water + " ml water");
        System.out.println(milk + " ml milk");
        System.out.println(coffee + " g coffee");
        System.out.println(cups + " cups");
        System.out.println(cash + "$");

    }

    //this method shows the remaining ingredients
    public static void remain() {
        System.out.println("Remaining:");
        System.out.println(water + " ml water");
        System.out.println(milk + " ml milk");
        System.out.println(coffee + " gr coffee");
        System.out.println(cups + " cups");
        System.out.println(cash + "$");

    }

    public static void take() {
        System.out.println("Cash in machine: " + cash + "$   " + "How much money do you want to take?");
        int takeCash = sc.nextInt();
        cash -= takeCash;
        System.out.println("Cash in machine " + cash);

    }

    // this method is for choosing among different varieties of coffee
    //and to show whether ingredients are enough
    public static void buy() {
        System.out.println("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino");
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
                    System.out.println("Coffee machine is out of ingredients.");
                    System.out.println(water + " ml water");
                    System.out.println(milk + " ml milk");
                    System.out.println(coffee + " g coffee");
                    System.out.println(cups + " cups");
                    System.out.println(cash + " $");
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
                    System.out.println("Coffee machine is out of ingredients.");
                    System.out.println(water + " ml water");
                    System.out.println(milk + " ml milk");
                    System.out.println(coffee + " g coffee");
                    System.out.println(cups + " cups");
                    System.out.println(cash + " $");
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
                    System.out.println("Coffee machine is out of ingredients.");
                    System.out.println(water + " ml water");
                    System.out.println(milk + " ml milk");
                    System.out.println(coffee + " g coffee");
                    System.out.println(cups + " cups");
                    System.out.println(cash + " $");
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

