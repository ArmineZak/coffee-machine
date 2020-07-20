import java.util.Scanner;

public class CoffeeMachineInActionRound2 {
    public static void main(String[] args) {

        int waterInMachine = 400;
        int milkInMachine = 540;
        int coffeeBeansInMachine = 120;
        int disposableCupsInMachine = 9;
        int moneyInMachine = 550;

        int waterForEspresso = 250;
        int milkForEspresso = 0;
        int coffeeBeansForEspresso = 16;
        int disposableCupsForEspresso = 1;
        int costOfEspresso = 4;

        int waterForLatte = 350;
        int milkForLatte = 75;
        int coffeeBeansForLatte = 20;
        int disposableCupsForLatte = 1;
        int costOfLatte = 7;

        int waterForCappuccino = 200;
        int milkForCappuccino = 100;
        int coffeeBeansForCappuccino = 12;
        int disposableCupsForCappuccino = 1;
        int costOfCappuccino = 6;


        System.out.println("The coffee machine has:\n" +
                waterInMachine + "  of water\n" +
                milkInMachine + "  of milk\n" +
                coffeeBeansInMachine + "  of coffee beans\n" +
                disposableCupsInMachine + "    of disposable cups\n" +
                moneyInMachine + "  of money");

        Scanner sc = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take)\n" + "> ");
        String action = sc.nextLine();

        switch (action) {
            case "buy": {
                System.out.print("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino:\n" + ">");
                int coffee = sc.nextInt();

                if (coffee == 1) {
                    System.out.println("The coffee machine has:\n" +
                            (waterInMachine - waterForEspresso) + " ml  of water\n" +
                            (milkInMachine - milkForEspresso) + " ml of milk\n" +
                            (coffeeBeansInMachine - coffeeBeansForEspresso) + " g of coffee beans\n" +
                            (disposableCupsInMachine - 1) + "  of disposable cups\n" +
                            (moneyInMachine + costOfEspresso) + " of money");

                } else if (coffee == 2)
                    System.out.println("The coffee machine has:\n" +
                            (waterInMachine - waterForLatte) + " ml  of water\n" +
                            (milkInMachine - milkForLatte) + " ml of milk\n" +
                            (coffeeBeansInMachine - coffeeBeansForLatte) + " g of coffee beans\n" +
                            (disposableCupsInMachine - 1) + "  of disposable cups\n" +
                            (moneyInMachine + costOfLatte) + " of money");

                else if (coffee == 3)
                    System.out.println("The coffee machine has:\n" +
                            (waterInMachine - waterForCappuccino) + " ml  of water\n" +
                            (milkInMachine - milkForCappuccino) + " ml of milk\n" +
                            (coffeeBeansInMachine - coffeeBeansForCappuccino) + " g of coffee beans\n" +
                            (disposableCupsInMachine - 1) + "  of disposable cups\n" +
                            (moneyInMachine + costOfCappuccino) + " of money");
                break;
            }

            case "fill": {
                System.out.print("Write how many ml of water do you want to add:\n" + "> ");
                int waterAmount = sc.nextInt();

                System.out.print("\nWrite how many ml of milk do you want to add:\n" + "> ");
                int milkAmount = sc.nextInt();

                System.out.print("\nWrite how many grams of coffee beans do you want to add:\n" + "> ");
                int coffeeBeansAmount = sc.nextInt();

                System.out.print("\nWrite how many disposable cups of coffee do you want:\n" + "> ");
                int disposableCupsAmount = sc.nextInt();

                System.out.println("The coffee machine has:\n" +
                        (waterInMachine + waterAmount) + " ml  of water\n" +
                        (milkInMachine + milkAmount) + " ml of milk\n" +
                        (coffeeBeansInMachine + coffeeBeansAmount) + " g of coffee beans\n" +
                        (disposableCupsInMachine + disposableCupsAmount) + "  of disposable cups\n" +
                        moneyInMachine + " of money");
                break;
            }
            case "take": {
                System.out.println("I gave you $" + moneyInMachine);
                System.out.println("The coffee machine has:\n" +
                        waterInMachine + "  of water\n" +
                        milkInMachine + "  of milk\n" +
                        coffeeBeansInMachine + "  of coffee beans\n" +
                        disposableCupsInMachine + "    of disposable cups\n" +
                        (moneyInMachine - moneyInMachine) + "    of money");
                break;

            }
        }
    }
}


