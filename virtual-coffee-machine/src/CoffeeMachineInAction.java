import java.util.Scanner ;

public class CoffeeMachineInAction {
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
    }

}
