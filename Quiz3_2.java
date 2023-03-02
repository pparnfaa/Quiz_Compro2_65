package Class_Programming;

import java.util.Scanner;

class FoodOrder2 {
    String name;
    int foodTotal = 0;
    int grandTotal = 0;

    FoodOrder2(String name) {
        this.name = name;
    }

    void addFood(int price) {
        foodTotal += price;
    }

    void finalbillfood() {
        System.out.println(name);
        System.out.println(foodTotal);
        if (foodTotal <= 50) {
            System.out.println("20");
            grandTotal = foodTotal;
            grandTotal += 20;
            System.out.println(grandTotal);
        } else if (foodTotal > 50 && foodTotal <= 150) {
            System.out.println("10");
            grandTotal = foodTotal;
            grandTotal += 10;
            System.out.println(grandTotal);
        } else {
            System.out.println("0");
            grandTotal = foodTotal;
            grandTotal += 0;
            System.out.println(grandTotal);
        }
    }

    void printinfo() {
        if (foodTotal <= 200) {
            System.out.println("Rider: " + 20);
            System.out.println("Grab Panda: " + (foodTotal * 3) / 10);
            System.out.println("Food Seller: " + (grandTotal - (20 + ((foodTotal * 3) / 10))));
        } else {
            System.out.println("Rider: " + 30);
            System.out.println("Grab Panda: " + (foodTotal * 3) / 10);
            System.out.println("Food Seller: " + (grandTotal - (30 + ((foodTotal * 3) / 10))));
        }
    }
}

public class Quiz3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int n = scan.nextInt();
        FoodOrder2 order = new FoodOrder2(name);
        for (int i = 0; i < n; i++) {
            int price = scan.nextInt();
            order.addFood(price);
        }
        order.finalbillfood();
        order.printinfo();
    }
}
