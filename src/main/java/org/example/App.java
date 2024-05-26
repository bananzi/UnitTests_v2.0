package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите путь к файлу: ");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        in.close();

        Scanner scanner = null;
        try {
            scanner = scanFile(path);
        } catch (FileNotFoundException e) {
            System.out.println("Вы указали путь не к файлу или его не существует");
            System.exit(0);
        }

        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            int temp = scanner.nextInt();
            arr.add(temp);
        }
        scanner.close();

        int result1 = App.min(arr);
        int result2 = App.max(arr);
        long result3 = App.sum(arr);
        long result4 = App.mult(arr);

        System.out.println("min: " + result1);
        System.out.println("max: " + result2);
        if (result3 == -1) {
            System.out.println("Сумма больше чем long");
        } else {
            System.out.println("sum: " + result3);
        }
        if (result4 == -1) {
            System.out.println("Произведение больше чем long");
        } else {
            System.out.println("mult: " + result4);
        }
    }

    static Scanner scanFile(String path) throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(new File(path));
        return scanner;
    }

    static int min(List<Integer> arr) { //максимальное число
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int max(List<Integer> arr) { //минимальное число
        int max = -1;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    static long sum(List<Integer> arr) { //сумма всех чисел
        try {
            long sum = 0;
            for (int i : arr) {
                sum += i;
                if (sum < 0) throw new Exception();
            }
            return sum;
        } catch (Exception e) {
            return -1;
        }

    }

    static long mult(List<Integer> arr) { //произведение всех чисел
        try {
            long mult = 1;
            for (int i : arr) {
                mult *= i;
                if (mult < 0) throw new Exception();
            }
            return mult;
        } catch (Exception e) {
            return -1;
        }
    }

}