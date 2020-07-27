import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachinePower coffeeMachinePower = new CoffeeMachinePower(400, 540, 12, 9, 550);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            coffeeMachinePower.checkInput(input);
        }
    }
}
