import java.util.Scanner;

public class MachineInAction {

    private static Scanner sc = new Scanner(System.in);
    private static int waterInMachine = 400;
    private static int milkInMachine = 540;
    private static int coffeeBeansInMachine = 120;
    private static int disposableCupsInMachine = 9;
    private static int moneyInMachine = 550;


    public static void main(String[] args) {

        remain();

        System.out.println("Write action (buy, fill, take)");
        String action = sc.nextLine();


        if ("buy".equals(action)) {
            buy();
        } else if ("fill".equals(action)) {
            fill();
        } else if ("take".equals(action)) {
            take();
        }

    }

    //the method chooses among variety of coffee
    public static void buy() {

        System.out.println("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino:");
        int coffee = sc.nextInt();

        switch (coffee) {
            case 1: {
                buyEspresso();
                break;
            }
            case 2: {
                buyLatte();
                break;
            }
            case 3: {
                buyCappuccino();
                break;
            }
        }
    }

    //method uses input to fill ingredients and lists their amount after being filled
    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int waterAmount = sc.nextInt();
        waterInMachine += waterAmount;

        System.out.println("Write how many ml of milk do you want to add:");
        int milkAmount = sc.nextInt();
        milkInMachine += milkAmount;


        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeeBeansAmount = sc.nextInt();
        coffeeBeansInMachine += coffeeBeansAmount;

        System.out.println("Write how many disposable cups of coffee do you want:");
        int disposableCupsAmount = sc.nextInt();
        disposableCupsInMachine += disposableCupsAmount;

        remain();

    }

    //method is for taking money from machine and listing the remaining ingredients
    public static void take() {
        System.out.println("Write how much do you want to take:");
        int moneyAmount = sc.nextInt();
        moneyInMachine -= moneyAmount;

        System.out.println("I gave you $" + moneyAmount);

        remain();

    }

    //calculates ingredients needed for espresso and lists the remaining part
    public static void buyEspresso() {
        waterInMachine -= 250;
        milkInMachine -= 0;
        coffeeBeansInMachine -= 16;
        disposableCupsInMachine -= 1;
        moneyInMachine += 4;
        remain();

    }

    //calculates ingredients needed for latte and lists the remaining part
    public static void buyLatte() {
        waterInMachine -= 350;
        milkInMachine -= 75;
        coffeeBeansInMachine -= 20;
        disposableCupsInMachine -= 1;
        moneyInMachine += 7;
        remain();

    }

    //calculates ingredients needed for cappuccino and lists the remaining part
    public static void buyCappuccino() {
        waterInMachine -= 200;
        milkInMachine -= 100;
        coffeeBeansInMachine -= 12;
        disposableCupsInMachine -= 1;
        moneyInMachine += 6;
        remain();

    }

    //method shows the remaining part of ingredients and money
    public static void remain() {
        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " ml  of water");
        System.out.println(milkInMachine + " ml of milk");
        System.out.println(coffeeBeansInMachine + " g of coffee beans");
        System.out.println(disposableCupsInMachine + "  of disposable cups");
        System.out.println(moneyInMachine + " of money");

    }

}





