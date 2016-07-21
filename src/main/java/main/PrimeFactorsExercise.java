package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorsExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> result = generate(n);
        for (int now : result) {
            System.out.print(now + " ");
        }
    }

    private static List<Integer> generate(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return result;
    }

}
