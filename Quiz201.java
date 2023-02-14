package String;

import java.util.Scanner;

public class Quiz201 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        int count_high = 0;
        int count_low = 0;
        for (int i = 0; i < c.length(); i++) {
            boolean check = Character.isUpperCase(c.charAt(i));
            if (check == true) {
                System.out.print("1");
                count_high++;

            } else if (check == false) {
                System.out.print("0");
                count_low++;
            }
        }
        System.out.println("");
        System.out.println(count_low);
        System.out.println(count_high);
    }
}
