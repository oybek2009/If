package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        //IF tanlash operatori

        Scanner scanner = new Scanner(in);
        System.out.println("Tamaki mahsulotlar do`koni");
        while (true) {
            System.out.print("Yoshinggizni kiriting: ");
            int yosh = scanner.nextInt();

            if (yosh >= 18) {
                System.out.println("Hush kelibsiz");
            } else {
                System.out.println("Siz hali yoshsiz!!!");

            }
        }
    }
}
