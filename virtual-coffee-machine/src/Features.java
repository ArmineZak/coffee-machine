import java.util.Scanner;

public class Features {

    private static Scanner sc = new Scanner(System.in);
    private static int milk = 400;
    private static int water = 540;
    private static int coffee = 120;
    private static int cups = 9;
    private static int cash = 550;


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


    //this method fills ingredients with input and gives the remaining amount of them
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



    //this method shows the remaining ingredients
    public void remain() {
        System.out.println("Remaining:");
        remainIngredients();
    }



    //this method shows the money in machine and asks how much money to give
    public void take() {
        System.out.println("Cash in machine: " + cash + "$   " + "How much money do you want to take?");
        int takeCash = sc.nextInt();
        cash -= takeCash;
        System.out.println("Cash in machine " + cash);
    }



    // this method is for choosing among different varieties of coffee
    //and to show whether ingredients are enough
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
        }
    }


    //shows whether ingredients are enough to make Espresso or not
    public void buyEspresso() {
        if (water >= 250 && milk >= 0 && coffee >= 16 && cups >= 1) {
            water -= 250;
            milk -= 0;
            coffee -= 16;
            cups -= 1;
            cash += 4;
            System.out.println("I can make you coffee.");
            revertBuy();

        } else {

            System.out.println("Coffee machine is out of ingredients.");
            remainIngredients();
            fill();
        }
    }


    //shows whether ingredients are enough to make Latte or not
    public void buyLatte() {
        if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
            water -= 350;
            milk -= 75;
            coffee -= 20;
            cups -= 1;
            cash += 7;
            System.out.println("I can make you coffee.");
            revertBuy();

        } else {
            System.out.println("Coffee machine is out of ingredients.");
            remainIngredients();
            fill();
        }
    }


    //shows whether ingredients are enough to make Cappuccino or not
    public void buyCappuccino() {
        if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
            water -= 200;
            milk -= 100;
            coffee -= 12;
            cups -= 1;
            cash += 6;
            System.out.println("I can make you coffee.");
            revertBuy();

        } else {

            System.out.println("Coffee machine is out of ingredients.");
            remainIngredients();
            fill();
        }
    }

//this method calculates the remaining ingredients
    public void remainIngredients() {
        System.out.println(water + " ml water");
        System.out.println(milk + " ml milk");
        System.out.println(coffee + " gr coffee");
        System.out.println(cups + " cups");
        System.out.println(cash + "$");
    }
}



