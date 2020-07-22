import java.util.Scanner;

public class CoffeeLoop {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Write action buy, fill, take, remaining, exit:");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();

            if ("exit".equals(userInput)) {
                break;
            } else
                Features.checkInput(userInput);
        }
    }
}

