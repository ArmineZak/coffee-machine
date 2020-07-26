import java.util.Scanner;

public class CoffeeLoop {

    public static void main(String[] args) {
        String userInput = "userInput";
        Features features = new Features();


        while (!"exit".equals(userInput)) {
            System.out.println("Write action buy, fill, take, remaining, exit:");
            Scanner input = new Scanner(System.in);
            userInput = input.nextLine();

            if ("exit".equals(userInput)) {
                break;
            } else
                features.checkInput(userInput);
        }
    }
}

