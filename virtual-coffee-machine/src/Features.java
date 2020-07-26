import java.util.Scanner;

public class Features {

    private static Scanner sc = new Scanner(System.in);
    private int milk = 400;
    private int water = 540;
    private int coffee = 120;
    private int cups = 9;
    private int cash = 550;

    public Features() {
        this.milk = milk;
        this.water = water;
        this.coffee = coffee;
        this.cups = cups;
        this.cash = cash;
    }


    public void checkInput(String enter) {
        switch (enter) {
            case "fill":
                fill();
                break;
            case "buy":
                buy();
                break;
            case "remaining":
                remain();
                break;
            case "take":
                take();
                break;
            default:
                break;
        }

    }


    /**
     * this method fills ingredients with input and gives the remaining amount of them
     */
    public void fill() {

        System.out.println("Fill water:");
        int fillWater = sc.nextInt();
        water += fillWater;

        System.out.println("Fill milk:");
        int fillMilk = sc.nextInt();
        milk += fillMilk;

        System.out.println("Fill coffee:");
        int fillCoffee = sc.nextInt();
        coffee += fillCoffee;

        System.out.println("Add cups:");
        int addCups = sc.nextInt();
        cups += addCups;

        System.out.println("Machine has:");
        remainIngredients();
    }


    /**
     * this method shows the remaining ingredients
     */
    public void remain() {
        System.out.println("Remaining:");
        remainIngredients();
    }


    /**
     * this method shows the money in machine and asks how much money to give
     */
    public void take() {
        System.out.println("Cash in machine: " + cash + "$   " + "How much money do you want to take?");
        int takeCash = sc.nextInt();
        cash -= takeCash;
        System.out.println("Cash in machine " + cash);
    }


    /**
     * this method is for choosing among different varieties of coffee
     * and to show whether ingredients are enough
     */
    public void buy() {
        System.out.println("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino");
        int variety = sc.nextInt();

        switch (variety) {
            case 1:
                buyEspresso();
                break;
            case 2:
                buyLatte();
                break;
            case 3:
                buyCappuccino();
                break;
        }
    }


    //this method gives option to revert back to menu
    public void revertBuy() {
        Scanner input = new Scanner(System.in);
        System.out.println("If you want to cancel your order type back or type any key to continue.");
        String userInput = input.nextLine();

        if ("back".equals(userInput)) {
            System.out.println("You are in main menu.");
        } else {
            System.out.println("Coffee machine is out of ingredients.");
            remain();
        }
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
        }
    }

    //method shows necessary ingredients for Espresso
    private void buyEspresso() {
        makeCoffee(250, 0, 16, 4);

    }

    //method shows necessary ingredients for Latte
    private void buyLatte() {
        makeCoffee(350, 75, 20, 7);

    }

    //method shows necessary ingredients for Cappuccino
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




