import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int waterForOneCup = 200;
        int milkForOneCup = 50;
        int coffeeBeansForOneCup = 15;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many cups of coffee you will need:\n" + ">  ");
        int coffeeAmount = sc.nextInt();

        System.out.println("For " + coffeeAmount + " cups of coffee you will need\n" +
                coffeeAmount * waterForOneCup + " ml of water\n" +
                coffeeAmount * milkForOneCup + " ml of milk\n" +
                coffeeAmount * coffeeBeansForOneCup + " g of coffee beans");

        /*      "Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!"
         */
    }
}
