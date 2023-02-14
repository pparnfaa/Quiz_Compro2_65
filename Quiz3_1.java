package Class_Programming;

import java.util.Scanner;

class FoodOrder {
    String name;
    int foodTotal = 0;

    FoodOrder(String name) {
        this.name = name;
    }

    void addFood(int price) {
        foodTotal += price;
    }

    void finalbillfood() {
        System.out.println(name);
        System.out.println(foodTotal);
        if (foodTotal <= 50) {
            foodTotal += 20;
            System.out.println("20");
            System.out.println(foodTotal);
        } else if (foodTotal > 50 && foodTotal <= 150) {
            foodTotal += 10;
            System.out.println("10");
            System.out.println(foodTotal);
        } else {
            foodTotal += 0;
            System.out.println("0");
            System.out.println(foodTotal);
        }
    }
}

public class Quiz3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int n = scan.nextInt();
        FoodOrder order = new FoodOrder(name);
        for (int i = 0; i < n; i++) {
            int price = scan.nextInt();
            order.addFood(price);
        }
        order.finalbillfood();
    }
}
