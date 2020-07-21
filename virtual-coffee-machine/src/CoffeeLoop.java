import java.util.Scanner;

public class CoffeeLoop {
    public static Scanner sc = new Scanner(System.in);
    public static int milk = 400;
    public static int water = 540;
    public static int coffee = 120;
    public static int cups = 9;
    public static int cash = 550;

    public static void main(String[] args) {


    }

    //this method fills ingredients from input and gives the remaining amount
    public static void fill() {

        System.out.print("Fill water: \n" + "> ");
        int fillWater = sc.nextInt();
        water += fillWater;

        System.out.print("Fill milk: \n" + "> ");
        int fillMilk = sc.nextInt();
        milk += fillMilk;

        System.out.print("Fill coffee: \n" + "> ");
        int fillCoffee = sc.nextInt();
        coffee += fillCoffee;

        System.out.println("Machine has\n " +
                water + " ml water\n" +
                milk + " ml milk\n" +
                coffee + " g coffee\n" +
                cash + "$\n");
    }

}
