package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            showOneLine(n, i);
        }

        for (int i = n -1; i >= 1; i--) {
            showOneLine(n, i);
        }
    }

    private static void showOneLine(int n, int i) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
