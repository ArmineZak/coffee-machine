import java.util.Scanner;

public class EnoughCoffeeForEveryone {
    public static void main(String[] args) {

        int waterForOneCup = 200;
        int milkForOneCup = 50;
        int coffeeBeansForOneCup = 15;

        Scanner scanWater = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:\n" + "> ");
        int waterAmount = scanWater.nextInt();

        Scanner scanMilk = new Scanner(System.in);
        System.out.print("\nWrite how many ml of milk the coffee machine has:\n" + "> ");
        int milkAmount = scanMilk.nextInt();

        Scanner scanCoffeeBeans = new Scanner(System.in);
        System.out.print("\nWrite how many grams of coffee beans the coffee machine has:\n" + "> ");
        int coffeeBeansAmount = scanCoffeeBeans.nextInt();

        Scanner scanAmountOfCups = new Scanner(System.in);
        System.out.print("\nWrite how many cups of coffee you will need:\n" + "> ");
        int cupsAmount = scanAmountOfCups.nextInt();


        int min = waterAmount / waterForOneCup;
        min = (min < milkAmount / milkForOneCup) ? min : milkAmount / milkForOneCup;
        min = (min < coffeeBeansAmount / coffeeBeansForOneCup) ? min : coffeeBeansAmount / coffeeBeansForOneCup;


        if (cupsAmount == min) {
            System.out.println("Yes, I can make that amount of coffee.");

        } else if (cupsAmount > min) {
            System.out.println("No, I can make only " + min + " cup(s) of coffee.");


        }
    }
}
