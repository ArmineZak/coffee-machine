import java.util.Scanner;
import java.lang.Math;

public class EnoughCoffee {

    public static void main(String[] args) {

        int waterForOneCup = 200;
        int milkForOneCup = 50;
        int coffeeBeansForOneCup = 15;


        //using scanner to input necessary amount of ingredients
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAmount = sc.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAmount = sc.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansAmount = sc.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsAmount = sc.nextInt();


        //using Math.min to find the min possible amount of cups for each variety of coffee

        int minWater = waterAmount / waterForOneCup;
        int minMilk = milkAmount / milkForOneCup;
        int minCoffeeBeans = coffeeBeansAmount / coffeeBeansForOneCup;

        int min = Math.min(minWater, Math.min(minMilk, minCoffeeBeans));


        //checking cases for possible amount of cups to be made

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

