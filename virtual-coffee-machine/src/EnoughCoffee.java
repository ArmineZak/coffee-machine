import java.util.Scanner;
import java.lang.Math;

public class EnoughCoffee {
    public static void main(String[] args) {

        int waterForOneCup = 200;
        int milkForOneCup = 50;
        int coffeeBeansForOneCup = 15;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAmount = sc.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAmount = sc.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansAmount = sc.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsAmount = sc.nextInt();


        int minWater = waterAmount / waterForOneCup;
        int minMilk = milkAmount / milkForOneCup;
        int minCoffeeBeans = coffeeBeansAmount / coffeeBeansForOneCup;

        int min = Math.min(minWater, Math.min(minMilk, minCoffeeBeans));


        if (cupsAmount == min || cupsAmount < min) {
            if (cupsAmount == min) {
                System.out.println("Yes, I can make that amount of coffee.");

            } else if (cupsAmount < min) {
                System.out.println("Yes, I can make that amount of coffee(and even " + (min - cupsAmount) + " more than that)");
            }

        } else if (cupsAmount > min) {
            System.out.println("No, I can make only " + min + " cup(s) of coffee.");

        }
    }
}
