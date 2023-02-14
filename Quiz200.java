package String;

import java.util.Scanner;

public class Quiz200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String c = scan.nextLine();
            boolean check = Character.isUpperCase(c.charAt(0));
            if (check == true) {
                System.out.println("1");
            } else if (check == false) {
                System.out.println("0");
            }
        }
    }
}
