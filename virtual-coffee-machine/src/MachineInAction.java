import java.util.Scanner;

public class MachineInAction {

    private static Scanner sc = new Scanner(System.in);
    private int waterInMachine = 400;
    private int milkInMachine = 540;
    private int coffeeBeansInMachine = 120;
    private int disposableCupsInMachine = 9;
    private int moneyInMachine = 550;


    public MachineInAction() {
        this.waterInMachine = waterInMachine;
        this.milkInMachine = milkInMachine;
        this.coffeeBeansInMachine = coffeeBeansInMachine;
        this.disposableCupsInMachine = disposableCupsInMachine;
        this.moneyInMachine = moneyInMachine;
    }


    public static void main(String[] args) {

        MachineInAction machineInAction = new MachineInAction();
        machineInAction.remain();

        System.out.println("Write action (buy, fill, take)");
        String action = sc.nextLine();


        if ("buy".equals(action)) {
            machineInAction.buy();
        } else if ("fill".equals(action)) {
            machineInAction.fill();
        } else if ("take".equals(action)) {
            machineInAction.take();
        }

    }

    /**
     * the method chooses among variety of coffee
     */
    public void buy() {

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

    /**
     * method uses input to fill ingredients and lists their amount after being filled
     */
    public void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int waterAmount = sc.nextInt();
        milkInMachine += waterAmount;

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

    /**
     * method is for taking money from machine and listing the remaining ingredients
     */
    public void take() {
        System.out.println("Write how much do you want to take:");
        int moneyAmount = sc.nextInt();
        moneyInMachine -= moneyAmount;

        System.out.println("I gave you $" + moneyAmount);

        remain();

    }

    /**
     * calculates ingredients needed for espresso and lists the remaining part
     */
    public void buyEspresso() {
        waterInMachine -= 250;
        milkInMachine -= 0;
        coffeeBeansInMachine -= 16;
        disposableCupsInMachine -= 1;
        moneyInMachine += 4;
        remain();

    }

    /**
     * calculates ingredients needed for latte and lists the remaining part
     */
    public void buyLatte() {
        waterInMachine -= 350;
        milkInMachine -= 75;
        coffeeBeansInMachine -= 20;
        disposableCupsInMachine -= 1;
        moneyInMachine += 7;
        remain();

    }

    /**
     * calculates ingredients needed for cappuccino and lists the remaining part
     */
    public void buyCappuccino() {
        waterInMachine -= 200;
        milkInMachine -= 100;
        coffeeBeansInMachine -= 12;
        disposableCupsInMachine -= 1;
        moneyInMachine += 6;
        remain();

    }

    /**
     * method shows the remaining part of ingredients and money
     */
    public void remain() {
        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " ml  of water");
        System.out.println(milkInMachine + " ml of milk");
        System.out.println(coffeeBeansInMachine + " g of coffee beans");
        System.out.println(disposableCupsInMachine + "  of disposable cups");
        System.out.println(moneyInMachine + " of money");

    }

}





