package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMult {
    long[] correct = {1790130205759896L};
    long start;
    int i;

    @BeforeEach
    public void start() {
        start = System.currentTimeMillis();
    }

    @AfterEach
    public void end() {
        System.out.println("При " + (int) Math.pow(10, i) + " чисел, время работы: " + (System.currentTimeMillis() - start) + " мс");
    }

    @Test
    void Test_mult1() throws Exception {
        i = 1;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App.mult(arr);
        if (result == -1) {
            System.out.println("В тесте " + i + " значение произведения больше чем максимальный long");
        } else {
            assertEquals(correct[i - 1], result);
        }
    }
    @Test
    void Test_mult2() throws Exception {
        i = 2;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App.mult(arr);
        if (result == -1) {
            System.out.println("В тесте " + i + " значение произведения больше чем максимальный long");
        } else {
            assertEquals(correct[i - 1], result);
        }
    }
    @Test
    void Test_mult3() throws Exception {
        i = 3;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App.mult(arr);
        if (result == -1) {
            System.out.println("В тесте " + i + " значение произведения больше чем максимальный long");
        } else {
            assertEquals(correct[i - 1], result);
        }
    }
    @Test
    void Test_mult4() throws Exception {
        i = 4;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App.mult(arr);
        if (result == -1) {
            System.out.println("В тесте " + i + " значение произведения больше чем максимальный long");
        } else {
            assertEquals(correct[i - 1], result);
        }
    }
    @Test
    void Test_mult5() throws Exception {
        i = 5;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App.mult(arr);
        if (result == -1) {
            System.out.println("В тесте " + i + " значение произведения больше чем максимальный long");
        } else {
            assertEquals(correct[i - 1], result);
        }
    }
    @Test
    void Test_mult6() throws Exception {
        i = 6;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App.mult(arr);
        if (result == -1) {
            System.out.println("В тесте " + i + " значение произведения больше чем максимальный long");
        } else {
            assertEquals(correct[i - 1], result);
        }
    }
}