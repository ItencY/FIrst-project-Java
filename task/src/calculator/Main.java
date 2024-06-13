package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bubblegum = 202;
        double toffee = 118;
        double iceCream = 2250;
        double milkChocolate = 1680;
        double doughnut = 1075;
        double pancake = 80;

        double income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: " + "$" + bubblegum);
        System.out.println("Toffee: " + "$" + toffee);
        System.out.println("Ice cream: " + "$" + iceCream);
        System.out.println("Milk chocolate: " + "$" + milkChocolate);
        System.out.println("Doughnut: " + "$" + doughnut);
        System.out.println("Pancake: " + "$" + pancake);
        System.out.println("Income: " + "$" + income);

        System.out.println("Staff expenses:");
        Scanner scanner = new Scanner(System.in);
        double staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextInt();

        int netIncome = (int) (income - staffExpenses - otherExpenses);
        System.out.printf("Net income: %d", netIncome);
    }
}