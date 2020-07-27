import java.util.Scanner;

public class CoffeeMachinePower {
    private int milk;
    private int water;
    private int coffee;
    private int cups;
    private int cash;
    private State state;

    public CoffeeMachinePower(int milk, int water, int coffee, int cups, int cash) {
        this.milk = milk;
        this.water = water;
        this.coffee = coffee;
        this.cups = cups;
        this.cash = cash;

        backToMenu("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);

    }

    /**
     * method switches between different features and changes the current state
     */
    public void checkInput(String enter) {
        switch (this.state) {
            case CHOOSING_ACTION:
                choosingAction(enter);
                break;
            case CHOOSING_COFFEE:
                choosingCoffee(enter);
                break;
            case FILLING:
                filling(enter);
                break;
            case TAKING:
                taking(enter);
                break;
            default:
                backToMenu("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);
        }
    }

    /**
     * method is to take money from machine
     */
    private void taking(String enter) {
        int cash = Integer.parseInt(enter);
        cashOut(cash);
    }

    /**
     * method fills the ingredients
     */
    private void filling(String enter) {
        String[] fillingParts = enter.split(" ");
        int milk = Integer.parseInt(fillingParts[0]);
        int coffee = Integer.parseInt(fillingParts[1]);
        int water = Integer.parseInt(fillingParts[2]);
        int cups = Integer.parseInt(fillingParts[3]);
        fill(milk, water, coffee, cups);

        backToMenu("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);
    }

    /**
     * method takes to main menu
     */
    private void backToMenu(String s, State choosingAction) {
        System.out.println(s);
        this.state = choosingAction;
    }

    /**
     * method chooses between variety of coffee
     */
    private void choosingCoffee(String enter) {
        CoffeeType coffeeType = CoffeeType.valueOf(enter.toUpperCase());
        switch (coffeeType) {
            case ESPRESSO:
                buyEspresso();
                break;
            case LATTE:
                buyLatte();
                break;
            case CAPPUCCINO:
                buyCappuccino();
                break;
        }

        //  goToHome("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);
    }

    /**
     * method chooses between actions and changes current state
     */
    private void choosingAction(String enter) {
        Action action = Action.valueOf(enter.toUpperCase());
        switch (action) {
            case FILL:
                suggestFilling();
                break;
            case BUY:
                backToMenu("What do you want to buy? espresso, latte, cappuccino", State.CHOOSING_COFFEE);
                break;
            case REMAINING:
                remain();
                break;
            case TAKE:
                take();
                break;
            default:
                break;
        }
    }

    /**
     * this method fills ingredients
     */
    private void fill(int milk, int water, int coffee, int cups) {
        this.water += water;
        this.milk += milk;
        this.coffee += coffee;
        this.cups += cups;
    }

    /**
     * this method shows the remaining ingredients
     */
    private void remain() {
        System.out.println("Remaining:");
        remainIngredients();
        backToMenu("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);
    }

    /**
     * this method shows the money in machine and asks how much money to give
     */
    private void take() {
        System.out.println("Cash in machine: " + cash + "$   " + "How much money do you want to take?");
        this.state = State.TAKING;
    }

    /**
     * method gives cash and returns to main menu
     */
    private void cashOut(int cash) {
        this.cash -= cash;
        System.out.println("Cash in machine: " + this.cash + "$");
        backToMenu("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);
    }

    /**
     * this method gives option to revert back to menu
     */
    private void revertBuy() {
        Scanner input = new Scanner(System.in);
        System.out.println("If you want to cancel your order type back or type any key to continue.");
        String userInput = input.nextLine();

        if ("back".equals(userInput)) {
            System.out.println("You are in main menu.");
        }
        backToMenu("Write buy, fill, take, remaining,exit", State.CHOOSING_ACTION);
    }

    /**
     * method fills ingredients into machine
     */
    private void suggestFilling() {
        backToMenu("Fill ingredients in following order milk coffee water cups", State.FILLING);
    }

    /**
     * method shows if ingredients are enough to make coffee if not suggests to fill
     */
    private void makeCoffee(int water, int milk, int coffee, int cash) {
        if (this.water >= water && this.milk >= milk && this.coffee >= coffee && this.cups >= 1) {
            this.water -= water;
            this.milk -= milk;
            this.coffee -= coffee;
            this.cups -= 1;
            this.cash += cash;
            System.out.println("I can make you coffee.");
            revertBuy();

        } else {
            System.out.println("Coffee machine is out of ingredients.");
            remainIngredients();
            suggestFilling();
        }
    }

    /**
     * method shows necessary ingredients for Espresso
     */
    private void buyEspresso() {
        makeCoffee(250, 0, 16, 4);

    }

    /**
     * method shows necessary ingredients for Latte
     */
    private void buyLatte() {
        makeCoffee(350, 75, 20, 7);

    }

    /**
     * method shows necessary ingredients for Cappuccino
     */
    private void buyCappuccino() {
        makeCoffee(200, 100, 12, 6);
    }

    /**
     * this method calculates the remaining ingredients
     */
    private void remainIngredients() {
        System.out.println(water + " ml water");
        System.out.println(milk + " ml milk");
        System.out.println(coffee + " gr coffee");
        System.out.println(cups + " cups");
        System.out.println(cash + "$");
    }
}



