package pl.lukasz.nowy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sum();

        System.out.println("Suma przetworzonych liczb: " + result);
    }
}
