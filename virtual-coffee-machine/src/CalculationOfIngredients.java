import java.util.Scanner;

public class CalculationOfIngredients {
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
    }
}
