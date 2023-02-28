package Class_Programming;

import java.util.Scanner;

class FoodTiger {
    String name;
    int nFoods = 0;

    FoodTiger(String name) {
        this.name = name;
    }

    boolean addFood() {
        if (nFoods < 5) {
            nFoods++;
            System.out.print(nFoods + " ");
            return true;
        } else {
            System.out.print("-1" + " ");
            return false;
        }
    }

    void printInfo() {
        System.out.println(name + " " + nFoods);
    }

}

public class Quiz04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FoodTiger fs[] = new FoodTiger[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            fs[i] = new FoodTiger(name);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int s = scan.nextInt();
            boolean ret = fs[s - 1].addFood();
            System.out.println(ret);
        }

        for (int i = 0; i < n; i++) {
            fs[i].printInfo();
        }
    }

}
