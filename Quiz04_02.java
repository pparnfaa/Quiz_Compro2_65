package Class_Programming;

import java.util.Scanner;

class FoodTiger2 {
    String name;
    int nFoods = 0;
    String menu[] = new String[5];

    FoodTiger2(String name) {
        this.name = name;
    }

    boolean addFood(String foodname) {
        if (nFoods < 5) {
            nFoods++;
            System.out.print(nFoods + " ");
            menu[nFoods - 1] = foodname;
            return true;
        } else {
            System.out.print("-1" + " ");
            return false;
        }
    }

    void printInfo() {
        System.out.print(name + " ");
        for (int i = 0; i < nFoods; i++) {
            System.out.print(menu[i] + " ");
        }
        System.out.println();
    }

}

public class Quiz04_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FoodTiger2 fs[] = new FoodTiger2[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            fs[i] = new FoodTiger2(name);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int s = scan.nextInt();
            String foodname = scan.next();
            boolean ret = fs[s - 1].addFood(foodname);
            System.out.println(ret);
        }

        for (int i = 0; i < n; i++) {
            fs[i].printInfo();
        }
    }
}
